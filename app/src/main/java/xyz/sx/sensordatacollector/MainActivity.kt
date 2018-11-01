package xyz.sx.sensordatacollector

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import xyz.sx.collectorcore.CollectorContext
import xyz.sx.sensordatacollector.databinding.ActivityMainBinding
import java.io.File
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mCollectContext: CollectorContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val path = Environment.getExternalStorageDirectory().absolutePath + "/samples/"
        val file = File(path)
        if (!file.exists())
            file.mkdirs()

        CollectorContext.getInstance().init(applicationContext,true)
        mCollectContext = CollectorContext.getInstance()
        mCollectContext.setOnCollectDataListener {
            runOnUiThread { mBinding.sensorsTxt.append("${System.currentTimeMillis()}\n") }
        }
        mCollectContext.start()
    }

    override fun onDestroy() {
        mCollectContext.destroy()
        super.onDestroy()
    }
}
