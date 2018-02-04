package com.handsome.projectnz.View.Home.Statistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Statistics.EmployeeStatisticsAdapter;
import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

//用工统计
public class EmployeeStatisticsActivity extends BaseActivity{
    private Spinner spinner;
    private TextView tv_sum;//合计工资
    private ListView lv;
    private EmployeeStatisticsAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_employee_statistics;
    }

    @Override
    public void initViews() {
        spinner=findView(R.id.spinner);
        tv_sum=findView(R.id.sum);
        lv=findView(R.id.lv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitleCanBack();
        setTitle("用工统计");
        List<Employee> list=new ArrayList<>();
        Employee employee=new Employee();
        employee.setEmployee_name("Diko");
        employee.setPhone("17875511856");
        employee.setE_mail("1198611857@qq.com");
        employee.setComment("XXXXXXXXX");
        employee.setCompany("嘉应学院");
        employee.setDepartment("计算机学院");
        employee.setPosition("软件设计师");
        employee.setWork_date("2年");
        employee.setSalary(20000);
        employee.setType("内部员工");
        list.add(employee);
        Employee employee1=new Employee();
        employee1.setEmployee_name("Adah");
        employee1.setPhone("17875511xxx");
        employee1.setE_mail("1198611857@qq.com");
        employee1.setComment("XXXXXXXXX");
        employee1.setCompany("嘉应学院");
        employee1.setDepartment("计算机学院");
        employee1.setPosition("软件设计师");
        employee1.setWork_date("2年");
        employee1.setSalary(20000);
        employee1.setType("内部员工");
        list.add(employee1);
        Employee employee2=new Employee();
        employee2.setEmployee_name("yx");
        employee2.setPhone("17875511xxx");
        employee2.setE_mail("1198611857@qq.com");
        employee2.setComment("300元/工日");
        employee2.setCompany("嘉应学院");
        employee2.setDepartment("计算机学院");
        employee2.setPosition("搬砖工");
        employee2.setWork_date("10日工");
        employee2.setSalary(3000);
        employee2.setType("外请员工");
        list.add(employee2);
        Employee employee3=new Employee();
        employee3.setEmployee_name("cj");
        employee3.setPhone("17875511xxx");
        employee3.setE_mail("1198611857@qq.com");
        employee3.setComment("200元/日工");
        employee3.setCompany("嘉应学院");
        employee3.setDepartment("计算机学院");
        employee3.setPosition("砌墙工");
        employee3.setWork_date("20日工");
        employee3.setSalary(4000);
        employee3.setType("外请员工");
        list.add(employee3);

        adapter=new EmployeeStatisticsAdapter(this,list);
        lv.setAdapter(adapter);
        int sum=0;
        for (Employee e:list){
            sum+=e.getSalary();
        }
        tv_sum.setText(sum+"");

    }

    @Override
    public void processClick(View v) {

    }
}
