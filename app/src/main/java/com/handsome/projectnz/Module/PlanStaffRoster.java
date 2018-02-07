package com.handsome.projectnz.Module;

/**
 * Created by jie on 2018/2/7.
 */

public class PlanStaffRoster {
    private String name;//名字
    private String station;//岗位
    private String phone;//手机号码
    private String email;//邮箱
    private String category;//人员类别

    public PlanStaffRoster(String name, String station, String phone, String email, String category) {
        this.name = name;
        this.station = station;
        this.phone = phone;
        this.email = email;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
