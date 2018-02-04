package com.handsome.projectnz.Module;

/**
 * Created by Diko（柯东煜） on 2018/1/29.
 */

public class Task {
    private String taskName;//任务名称
    private String taskType;//任务类型
    private String taskBelongProject;//所属项目
    private String taskPriority;//优先权
    private String taskAddress;//任务地址
    private String taskStartTime;//开始时间
    private String taskEndTime;//结束时间
    private String executePerson;//执行人
    private String taskSummary;//任务概述
    private String taskNotice;//注意事项
    private int taskLimitTime;//工期
    private int taskProgress=0;//项目进度  0为最小  100为完成

    public int getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(int taskProgress) {
        this.taskProgress = taskProgress;
    }

    public int getTaskLimitTime() {
        return taskLimitTime;
    }

    public void setTaskLimitTime(int taskLimitTime) {
        this.taskLimitTime = taskLimitTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskBelongProject() {
        return taskBelongProject;
    }

    public void setTaskBelongProject(String taskBelongProject) {
        this.taskBelongProject = taskBelongProject;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(String taskAddress) {
        this.taskAddress = taskAddress;
    }

    public String getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public String getExecutePerson() {
        return executePerson;
    }

    public void setExecutePerson(String executePerson) {
        this.executePerson = executePerson;
    }

    public String getTaskSummary() {
        return taskSummary;
    }

    public void setTaskSummary(String taskSummary) {
        this.taskSummary = taskSummary;
    }

    public String getTaskNotice() {
        return taskNotice;
    }

    public void setTaskNotice(String taskNotice) {
        this.taskNotice = taskNotice;
    }
}
