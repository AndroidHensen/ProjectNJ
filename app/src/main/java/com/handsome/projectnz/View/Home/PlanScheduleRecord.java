package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
/**
 * Created by YX_PC on 2018/1/15.
 * 界面：工作台_进度计划_计划详情_反馈记录
 */
public class PlanScheduleRecord extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_schedule_feedback;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("反馈记录");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
