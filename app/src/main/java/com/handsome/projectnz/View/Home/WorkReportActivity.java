package com.handsome.projectnz.View.Home;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Register.RegisterCarFragment;
import com.handsome.projectnz.Fragment.Register.RegisterMachineFragment;
import com.handsome.projectnz.Fragment.Register.RegisterPersonalFragment;
import com.handsome.projectnz.Fragment.Register.RegisterUnitFragment;
import com.handsome.projectnz.Fragment.WorkReportReceiveFragment;
import com.handsome.projectnz.Fragment.WorkReportSubmitFragment;
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

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_report;
    }

    @Override
    public void initViews() {
        btn_receive = findView(R.id.btn_receive);
        btn_submit = findView(R.id.btn_submit);
        vp_work_report = findView(R.id.vp_work_report);
    }

    @Override
    public void initListener() {
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
            btn_receive.setBackgroundColor(Color.WHITE);
            btn_receive.setTextColor(Color.parseColor("#3F51B5"));
            btn_submit.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_submit.setTextColor(Color.WHITE);
        } else {
            btn_receive.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_receive.setTextColor(Color.WHITE);
            btn_submit.setBackgroundColor(Color.WHITE);
            btn_submit.setTextColor(Color.parseColor("#3F51B5"));
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
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        vp_work_report.setCurrentItem(position);
        if (position == 0) {
            btn_receive.setBackgroundColor(Color.WHITE);
            btn_receive.setTextColor(Color.parseColor("#3F51B5"));
            btn_submit.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_submit.setTextColor(Color.WHITE);
        } else {
            btn_receive.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_receive.setTextColor(Color.WHITE);
            btn_submit.setBackgroundColor(Color.WHITE);
            btn_submit.setTextColor(Color.parseColor("#3F51B5"));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
