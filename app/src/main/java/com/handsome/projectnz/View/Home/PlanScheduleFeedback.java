package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class PlanScheduleFeedback extends BaseActivity {


    private TextView tv_project_name;//项目名称
    private TextView tv_task_name;//任务名称
    private TextView tv_task_style;//任务类型
    private TextView tv_remain_workload;//剩余工作量
    private TextView tv_date;//日期
    private TextView tv_now_date;//当前日期
    private TextView tv_duration;//工期
    private EditText et_construction;//施工量
    private EditText et_explain;//补充说明
    private RecyclerView rv_photos;//照片
    private ImageButton ib_add_photos;//添加照片按钮
    private Button btn_submit;//提交

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_schedule_feedback;
    }

    @Override
    public void initViews() {
        tv_project_name = findView(R.id.tv_project_name);
        tv_task_name = findView(R.id.tv_task_name);
        tv_task_style = findView(R.id.tv_task_style);
        tv_remain_workload = findView(R.id.tv_remain_workload);
        tv_date = findView(R.id.tv_date);
        tv_now_date = findView(R.id.tv_now_date);
        tv_duration = findView(R.id.tv_duration);
        et_construction = findView(R.id.et_construction);
        et_explain = findView(R.id.et_explain);
        rv_photos = findView(R.id.rv_photos);
        ib_add_photos = findView(R.id.ib_add_photos);
        btn_submit = findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {

    }
}
