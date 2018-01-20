package com.handsome.projectnz.View.Home;

import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/20.
 */

public class WorkTaskNewActivity extends BaseActivity {
    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_new;
    }

    @Override
    public void initViews() {
        findView(R.id.tv_project);
        findView(R.id.tv_task_name);
        findView(R.id.ib_task_name);
        findView(R.id.tv_task_category);
        findView(R.id.ib_task_category);
        findView(R.id.tv_task_category);
        findView(R.id.ib_task_category);
        findView(R.id.tv_task_address);
        findView(R.id.ib_start_time);
        findView(R.id.tv_start_time);
        findView(R.id.ib_end_time);
        findView(R.id.tv_end_time);
        findView(R.id.tv_operator);
        findView(R.id.et_task_explain);
        findView(R.id.et_announcements);
        findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("新建任务");
        setTitleCanBack();
        setEdit2("保存");
    }

    @Override
    public void processClick(View v) {

    }
}
