package com.handsome.projectnz.Module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 柯东煜 on 2018/1/14.
 * 对应主界面-消息-实体类
 */


public class Message implements Parcelable {
    private String title;//消息的标题
    private boolean read_state;//消息的标题
    private String content;//消息内容
    private String data;//消息日期
    private String operation;//操作

    public Message() {
    }

    /**
     * @param title     消息的标题
     * @param state     消息是否已读 true为已读
     * @param content   消息内容
     * @param data      消息日期
     * @param operation 操作
     */
    public Message(String title, boolean state, String content, String data, String operation) {
        this.title = title;
        this.read_state = state;
        this.content = content;
        this.data = data;
        this.operation = operation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRead_state() {
        return read_state;
    }

    public void setRead_state(boolean read_state) {
        this.read_state = read_state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeByte(read_state ? (byte) 1 : (byte) 0);
        dest.writeString(this.content);
        dest.writeString(this.data);
        dest.writeString(this.operation);
    }

    protected Message(Parcel in) {
        this.title = in.readString();
        this.read_state = in.readByte() != 0;
        this.content = in.readString();
        this.data = in.readString();
        this.operation = in.readString();
    }

    public static final Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>() {
        public Message createFromParcel(Parcel source) {
            return new Message(source);
        }

        public Message[] newArray(int size) {
            return new Message[size];
        }
    };
}