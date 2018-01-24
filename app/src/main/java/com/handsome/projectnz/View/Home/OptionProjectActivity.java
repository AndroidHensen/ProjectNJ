package com.handsome.projectnz.View.Home;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.OptionProjectElseFragment;
import com.handsome.projectnz.Fragment.OptionProjectExpanFragment;
import com.handsome.projectnz.Fragment.OptionSystemInnerFragment;
import com.handsome.projectnz.Fragment.OptionSystemOuterFragment;
import com.handsome.projectnz.Fragment.WorkReportReceiveFragment;
import com.handsome.projectnz.Fragment.WorkReportSubmitFragment;
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
            tv_system_inner.setBackgroundColor(Color.WHITE);
            tv_system_inner.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        } if (position == 1){
            tv_system_outer.setBackgroundColor(Color.WHITE);
            tv_system_outer.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        }if (position == 2) {
            tv_expans.setBackgroundColor(Color.WHITE);
            tv_expans.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        }  if (position == 3) {
            tv_else.setBackgroundColor(Color.WHITE);
            tv_else.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
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
        vp_content.setCurrentItem(position);
        if (position == 0) {
            tv_system_inner.setBackgroundColor(Color.WHITE);
            tv_system_inner.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        } if (position == 1){
            tv_system_outer.setBackgroundColor(Color.WHITE);
            tv_system_outer.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        }if (position == 2) {
            tv_expans.setBackgroundColor(Color.WHITE);
            tv_expans.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
            tv_else.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_else.setTextColor(Color.WHITE);
        }  if (position == 3) {
            tv_else.setBackgroundColor(Color.WHITE);
            tv_else.setTextColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_inner.setTextColor(Color.WHITE);
            tv_expans.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_expans.setTextColor(Color.WHITE);
            tv_system_outer.setBackgroundColor(Color.parseColor("#3F51B5"));
            tv_system_outer.setTextColor(Color.WHITE);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
