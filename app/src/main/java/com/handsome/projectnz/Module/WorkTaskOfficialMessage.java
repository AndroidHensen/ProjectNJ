package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by YX_PC on 2018/1/16.
 */


public class WorkTaskOfficialMessage implements Parcelable {

    private String department;    //部门
    private String official_status;    //状态(办公任务)
    private String official_time; //时间(办公任务)
    private String content;  //内容
    private String official_schedule_status;//进度状态(办公任务)


    public WorkTaskOfficialMessage(String department, String official_status, String official_time, String content, String official_schedule_status) {
        this.department = department;
        this.official_status = official_status;
        this.official_time = official_time;
        this.content = content;
        this.official_schedule_status = official_schedule_status;
    }

    public static final Creator<WorkTaskOfficialMessage> CREATOR = new Creator<WorkTaskOfficialMessage>() {
        @Override
        public WorkTaskOfficialMessage createFromParcel(Parcel in) {
            return new WorkTaskOfficialMessage(in);
        }

        @Override
        public WorkTaskOfficialMessage[] newArray(int size) {
            return new WorkTaskOfficialMessage[size];
        }
    };

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficial_status() {
        return official_status;
    }

    public void setOfficial_status(String official_status) {
        this.official_status = official_status;
    }

    public String getOfficial_time() {
        return official_time;
    }

    public void setOfficial_time(String official_time) {
        this.official_time = official_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOfficial_schedule_status() {
        return official_schedule_status;
    }


    public void setOfficial_schedule_status(String official_schedule_status) {
        this.official_schedule_status = official_schedule_status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.department);
        dest.writeString(this.official_status);
        dest.writeString(this.official_time);
        dest.writeString(this.content);
        dest.writeString(this.official_schedule_status);
    }

    protected WorkTaskOfficialMessage(Parcel in) {
        this.department = in.readString();
        this.official_status = in.readString();
        this.official_time = in.readString();
        this.content = in.readString();
        this.official_schedule_status = in.readString();
    }

}
