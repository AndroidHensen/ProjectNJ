package com.handsome.projectnz.View.Home.Statistics;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/20.
 */

public class AssignmentProjectActivity extends BaseActivity {
    private TextView tv_work_project_arrange;//项目任务管理人
    private TextView tv_work_project_excult;//项目任务执行人
    private TextView tv_work_project_name;//项目名称
    private TextView tv_work_task_name;//任务名称
    private TextView tv_work_task_kind;//任务类别
    private TextView tv_work_project_start;//项目任务开始时间
    private TextView tv_work_project_stop;//项目任务结束时间
    private TextView tv_work_task_explain;//项目任务说明
    private RecyclerView rv_work_task_accessory;//项目任务附件
    private RecyclerView rv_work_task_record;//项目任务记录
    private TextView tv_work_task_number;//项目完成排序数
    private TextView tv_work_project_accomplish;//项目任务完成时间
    private TextView tv_work_project_man;//项目验收人
    private TextView tv_work_project_status;//项目验收状态
    private TextView tv_work_task_evaluate;//项目任务评价

    @Override
    public int getLayoutId() {
        return R.layout.activity_assignment_arrange_project;
    }

    @Override
    public void initViews() {
        tv_work_project_arrange = findView(R.id.tv_work_project_arrange);
        tv_work_project_excult = findView(R.id.tv_work_project_excult);
        tv_work_project_name = findView(R.id.tv_work_project_name);
        tv_work_task_name = findView(R.id.tv_work_task_name);
        tv_work_task_kind = findView(R.id.tv_work_task_kind);
        tv_work_project_stop = findView(R.id.tv_work_project_stop);
        tv_work_project_start = findView(R.id.tv_work_project_start);
        tv_work_task_explain = findView(R.id.tv_work_task_explain);
        rv_work_task_accessory = findView(R.id.rv_work_task_accessory);
        rv_work_task_record = findView(R.id.rv_work_task_record);
        tv_work_task_number = findView(R.id.tv_work_task_number);
        tv_work_project_accomplish = findView(R.id.tv_work_project_accomplish);
        tv_work_project_man = findView(R.id.tv_work_project_man);
        tv_work_project_status = findView(R.id.tv_work_project_status);
        tv_work_task_evaluate = findView(R.id.tv_work_task_evaluate);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("任务详情");
        setTitleCanBack();

    }

    @Override
    public void processClick(View v) {

    }
}
