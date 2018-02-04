package com.handsome.projectnz.Fragment.Project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.ProjectBuilderView;
import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.R;

public class ProjectDetailBuilderFragment extends BaseLazyFragment {
    private ProjectBuilderView pbv_owner;
    private ProjectBuilderView pbv_designer;
    private ProjectBuilderView pbv_checker;
    private ProjectBuilderView pbv_contract;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project_detail_builder;
    }

    @Override
    public void initViews() {
        pbv_owner=findView(R.id.owner);
        pbv_designer=findView(R.id.designer);
        pbv_checker=findView(R.id.checker);
        pbv_contract=findView(R.id.contract);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        Employee employee=new Employee();
        employee.setEmployee_name("Diko");
        employee.setPhone("17875511856");
        employee.setE_mail("1198611857@qq.com");
        employee.setComment("XXXXXXXXX");
        employee.setCompany("嘉应学院");
        employee.setDepartment("计算机学院");
        employee.setPosition("软件设计师");
        Employee employee1=new Employee();
        employee1.setEmployee_name("adah。。。。。。。");
        employee1.setPhone("17875511XXX");
        employee1.setE_mail("1198611857@qq.com");
        employee1.setComment("XXXXXXXXX");
        employee1.setCompany("嘉应学院");
        employee1.setDepartment("计算机学院");
        employee1.setPosition("软件设计师");
        pbv_owner.addBuidler(employee);
        pbv_owner.addBuidler(employee1);
        pbv_contract.addBuidler(employee1);
        pbv_designer.addBuidler(employee1);
        pbv_checker.addBuidler(employee1);
    }

    @Override
    public void processClick(View v) {

    }
}