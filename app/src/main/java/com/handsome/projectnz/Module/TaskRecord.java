package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class TaskRecord implements Parcelable {
    private String taskArranger;//任务安排者
    private String taskExecute;//任务执行者
    private int taskCount;//任务总数
    private int taskFinish;//完成数量


    public String getTaskArranger() {
        return taskArranger;
    }

    public void setTaskArranger(String taskArranger) {
        this.taskArranger = taskArranger;
    }

    public String getTaskExecute() {
        return taskExecute;
    }

    public void setTaskExecute(String taskExecute) {
        this.taskExecute = taskExecute;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public int getTaskFinish() {
        return taskFinish;
    }

    public void setTaskFinish(int taskFinish) {
        this.taskFinish = taskFinish;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.taskArranger);
        dest.writeString(this.taskExecute);
        dest.writeInt(this.taskCount);
        dest.writeInt(this.taskFinish);
    }

    public TaskRecord() {
    }

    protected TaskRecord(Parcel in) {
        this.taskArranger = in.readString();
        this.taskExecute = in.readString();
        this.taskCount = in.readInt();
        this.taskFinish = in.readInt();
    }

    public static final Parcelable.Creator<TaskRecord> CREATOR = new Parcelable.Creator<TaskRecord>() {
        public TaskRecord createFromParcel(Parcel source) {
            return new TaskRecord(source);
        }

        public TaskRecord[] newArray(int size) {
            return new TaskRecord[size];
        }
    };
}
