package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/13.
 * 界面：工作台_工作任务_项目任务_反馈任务
 */

public class ReturnProjectTaskActivity extends BaseActivity {
    private EditText et_project_name;//项目名称
    private EditText et_task_name;//任务名称
    private EditText ed_input;//输入
    private EditText et_explain;//补充说明
    private Button btn_submit;//提交
    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_project_return;
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
