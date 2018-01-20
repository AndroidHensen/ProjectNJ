package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/15.
 */

public class WorkReportNewActivity extends BaseActivity {
    private EditText et_report_title;
    private EditText et_report_content;
    private ImageButton ib_camera;
    private ImageButton ib_right;

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_report_new;
    }

    @Override
    public void initViews() {
        et_report_title = findView(R.id.et_report_title);
        et_report_content = findView(R.id.et_report_content);
        ib_camera = findView(R.id.ib_camera);
        ib_right = findView(R.id.ib_right);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setEdit2("提交");
        setTitleCanBack();
        setTitle("新建汇报");
    }

    @Override
    public void processClick(View v) {

    }
}
