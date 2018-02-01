package com.handsome.projectnz.View.Home.PlanDetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
/**
 * Created by YX_PC on 2018/1/27.
 * 界面：工作台_计划详情_人员名册
 */
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
