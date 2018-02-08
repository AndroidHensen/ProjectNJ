package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/7.
 */

public class ApplyCommon {
    private String title;//标题
    private String time;//时间
    private String status;//检查状态

    public ApplyCommon(String title, String time, String status) {
        this.title = title;
        this.time = time;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
