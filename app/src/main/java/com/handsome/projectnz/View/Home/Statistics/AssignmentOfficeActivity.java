package com.handsome.projectnz.View.Home.Statistics;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/20.
 */

public class AssignmentOfficeActivity extends BaseActivity {
    private TextView tv_official_arrange;//办公任务安排人
    private TextView tv_official_execute;//办公任务执行人
    private TextView tv_officila_task;//办公任务名称
    private TextView tv_task_category;//办公任务类别
    private TextView tv_official_start;//办公任务委托期
    private TextView tv_official_stop;//办公任务截止期
    private TextView tv_official_task_explain;//办公任务说明
    private RecyclerView rv_task_photos;//办公任务相片
    private RecyclerView rv_official_record;//办公任务详细记录
    private TextView tv_sort_number;//办公任务的记录的下一个数据（排列数字）
    private TextView tv_accomplish_time;//办公任务完成时间
    private TextView tv_check_man;//任务验收人
    private TextView tv_check_status;//任务验收状态
    private TextView tv_task_evaluate;//任务评价

    @Override
    public int getLayoutId() {
        return R.layout.activity_assignment_arrange_office;
    }

    @Override
    public void initViews() {
        tv_official_arrange = findView(R.id.tv_official_arrange);
        tv_official_execute = findView(R.id.tv_official_execute);
        tv_officila_task = findView(R.id.tv_officila_task);
        tv_task_category = findView(R.id.tv_task_category);
        tv_official_start = findView(R.id.tv_official_start);
        tv_official_stop = findView(R.id.tv_official_stop);
        tv_official_task_explain = findView(R.id.tv_official_task_explain);
        rv_task_photos = findView(R.id.rv_task_photos);
        rv_official_record = findView(R.id.rv_official_record);
        tv_sort_number = findView(R.id.tv_sort_number);
        tv_accomplish_time = findView(R.id.tv_accomplish_time);
        tv_check_man = findView(R.id.tv_check_man);
        tv_check_status = findView(R.id.tv_check_status);
        tv_task_evaluate = findView(R.id.tv_task_evaluate);
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
