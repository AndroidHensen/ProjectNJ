package com.handsome.projectnz.View.Project;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Project.ProjectSumConductingFragment;
import com.handsome.projectnz.Fragment.Project.ProjectSumFiledFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectSum extends BaseActivity implements ViewPager.OnPageChangeListener {
    private TextView tv_project_filed, tv_project_conducting;//已归档，正在进行中，
    private ViewPager vp_project;

    private MainAdapter adapter;
    private List<Fragment> list;

    @Override
    public int getLayoutId() {
        return R.layout.activity_project;
    }

    @Override
    public void initViews() {
        tv_project_conducting = findView(R.id.project_left);
        tv_project_filed = findView(R.id.project_right);
        vp_project = findView(R.id.vp_project);
    }

    @Override
    public void initListener() {
        setOnClick(tv_project_filed);
        setOnClick(tv_project_conducting);
        vp_project.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        tv_project_conducting.setText("正在进行中");
        tv_project_filed.setText("已归档");
        setTitle("项目汇总");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    /**
     * 初始化碎片
     */
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new ProjectSumConductingFragment());
        list.add(new ProjectSumFiledFragment());
        adapter = new MainAdapter(getSupportFragmentManager(), list);
        vp_project.setAdapter(adapter);
        vp_project.setOffscreenPageLimit(2);
        //初始化图标
        selectPager(0);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.project_left:
                selectPager(0);
                break;
            case R.id.project_right:
                selectPager(1);
                break;
        }
    }


    public void selectPager(int position) {
        vp_project.setCurrentItem(position);
        int blueColor = getResources().getColor(R.color.colorPrimary);
        int whiteColor = getResources().getColor(R.color.colorWhite);
        Drawable bg_unselected = getResources().getDrawable(R.drawable.project_title_white_shape);
        Drawable bg_selected = getResources().getDrawable(R.color.colorWhite);
        tv_project_conducting.setTextColor(position == 0 ? blueColor : whiteColor);
        tv_project_conducting.setBackground(position == 0 ? bg_selected : bg_unselected);
        tv_project_filed.setTextColor(position == 1 ? blueColor : whiteColor);
        tv_project_filed.setBackground(position == 1 ? bg_selected : bg_unselected);
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
