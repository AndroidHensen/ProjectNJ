package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;


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
    private Button btn_car_yes;//是(是否需要使用车辆)
    private Button btn_car_no;//否(是否需要使用车辆)
    private Button btn_appliance_yes;//是(是否需要特殊器械)
    private Button btn_appliance_no;//否(是否需要特殊器械)
    private EditText et_remark;//备注
    private TextView tv_accessory;//附件
    private Button btn_submit;//上传

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
        btn_car_yes=findView(R.id.btn_car_yes);
        btn_car_no=findView(R.id.btn_car_no);
        btn_appliance_yes=findView(R.id.btn_appliance_yes);
        btn_appliance_no=findView(R.id.btn_appliance_no);
        et_remark=findView(R.id.et_remark);
        tv_accessory=findView(R.id.tv_accessory);
        btn_submit=findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("编制计划");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
