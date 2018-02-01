package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jie on 2018/1/30.
 * 实体类-对应界面-日常巡查
 */


public class DailyCheck implements Parcelable {
    private String item_number;//项目编号
    private String all_time;//工期
    private String item_name;//项目名称
    private String manager;//管理人
    private String item_character;//工程类别
    private String item_status;//项目状态
    private String detail;//项目详情


    /**
     * @param item_number    项目编号
     * @param all_time       工期
     * @param item_name      项目名称
     * @param manager        管理人
     * @param item_character 工程类别
     * @param item_status    项目状态
     * @param detail         项目详情
     */
    public DailyCheck(String item_number, String all_time, String item_name, String manager, String item_character, String item_status, String detail) {
        this.item_number = item_number;
        this.all_time = all_time;
        this.item_name = item_name;
        this.manager = manager;
        this.item_character = item_character;
        this.item_status = item_status;
        this.detail = detail;
    }

    public String getItem_number() {
        return item_number;
    }

    public String getAll_time() {
        return all_time;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getManager() {
        return manager;
    }

    public String getItem_character() {
        return item_character;
    }

    public String getItem_status() {
        return item_status;
    }

    public String getDetail() {
        return detail;
    }

    public static Creator<DailyCheck> getCREATOR() {
        return CREATOR;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public void setAll_time(String all_time) {
        this.all_time = all_time;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setItem_character(String item_character) {
        this.item_character = item_character;
    }

    public void setItem_status(String item_status) {
        this.item_status = item_status;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    protected DailyCheck(Parcel in) {
        this.item_number = in.readString();
        this.all_time = in.readString();
        this.item_name = in.readString();
        this.manager = in.readString();
        this.item_character = in.readString();
        this.item_status = in.readString();
        this.detail = in.readString();
    }


    public static final Creator<DailyCheck> CREATOR = new Creator<DailyCheck>() {
        @Override
        public DailyCheck createFromParcel(Parcel in) {
            return new DailyCheck(in);
        }

        @Override
        public DailyCheck[] newArray(int size) {
            return new DailyCheck[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.item_number);
        dest.writeString(this.all_time);
        dest.writeString(this.item_name);
        dest.writeString(this.manager);
        dest.writeString(this.item_character);
        dest.writeString(this.item_status);
        dest.writeString(this.detail);
    }
}
