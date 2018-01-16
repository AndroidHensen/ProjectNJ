package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/13.
 */

public class ReturnProjectTaskActivity extends BaseActivity {
    private EditText et_project_name;
    private EditText et_task_name;
    private EditText ed_input;
    private EditText et_explain;
    private Button btn_submit;
    @Override
    public int getLayoutId() {
        return R.layout.activity_return_project_task;
    }

    @Override
    public void initViews() {
        et_project_name = findView(R.id.et_project_name);
        et_task_name=findView(R.id.et_task_name);
        ed_input=findView(R.id.ed_input);
        et_explain=findView(R.id.et_explain);
        btn_submit=findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("反馈任务");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}