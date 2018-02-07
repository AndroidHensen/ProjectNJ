package com.handsome.projectnz.View.Home.PlanDetails;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.SecurityCheck.SecurityCheckNewActivity;

import java.util.Calendar;


/**
 * Created by YX_PC on 2018/1/15.
 * 界面：工作台_进度计划_计划详情_编制计划
 */

public class PlanMakeActivity extends BaseActivity {
    private EditText et_project;//项目
    private EditText et_project_style;//项目类型
    private EditText et_task_name;//任务名称
    private RecyclerView rv_task_content;//任务内容
    private EditText et_start_date;//开始日期
    private EditText et_end_date;//截止日期
    private EditText et_work_time;//工期
    private Button btn_car_yes;//是(是否需要使用车辆)
    private Button btn_car_no;//否(是否需要使用车辆)
    private Button btn_appliance_yes;//是(是否需要特殊器械)
    private Button btn_appliance_no;//否(是否需要特殊器械)
    private EditText et_remark;//备注
    private TextView tv_accessory;//附件
    private Button btn_submit;//上传
    private Button btn_commit;//提交

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_make;
    }

    @Override
    public void initViews() {
        et_project=findView(R.id.et_project);
        et_project_style=findView(R.id.et_project_style);
        et_task_name=findView(R.id.et_task_name);
        rv_task_content=findView(R.id.rv_task_content);
        et_start_date=findView(R.id.et_start_date);
        et_end_date=findView(R.id.et_end_date);
        et_work_time=findView(R.id.et_work_time);
        btn_car_yes=findView(R.id.btn_car_yes);
        btn_car_no=findView(R.id.btn_car_no);
        btn_appliance_yes=findView(R.id.btn_appliance_yes);
        btn_appliance_no=findView(R.id.btn_appliance_no);
        et_remark=findView(R.id.et_remark);
        tv_accessory=findView(R.id.tv_accessory);
        btn_submit=findView(R.id.btn_submit);
        btn_commit=findView(R.id.btn_commit);
    }

    @Override
    public void initListener() {
        btn_car_yes.setOnClickListener(this);
        btn_car_no.setOnClickListener(this);
        btn_appliance_yes.setOnClickListener(this);
        btn_appliance_no.setOnClickListener(this);
        et_start_date.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_start_date.setOnClickListener(this);
        et_end_date.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_end_date.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("编制计划");
        setTitleCanBack();
    }


    @Override
    public void processClick(View v) {
       switch (v.getId()){
           case R.id.btn_car_yes:
               btn_car_yes();
               break;
           case R.id.btn_car_no:
               btn_car_no();
               break;
           case R.id.btn_appliance_yes:
               btn_appliance_yes();
               break;
           case R.id.btn_appliance_no:
               btn_appliance_no();
               break;
           case R.id.et_start_date:
               showDatePickerDialog(v);
               break;
           case R.id.et_end_date:
               showDatePickerDialog(v);
               break;
           default:
               break;
       }
    }
    private class myOnfocusChangeListener implements View.OnFocusChangeListener {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                showDatePickerDialog(v);
            }
        }
    }
    /**
     * 展示日期选择对话框
     */
    private void showDatePickerDialog(View v) {
        Calendar c = Calendar.getInstance();
        final EditText editText = (EditText) v;
        new DatePickerDialog(PlanMakeActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub

                editText.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }
    private void btn_appliance_no() {
        btn_appliance_no.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bd_white_radius));
        btn_appliance_no.setTextColor(getResources().getColor(R.color.white));
        btn_appliance_yes.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bg_white_radius));
        btn_appliance_yes.setTextColor(getResources().getColor(R.color.green));
    }
    private void btn_appliance_yes() {
        btn_appliance_yes.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bg_green_radius));
        btn_appliance_yes.setTextColor(getResources().getColor(R.color.white));
        btn_appliance_no.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bd_green_radius));
        btn_appliance_no.setTextColor(getResources().getColor(R.color.green));
    }
    private void btn_car_no() {
        btn_car_no.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bd_white_radius));
        btn_car_no.setTextColor(getResources().getColor(R.color.white));
        btn_car_yes.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bg_white_radius));
        btn_car_yes.setTextColor(getResources().getColor(R.color.green));
    }

    private void btn_car_yes() {
        btn_car_yes.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bg_green_radius));
        btn_car_yes.setTextColor(getResources().getColor(R.color.white));
        btn_car_no.setBackground(getResources().getDrawable(R.drawable.work_task_peoject_bd_green_radius));
        btn_car_no.setTextColor(getResources().getColor(R.color.green));
    }
}
