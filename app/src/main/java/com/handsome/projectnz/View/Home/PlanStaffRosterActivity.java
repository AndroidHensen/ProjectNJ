package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class PlanStaffRosterActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_staff_roster;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("人员名册");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
