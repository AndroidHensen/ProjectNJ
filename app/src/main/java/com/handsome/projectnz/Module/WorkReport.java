package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/2.
 */

public class WorkReport {
    private String title_content;//标题
    private String time;//时间
    private String work_content;//内容
    private Boolean read_state;//阅读状态


    public WorkReport(String title_content, String time, String work_content, Boolean read_state) {
        this.title_content = title_content;
        this.time = time;
        this.work_content = work_content;
        this.read_state = read_state;
    }

    public String getTitle_content() {
        return title_content;
    }

    public void setTitle_content(String title_content) {
        this.title_content = title_content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWork_content() {
        return work_content;
    }

    public void setWork_content(String work_content) {
        this.work_content = work_content;
    }

    public Boolean getRead_state() {
        return read_state;
    }

    public void setRead_state(Boolean read_state) {
        this.read_state = read_state;
    }
}
