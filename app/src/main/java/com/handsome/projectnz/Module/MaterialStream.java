package com.handsome.projectnz.Module;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialStream {
    private String streamDate;//流水日期
    private String streamHandler;//流水经办人
    private String belongProject;//流水所属项目
    private int streamCount;//出入库数量

    public String getStreamDate() {
        return streamDate;
    }

    public void setStreamDate(String streamDate) {
        this.streamDate = streamDate;
    }

    public String getStreamHandler() {
        return streamHandler;
    }

    public void setStreamHandler(String streamHandler) {
        this.streamHandler = streamHandler;
    }

    public String getBelongProject() {
        return belongProject;
    }

    public void setBelongProject(String belongProject) {
        this.belongProject = belongProject;
    }

    public int getStreamCount() {
        return streamCount;
    }

    public void setStreamCount(int streamCount) {
        this.streamCount = streamCount;
    }
}
