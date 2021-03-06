package xyz.sx.collectorcore.providers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Log;
import xyz.sx.collectorcore.BaseProvider;
import xyz.sx.collectorcore.BaseSensorData;
import xyz.sx.collectorcore.datas.ArraySensorData;
import xyz.sx.collectorcore.protobuf.Macinfo;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class WiFiScanProvider extends BaseProvider {
    private ArraySensorData<Macinfo.MacScanLine> mData;
    private Context mContext;
    private WifiManager mWiFiManager;
    private BroadcastReceiver mWiFiReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            boolean res = intent.getBooleanExtra(WifiManager.EXTRA_RESULTS_UPDATED, false);
            if (res)
                doCollect();
            else
                Log.d(TAG, "Scan Failed..." + System.currentTimeMillis());
            if (isRunning())
                mWiFiManager.startScan();
        }
    };

    public WiFiScanProvider(Context context) {
        mData = new ArraySensorData<>(BaseSensorData.DataType.TYPE_WIFI, 1000);
        mContext = context;
    }

    @Override
    public BaseSensorData getData() {
        return mData;
    }

    @Override
    protected void destroy() {
        mContext.unregisterReceiver(mWiFiReceiver);
    }

    @Override
    protected void init() {
        mWiFiManager = (WifiManager) mContext.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION);
        mContext.registerReceiver(mWiFiReceiver, intentFilter);
        mWiFiManager.startScan();
    }


    private void doCollect() {
        List<ScanResult> results = mWiFiManager.getScanResults();
        List<Macinfo.MacPair> line = new ArrayList<>();
        for (ScanResult sr : results)
            line.add(Macinfo.MacPair.newBuilder().setMac(sr.BSSID).setRssi(sr.level).build());
        mData.add(Macinfo.MacScanLine.newBuilder().setTimestamp(System.currentTimeMillis()).addAllData(line).build());
    }
}
