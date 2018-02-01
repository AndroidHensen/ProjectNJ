package com.handsome.projectnz.View.Home.PlanProgress;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.CustomView.PlanProgressTabButton;
import com.handsome.projectnz.Fragment.Home.PlanProgress.PlanProgressAchieveFragment;
import com.handsome.projectnz.Fragment.Home.PlanProgress.PlanProgressAlreadyFragment;
import com.handsome.projectnz.Fragment.Home.PlanProgress.PlanProgressNotFragment;
import com.handsome.projectnz.Fragment.Home.PlanProgress.PlanProgressOverFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by jie on 2018/1/24.
 */

public class PlanProgressActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    private PlanProgressTabButton PlanProgressTabButton_not_plan;//未计划
    private PlanProgressTabButton PlanProgressTabButton_already_plan;//已计划
    private PlanProgressTabButton PlanProgressTabButton_over_plan;//已超期
    private PlanProgressTabButton PlanProgressTabButton_achieve_plan;//已完成
    private ViewPager vp_content;//frangmet的容器
    private ArrayList<Fragment> list;
    private MainAdapter adapter;
    private ImageButton ib_find;//搜索

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_progress;
    }

    @Override
    public void initViews() {
        PlanProgressTabButton_not_plan = findView(R.id.PlanProgressTabButton_not_plan);
        PlanProgressTabButton_already_plan = findView(R.id.PlanProgressTabButton_already_plan);
        PlanProgressTabButton_over_plan = findView(R.id.PlanProgressTabButton_over_plan);
        PlanProgressTabButton_achieve_plan = findView(R.id.PlanProgressTabButton_achieve_plan);
        vp_content = findView(R.id.vp_content);
        ib_find = findView(R.id.ib_find);
    }

    @Override
    public void initListener() {
        setOnClick(PlanProgressTabButton_not_plan);
        setOnClick(PlanProgressTabButton_already_plan);
        setOnClick(PlanProgressTabButton_over_plan);
        setOnClick(PlanProgressTabButton_achieve_plan);
        vp_content.setOnPageChangeListener(this);
    }

    public void selectPager(int position) {
        vp_content.setCurrentItem(position);
        PlanProgressTabButton_not_plan.isSelected(position==0?true:false);
        PlanProgressTabButton_already_plan.isSelected(position==1?true:false);
        PlanProgressTabButton_over_plan.isSelected(position==2?true:false);
        PlanProgressTabButton_achieve_plan.isSelected(position==3?true:false);
    }

    //初始化碎片
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new PlanProgressNotFragment());
        list.add(new PlanProgressAlreadyFragment());
        list.add(new PlanProgressOverFragment());
        list.add(new PlanProgressAchieveFragment());
        adapter = new MainAdapter(this.getSupportFragmentManager(), list);
        vp_content.setAdapter(adapter);
        vp_content.setOffscreenPageLimit(3);
        selectPager(0);
    }

    @Override
    public void initData() {
        setTitle("计划");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.PlanProgressTabButton_not_plan:
                selectPager(0);
                break;
            case R.id.PlanProgressTabButton_already_plan:
                selectPager(1);
                break;
            case R.id.PlanProgressTabButton_over_plan:
                selectPager(2);
                break;
            case R.id.PlanProgressTabButton_achieve_plan:
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
