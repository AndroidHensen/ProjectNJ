package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/10.
 */

public class ReturnProjectTask {
    private String data;//日期
    private String meter;//米
    private String progress;//进度

    public ReturnProjectTask(String data, String meter, String progress) {
        this.data = data;
        this.meter = meter;
        this.progress = progress;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
