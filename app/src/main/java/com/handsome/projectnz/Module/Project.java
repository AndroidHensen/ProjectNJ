package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 柯东煜 on 2018/1/15.
 */

public class Project implements Parcelable {
    private String engineeringName;//工程名称
    private String engineeringType;//工程类别
    private String engineeringNum;//工程编号
    private String constructionUnit;//施工单位
    private String projectName;//项目名称
    private String projectType;//项目类型
    private String location;//所属区域
    private String projectAddress;//项目地址
    private int difficulty;//项目难度
    private long projectStartTime;//开工时间
    private long projectEndTime;//截止时间
    private int timeLimit;//工期
    private String projectManager;//项目负责人，项目经理
    private String projectSummary;//项目概况
    private String initiator;//发起人
    private String auditor;//审核方
    private int projectProgress;//项目进展  开始为0，完成为100
    private int projectState;//项目状态  ，例如：正在进行中，归档，未归档，已销档等等

    public Project() {

    }

    public String getEngineeringName() {
        return engineeringName;
    }

    public void setEngineeringName(String engineeringName) {
        this.engineeringName = engineeringName;
    }

    public String getEngineeringType() {
        return engineeringType;
    }

    public void setEngineeringType(String engineeringType) {
        this.engineeringType = engineeringType;
    }

    public String getEngineeringNum() {
        return engineeringNum;
    }

    public void setEngineeringNum(String engineeringNum) {
        this.engineeringNum = engineeringNum;
    }

    public String getConstructionUnit() {
        return constructionUnit;
    }

    public void setConstructionUnit(String constructionUnit) {
        this.constructionUnit = constructionUnit;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public long getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(long projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public long getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(long projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public int getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(int projectProgress) {
        this.projectProgress = projectProgress;
    }

    public int getProjectState() {
        return projectState;
    }

    public void setProjectState(int projectState) {
        this.projectState = projectState;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.engineeringName);
        dest.writeString(this.engineeringType);
        dest.writeString(this.engineeringNum);
        dest.writeString(this.constructionUnit);
        dest.writeString(this.projectName);
        dest.writeString(this.projectType);
        dest.writeString(this.location);
        dest.writeString(this.projectAddress);
        dest.writeInt(this.difficulty);
        dest.writeLong(this.projectStartTime);
        dest.writeLong(this.projectEndTime);
        dest.writeInt(this.timeLimit);
        dest.writeString(this.projectManager);
        dest.writeString(this.projectSummary);
        dest.writeString(this.initiator);
        dest.writeString(this.auditor);
        dest.writeInt(this.projectProgress);
        dest.writeInt(this.projectState);
    }

    protected Project(Parcel in) {
        this.engineeringName = in.readString();
        this.engineeringType = in.readString();
        this.engineeringNum = in.readString();
        this.constructionUnit = in.readString();
        this.projectName = in.readString();
        this.projectType = in.readString();
        this.location = in.readString();
        this.projectAddress = in.readString();
        this.difficulty = in.readInt();
        this.projectStartTime = in.readLong();
        this.projectEndTime = in.readLong();
        this.timeLimit = in.readInt();
        this.projectManager = in.readString();
        this.projectSummary = in.readString();
        this.initiator = in.readString();
        this.auditor = in.readString();
        this.projectProgress = in.readInt();
        this.projectState = in.readInt();
    }

    public static final Parcelable.Creator<Project> CREATOR = new Parcelable.Creator<Project>() {
        public Project createFromParcel(Parcel source) {
            return new Project(source);
        }

        public Project[] newArray(int size) {
            return new Project[size];
        }
    };
}
