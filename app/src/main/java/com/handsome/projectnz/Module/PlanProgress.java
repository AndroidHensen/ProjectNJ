package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/1.
 */

public class PlanProgress {
    private String work_content;//工作内容
    private String task_kind;//任务类型
    private String manager;//负责人
    private String tv_start_time;//派工日期，验收日期
    private String allwork_time;//工期
    private String workload;//工作量
    private String progress;//进度
    private String over_time;//超期

    public PlanProgress(String work_content, String task_kind, String manager, String tv_start_time, String allwork_time, String workload, String progress, String over_time) {
        this.work_content = work_content;
        this.task_kind = task_kind;
        this.manager = manager;
        this.tv_start_time = tv_start_time;
        this.allwork_time = allwork_time;
        this.workload = workload;
        this.progress = progress;
        this.over_time = over_time;
    }

    public String getWork_content() {
        return work_content;
    }

    public String getTask_kind() {
        return task_kind;
    }

    public String getManager() {
        return manager;
    }

    public String getTv_start_time() {
        return tv_start_time;
    }

    public String getAllwork_time() {
        return allwork_time;
    }

    public String getWorkload() {
        return workload;
    }

    public String getProgress() {
        return progress;
    }

    public String getOver_time() {
        return over_time;
    }

    public void setWork_content(String work_content) {
        this.work_content = work_content;
    }

    public void setTask_kind(String task_kind) {
        this.task_kind = task_kind;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setTv_start_time(String tv_start_time) {
        this.tv_start_time = tv_start_time;
    }

    public void setAllwork_time(String allwork_time) {
        this.allwork_time = allwork_time;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public void setOver_time(String over_time) {
        this.over_time = over_time;
    }
}
