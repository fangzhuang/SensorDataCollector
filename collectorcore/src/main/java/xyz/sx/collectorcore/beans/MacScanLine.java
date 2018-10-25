package xyz.sx.collectorcore.beans;

import java.util.List;

public class MacScanLine {
    private long timestamp;
    private List<MacBean> data;

    public MacScanLine(long timestamp, List<MacBean> data) {
        this.timestamp = timestamp;
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public List<MacBean> getData() {
        return data;
    }

    public String dump() {
        StringBuilder builder = new StringBuilder();
        builder.append(timestamp);
        for (MacBean mb : data)
            builder.append(",").append(mb.dump());
        return builder.toString();
    }
}
