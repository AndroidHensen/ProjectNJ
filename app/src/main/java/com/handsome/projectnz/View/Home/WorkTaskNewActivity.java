package com.handsome.projectnz.View.Home;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/20.
 */

public class WorkTaskNewActivity extends BaseActivity {

    private TextView tv_text_project;
    private ImageButton tv_task_name;
    private ImageButton ib_task_name;
    private TextView tv_task_category;
    private ImageButton ib_task_category;
    private TextView tv_task_address;
    private ImageButton ib_start_time;
    private TextView tv_start_time;
    private ImageButton ib_end_time;
    private TextView tv_end_time;
    private TextView tv_operator;
    private EditText et_task_explain;
    private EditText et_announcements;
    private Button btn_submit;

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_new;
    }

    @Override
    public void initViews() {
        tv_text_project = findView(R.id.tv_text_project);
        tv_task_name = findView(R.id.tv_task_name);
        ib_task_name = findView(R.id.ib_task_name);
        tv_task_category = findView(R.id.tv_task_category);
        ib_task_category = findView(R.id.ib_task_category);
        tv_task_address = findView(R.id.tv_task_address);
        ib_start_time = findView(R.id.ib_start_time);
        tv_start_time = findView(R.id.tv_start_time);
        ib_end_time = findView(R.id.ib_end_time);
        tv_end_time = findView(R.id.tv_end_time);
        tv_operator = findView(R.id.tv_operator);
        et_task_explain = findView(R.id.et_task_explain);
        et_announcements = findView(R.id.et_announcements);
        btn_submit = findView(R.id.btn_submit);
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
