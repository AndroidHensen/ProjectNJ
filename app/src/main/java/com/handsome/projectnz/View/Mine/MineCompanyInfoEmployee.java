package com.handsome.projectnz.View.Mine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Mine.CompanyInfoEmployeeAdapter;
import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class MineCompanyInfoEmployee extends BaseActivity {
    private ListView lv_employee;
    private CompanyInfoEmployeeAdapter adapter;
    private List<Employee> lists;
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_company_info_employee;
    }

    @Override
    public void initViews() {
        lv_employee=findView(R.id.lv);
    }

    @Override
    public void initListener() {
        lists=new ArrayList<>();
        Employee employee=new Employee();
        employee.setEmployee_name("Diko");
        employee.setPhone("17875511856");
        employee.setE_mail("1198611857@qq.com");
        employee.setComment("XXXXXXXXX");
        employee.setCompany("嘉应学院");
        employee.setDepartment("计算机学院");
        employee.setPosition("软件设计师");
        lists.add(employee);
        Employee employee1=new Employee();
        employee1.setEmployee_name("adah。。");
        employee1.setPhone("17875511XXX");
        employee1.setE_mail("1198611857@qq.com");
        employee1.setComment("XXXXXXXXX");
        employee1.setCompany("嘉应学院");
        employee1.setDepartment("计算机学院");
        employee1.setPosition("软件设计师");
        lists.add(employee1);
        adapter=new CompanyInfoEmployeeAdapter(this,lists);
        lv_employee.setAdapter(adapter);
    }

    @Override
    public void initData() {
        setTitle("人员库");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
