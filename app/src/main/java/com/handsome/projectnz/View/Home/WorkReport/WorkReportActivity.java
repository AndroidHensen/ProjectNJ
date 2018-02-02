package com.handsome.projectnz.View.Home.WorkReport;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Home.WorkReport.WorkReportReceiveFragment;
import com.handsome.projectnz.Fragment.Home.WorkReport.WorkReportSubmitFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by jie on 2018/1/22.
 */

public class WorkReportActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    private Button btn_receive;//我收到的
    private Button btn_submit;//我提交的
    private ViewPager vp_work_report;
    private ArrayList<Fragment> list;
    private MainAdapter adapter;
    private ImageButton ib_add;//添加工作汇报新建

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_report;
    }

    @Override
    public void initViews() {
        btn_receive = findView(R.id.btn_receive);
        btn_submit = findView(R.id.btn_submit);
        vp_work_report = findView(R.id.vp_work_report);
        ib_add = findView(R.id.ib_add);
    }

    @Override
    public void initListener() {
        ib_add.setOnClickListener(this);
        setOnClick(btn_receive);
        setOnClick(btn_submit);
        vp_work_report.setOnPageChangeListener(this);
    }

    //初始化碎片
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new WorkReportReceiveFragment());
        list.add(new WorkReportSubmitFragment());
        adapter = new MainAdapter(this.getSupportFragmentManager(), list);
        vp_work_report.setAdapter(adapter);
        vp_work_report.setOffscreenPageLimit(1);
        selectPager(0);
    }

    @Override
    public void initData() {
        setTitle("工作汇报");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    public void selectPager(int position) {
        vp_work_report.setCurrentItem(position);
        if (position == 0) {
            btn_receive.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            btn_receive.setTextColor(getResources().getColor(R.color.colorPrimary));
            btn_submit.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            btn_submit.setTextColor(getResources().getColor(R.color.white));
        } else {
            btn_submit.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            btn_submit.setTextColor(getResources().getColor(R.color.colorPrimary));
            btn_receive.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            btn_receive.setTextColor(getResources().getColor(R.color.white));
        }
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.btn_receive:
                selectPager(0);
                break;
            case R.id.btn_submit:
                selectPager(1);
                break;
            case R.id.ib_add:
                Intent intent = new Intent(WorkReportActivity.this, WorkReportNewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        vp_work_report.setCurrentItem(position);
        if (position == 0) {
            btn_receive.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            btn_receive.setTextColor(getResources().getColor(R.color.colorPrimary));
            btn_submit.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            btn_submit.setTextColor(getResources().getColor(R.color.white));
        } else {
            btn_submit.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            btn_submit.setTextColor(getResources().getColor(R.color.colorPrimary));
            btn_receive.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            btn_receive.setTextColor(getResources().getColor(R.color.white));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
