package com.handsome.projectnz.View.Home.OptionProject;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Home.OptionProject.OptionProjectElseFragment;
import com.handsome.projectnz.Fragment.Home.OptionProject.OptionProjectExpanFragment;
import com.handsome.projectnz.Fragment.Home.OptionProject.OptionSystemInnerFragment;
import com.handsome.projectnz.Fragment.Home.OptionProject.OptionSystemOuterFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by jie on 2018/1/23.
 */

public class OptionProjectActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    private TextView tv_system_inner;//系统内工程
    private TextView tv_system_outer;//系统外工程
    private TextView tv_expans;//业扩工程
    private TextView tv_else;//其他
    private ViewPager vp_content;//frangmet的容器
    private ArrayList<Fragment> list;
    private MainAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_option_project;
    }

    @Override
    public void initViews() {
        tv_system_inner = findView(R.id.tv_system_inner);
        tv_system_outer = findView(R.id.tv_system_outer);
        tv_expans = findView(R.id.tv_expans);
        tv_else = findView(R.id.tv_else);
        vp_content = findView(R.id.vp_content);
    }

    @Override
    public void initListener() {
        setOnClick(tv_system_inner);
        setOnClick(tv_system_outer);
        setOnClick(tv_expans);
        setOnClick(tv_else);
        vp_content.setOnPageChangeListener(this);
    }

    public void selectPager(int position) {
        vp_content.setCurrentItem(position);
        if (position == 0) {
            tv_system_inner.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_system_inner.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_system_outer.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_outer.setTextColor(getResources().getColor(R.color.white));
            tv_expans.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_expans.setTextColor(getResources().getColor(R.color.white));
            tv_else.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_else.setTextColor(getResources().getColor(R.color.white));

        } if (position == 1) {
            tv_system_outer.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_system_outer.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_system_inner.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_inner.setTextColor(getResources().getColor(R.color.white));
            tv_expans.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_expans.setTextColor(getResources().getColor(R.color.white));
            tv_else.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_else.setTextColor(getResources().getColor(R.color.white));
        }
        if (position==2){
            tv_expans.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_expans.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_system_inner.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_inner.setTextColor(getResources().getColor(R.color.white));
            tv_system_outer.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_outer.setTextColor(getResources().getColor(R.color.white));
            tv_else.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_else.setTextColor(getResources().getColor(R.color.white));
        }
        if (position==3){
            tv_else.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_else.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_system_inner.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_inner.setTextColor(getResources().getColor(R.color.white));
            tv_system_outer.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_system_outer.setTextColor(getResources().getColor(R.color.white));
            tv_expans.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_expans.setTextColor(getResources().getColor(R.color.white));
        }
    }
    //初始化碎片
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new OptionSystemInnerFragment());
        list.add(new OptionSystemOuterFragment());
        list.add(new OptionProjectExpanFragment());
        list.add(new OptionProjectElseFragment());
        adapter = new MainAdapter(this.getSupportFragmentManager(), list);
        vp_content.setAdapter(adapter);
        vp_content.setOffscreenPageLimit(3);
        selectPager(0);
    }
    @Override
    public void initData() {
        setTitle("项目选择");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.tv_system_inner:
                selectPager(0);
                break;
            case R.id.tv_system_outer:
                selectPager(1);
                break;
            case R.id.tv_expans:
                selectPager(2);
                break;
            case R.id.tv_else:
                selectPager(3);
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
