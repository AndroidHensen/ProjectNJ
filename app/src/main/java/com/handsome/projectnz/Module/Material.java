package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 柯东煜 on 2018/1/27.
 */

public class Material implements Parcelable {
    private String name;//物资名称
    private String type;//物资类型
    private String department;//物资单位
    private int inputCount;//入库数量
    private int outputCount;//出库数量
    private int keepCount;//存库数量
    private String source;//来源，提供者

    public int getKeepCount() {
        return keepCount;
    }

    public void setKeepCount(int keepCount) {
        this.keepCount = keepCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getInputCount() {
        return inputCount;
    }

    public void setInputCount(int inputCount) {
        this.inputCount = inputCount;
    }

    public int getOutputCount() {
        return outputCount;
    }

    public void setOutputCount(int outputCount) {
        this.outputCount = outputCount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Material() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.department);
        dest.writeInt(this.inputCount);
        dest.writeInt(this.outputCount);
        dest.writeInt(this.keepCount);
        dest.writeString(this.source);
    }

    protected Material(Parcel in) {
        this.name = in.readString();
        this.type = in.readString();
        this.department = in.readString();
        this.inputCount = in.readInt();
        this.outputCount = in.readInt();
        this.keepCount = in.readInt();
        this.source = in.readString();
    }

    public static final Creator<Material> CREATOR = new Creator<Material>() {
        public Material createFromParcel(Parcel source) {
            return new Material(source);
        }

        public Material[] newArray(int size) {
            return new Material[size];
        }
    };
}
