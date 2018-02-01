package com.handsome.projectnz.View.Home.DailyCheck;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Home.DailyCheck.DailyCheckInformFragment;
import com.handsome.projectnz.Fragment.Home.DailyCheck.DailyCheckReviceFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by jie on 2018/1/28.
 */

public class DailyCheckActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    private TextView tv_inform;//通知情况
    private TextView tv_revices;//整改情况
    private ImageButton btn_add;//新增巡检情况
    private ViewPager vp_daily_check;
    private ArrayList<Fragment> list;
    private MainAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_daily_check;
    }

    @Override
    public void initViews() {
        tv_inform = findView(R.id.tv_inform);
        tv_revices = findView(R.id.tv_revices);
        btn_add = findView(R.id.btn_add);
        vp_daily_check = findView(R.id.vp_daily_check);
    }

    @Override
    public void initListener() {
        btn_add.setOnClickListener(this);
        setOnClick(tv_inform);
        setOnClick(tv_revices);
        vp_daily_check.setOnPageChangeListener(this);
    }
    //初始化碎片
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new DailyCheckInformFragment());
        list.add(new DailyCheckReviceFragment());
        adapter = new MainAdapter(this.getSupportFragmentManager(), list);
        vp_daily_check.setAdapter(adapter);
        vp_daily_check.setOffscreenPageLimit(1);
        selectPager(0);
    }
    @Override
    public void initData() {
        setTitle("日常巡检");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }
    public void selectPager(int position) {
        vp_daily_check.setCurrentItem(position);
        if (position == 0) {
            tv_inform.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_inform.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_revices.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_revices.setTextColor(getResources().getColor(R.color.white));

        } else {
            tv_revices.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_revices.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_inform.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_inform.setTextColor(getResources().getColor(R.color.white));
        }
    }
    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.tv_inform:
                selectPager(0);
                break;
            case R.id.tv_revices:
                selectPager(1);
                break;
            case R.id.btn_add:
                Intent intent = new Intent(DailyCheckActivity.this, DailyCheckNewActivity.class);
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
        selectPager(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
