package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialIORecord implements Parcelable {
    private String date;//日期
    private String handler;//操纵人
    private int count;//数量
    private String belong;//材料提供者

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeString(this.handler);
        dest.writeInt(this.count);
        dest.writeString(this.belong);
    }

    public MaterialIORecord() {
    }

    protected MaterialIORecord(Parcel in) {
        this.date = in.readString();
        this.handler = in.readString();
        this.count = in.readInt();
        this.belong = in.readString();
    }

    public static final Parcelable.Creator<MaterialIORecord> CREATOR = new Parcelable.Creator<MaterialIORecord>() {
        public MaterialIORecord createFromParcel(Parcel source) {
            return new MaterialIORecord(source);
        }

        public MaterialIORecord[] newArray(int size) {
            return new MaterialIORecord[size];
        }
    };
}
