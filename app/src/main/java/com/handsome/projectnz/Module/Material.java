package com.handsome.projectnz.Module;

/**
 * Created by 柯东煜 on 2018/1/27.
 */

public class Material {
    private String name;//物资名称
    private String type;//物资类型
    private String department;//物资单位
    private int inputCount;//入库数量
    private int outputCount;//出库数量
    private int keepCount;//存库数量

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
}
