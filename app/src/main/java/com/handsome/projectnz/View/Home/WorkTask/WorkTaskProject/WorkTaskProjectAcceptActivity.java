package com.handsome.projectnz.View.Home.WorkTask.WorkTaskProject;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/20.
 * 界面：工作台_工作任务_项目任务_任务接收
 */

public class WorkTaskProjectAcceptActivity extends BaseActivity {
    private TextView tv_project;//项目
    private TextView tv_task_name;//任务名称
    private TextView tv_arrange_people;//安排人
    private TextView tv_operator;//执行人
    private TextView tv_check_category;//检查类别
    private TextView tv_start_time;//派工日期
    private TextView tv_end_time;//截止日期
    private TextView tv_now_time;//当前日期
    private TextView tv_over_date;//超期
    private TextView tv_workload;//工作量
    private TextView tv_describe;//描述
    private TextView tv_schedule;//进度
    private Button btn_pass;//通过
    private Button btn_no_pass;//不通过
    private RatingBar rb_evaluate;//评价
    private TextView tv_accept_opinion;//验收意见
    private Button btn_submit;//提交


    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_project_accept;
    }

    @Override
    public void initViews() {
        tv_project=findView(R.id.tv_project);
        tv_task_name=findView(R.id.tv_task_name);
        tv_arrange_people=findView(R.id.tv_arrange_people);
        tv_operator=findView(R.id.tv_operator);
        tv_check_category=findView(R.id.tv_check_category);
        tv_start_time=findView(R.id.tv_start_time);
        tv_end_time=findView(R.id.tv_end_time);
        tv_now_time=findView(R.id.tv_now_time);
        tv_over_date=findView(R.id.tv_over_date);
        tv_schedule=findView(R.id.tv_schedule);
        tv_workload=findView(R.id.tv_workload);
        tv_describe=findView(R.id.tv_describe);
        btn_pass=findView(R.id.btn_pass);
        btn_no_pass=findView(R.id.btn_no_pass);
        rb_evaluate=findView(R.id.rb_evaluate);
        tv_accept_opinion=findView(R.id.tv_accept_opinion);
        btn_submit=findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("任务验收");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
