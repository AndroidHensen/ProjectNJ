package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/8.
 */

public class OptionProject {
    private String item;//项目名
    private String work_kind;//工作类别
    private String item_kind;//项目类别
    private String work_day;//工作时间
    private String progress;//项目进度
    private String manager;//项目经理

    public OptionProject(String item, String work_kind, String item_kind, String work_day, String progress, String manager) {
        this.item = item;
        this.work_kind = work_kind;
        this.item_kind = item_kind;
        this.work_day = work_day;
        this.progress = progress;
        this.manager = manager;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getWork_kind() {
        return work_kind;
    }

    public void setWork_kind(String work_kind) {
        this.work_kind = work_kind;
    }

    public String getItem_kind() {
        return item_kind;
    }

    public void setItem_kind(String item_kind) {
        this.item_kind = item_kind;
    }

    public String getWork_day() {
        return work_day;
    }

    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
