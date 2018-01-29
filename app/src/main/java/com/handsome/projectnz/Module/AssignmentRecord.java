package com.handsome.projectnz.Module;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class AssignmentRecord {
    static public int ARRANGE=0;//我安排的
    static public int EXECUTE=1;//我执行的
    private int assignmentType;//类型  ARRANGE为我安排的，EXECUTE为我执行的
    private String assignmentObject;//任务对象
    private int assignmentCount;//任务总数
    private int assignmentFinish;//完成数量

    public int getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(int assignmentType) {
        this.assignmentType = assignmentType;
    }

    public String getAssignmentObject() {
        return assignmentObject;
    }

    public void setAssignmentObject(String assignmentObject) {
        this.assignmentObject = assignmentObject;
    }

    public int getAssignmentCount() {
        return assignmentCount;
    }

    public void setAssignmentCount(int assignmentCount) {
        this.assignmentCount = assignmentCount;
    }

    public int getAssignmentFinish() {
        return assignmentFinish;
    }

    public void setAssignmentFinish(int assignmentFinish) {
        this.assignmentFinish = assignmentFinish;
    }
}
