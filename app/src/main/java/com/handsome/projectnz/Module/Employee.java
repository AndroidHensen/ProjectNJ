package com.handsome.projectnz.Module;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class Employee {
    private String employee_name;//姓名
    private String position;//职位
    private String phone;//联系号码
    private String e_mail;//邮箱
    private String company;//公司
    private String department;//部门
    private String comment;//描述，备注
    private int salary;//工资//月薪
    private String type;//类别
    private String work_date;//工作时长

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWork_date() {
        return work_date;
    }

    public void setWork_date(String wrok_date) {
        this.work_date = wrok_date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
