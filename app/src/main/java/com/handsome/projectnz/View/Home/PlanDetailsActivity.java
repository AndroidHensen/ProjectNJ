package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class PlanDetailsActivity extends BaseActivity {
    private TextView tv_project;//项目
    private TextView tv_project_style;//项目类型
    private TextView tv_task;//任务
    private TextView tv_task_style;//任务类型
    private TextView tv_workload;//工作量
    private TextView tv_work_date;//开始日期
    private TextView tv_end_date;//截止日期
    private TextView tv_duration;//工期
    private TextView tv_plan_schedule;//计划进度
    private ProgressBar pb_schedule;//计划进度(进度条)
    private Button btn_find_record;//查看反馈记录
    private Button btn_make_plan;//编制计划
    private Button btn_schedule_feedback;//进度反馈
    private Button btn_arrange_task;//安排任务

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_details;
    }

    @Override
    public void initViews() {
        tv_project = findView(R.id.tv_project);
        tv_project_style = findView(R.id.tv_project_style);
        tv_task = findView(R.id.tv_task);
        tv_task_style = findView(R.id.tv_task_style);
        tv_workload = findView(R.id.tv_workload);
        tv_work_date = findView(R.id.tv_work_date);
        tv_end_date = findView(R.id.tv_end_date);
        tv_duration = findView(R.id.tv_duration);
        tv_plan_schedule = findView(R.id.tv_plan_schedule);
        pb_schedule = findView(R.id.pb_schedule);
        btn_find_record = findView(R.id.btn_find_record);
        btn_make_plan = findView(R.id.btn_make_plan);
        btn_schedule_feedback = findView(R.id.btn_schedule_feedback);
        btn_arrange_task = findView(R.id.btn_arrange_task);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("计划详情");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
