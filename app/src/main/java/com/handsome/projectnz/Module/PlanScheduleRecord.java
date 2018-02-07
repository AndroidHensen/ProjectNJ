package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/7.
 */

public class PlanScheduleRecord {
    private String time;//时间
    private String name;//名字
    private String distance;//距离
    private String progress;//进度

    public PlanScheduleRecord(String time, String name, String distance, String progress) {
        this.time = time;
        this.name = name;
        this.distance = distance;
        this.progress = progress;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
