package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by YX_PC on 2018/1/16.
 */


public class WorkTaskProjectMessage implements Parcelable {

    private String project_status;//状态(项目任务)
    private String arrange_people;//安排人
    private String project_schedule_status; //进度状态(项目任务)
    private String project_time;  //时间(项目任务)
    private String over_date;//超期
    private String work_date;//工时

    public WorkTaskProjectMessage(String project_status, String arrange_people, String project_schedule_status, String project_time, String over_date, String work_date) {
        this.project_status = project_status;
        this.arrange_people = arrange_people;
        this.project_schedule_status = project_schedule_status;
        this.project_time = project_time;
        this.over_date = over_date;
        this.work_date = work_date;
    }


    public static final Creator<WorkTaskProjectMessage> CREATOR = new Creator<WorkTaskProjectMessage>() {
        @Override
        public WorkTaskProjectMessage createFromParcel(Parcel in) {
            return new WorkTaskProjectMessage(in);
        }

        @Override
        public WorkTaskProjectMessage[] newArray(int size) {
            return new WorkTaskProjectMessage[size];
        }
    };

    public String getProject_status() {
        return project_status;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
    }

    public String getArrange_people() {
        return arrange_people;
    }

    public void setArrange_people(String arrange_people) {
        this.arrange_people = arrange_people;
    }

    public String getProject_schedule_status() {
        return project_schedule_status;
    }

    public void setProject_schedule_status(String project_schedule_status) {
        this.project_schedule_status = project_schedule_status;
    }

    public String getProject_time() {
        return project_time;
    }

    public void setProject_time(String project_time) {
        this.project_time = project_time;
    }

    public String getOver_date() {
        return over_date;
    }

    public void setOver_date(String over_date) {
        this.over_date = over_date;
    }

    public String getWork_date() {
        return work_date;
    }

    public void setWork_date(String work_date) {
        this.work_date = work_date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.project_status);
        dest.writeString(this.arrange_people);
        dest.writeString(this.project_schedule_status);
        dest.writeString(this.project_time);
        dest.writeString(this.over_date);
        dest.writeString(this.work_date);
    }

    protected WorkTaskProjectMessage(Parcel in) {
        this.project_status = in.readString();
        this.arrange_people = in.readString();
        this.project_schedule_status = in.readString();
        this.project_time = in.readString();
        this.over_date = in.readString();
        this.work_date = in.readString();
    }
}
