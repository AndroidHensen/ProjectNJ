package com.handsome.projectnz.View.Home.PlanProgress;

import android.view.View;
import android.widget.EditText;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/26.
 */

public class PlanProgressNewActivity extends BaseActivity {
    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_progress_new;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("新建申请");
        setTitleCanBack();
        setEdit2("提交");

    }

    @Override
    public void processClick(View v) {

    }
}
