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
 * 界面：工作台_工作任务_新建任务
 */

public class WorkTaskNewActivity extends BaseActivity {

    private TextView tv_text_project;//项目
    private TextView tv_task_name;//任务名称
    private ImageButton ib_task_name;//任务名称(按钮)
    private TextView tv_task_category;//任务类别
    private ImageButton ib_task_category;//任务类别(按钮)
    private TextView tv_task_address;//任务地址
    private ImageButton ib_start_time;//开始日期(按钮)
    private TextView tv_start_time;//开始日期
    private ImageButton ib_end_time;//结束日期(按钮)
    private TextView tv_end_time;//结束日期
    private TextView tv_operator;//执行人
    private EditText et_task_explain;//任务描述
    private EditText et_announcements;//注意事项
    private Button btn_submit;//上传附件

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
