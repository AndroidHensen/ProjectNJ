package com.handsome.projectnz.View.Project;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Project.ProjectDeleteFileFiledFragment;
import com.handsome.projectnz.Fragment.Project.ProjectDeleteFileHadDeleteFragment;
import com.handsome.projectnz.Fragment.Project.ProjectSumConductingFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko in 2018.1.21
 * 本界面对应 主界面-项目模块-销档
 */

public class ProjectDeleteFileActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    private TextView tv_project_filed, tv_project_delete_file;//已归档，销档
    private ViewPager vp_project;

    private MainAdapter adapter;
    private List<Fragment> list;

    @Override
    public int getLayoutId() {
        return R.layout.activity_project;
    }

    @Override
    public void initViews() {
        tv_project_filed = findView(R.id.project_left);//已归档
        tv_project_delete_file = findView(R.id.project_right);//已销档
        vp_project = findView(R.id.vp_project);
    }

    @Override
    public void initListener() {
        setOnClick(tv_project_delete_file);
        setOnClick(tv_project_filed);
        vp_project.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        tv_project_filed.setText("已归档");
        tv_project_delete_file.setText("已销档");
        setTitle("项目销档");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    /**
     * 初始化碎片
     */

    private void initFragments() {
        list = new ArrayList<>();
        list.add(new ProjectDeleteFileFiledFragment());
        list.add(new ProjectDeleteFileHadDeleteFragment());
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
        tv_project_filed.setTextColor(position == 0 ? blueColor : whiteColor);
        tv_project_filed.setBackground(position == 0 ? bg_selected : bg_unselected);
        tv_project_delete_file.setTextColor(position == 1 ? blueColor : whiteColor);
        tv_project_delete_file.setBackground(position == 1 ? bg_selected : bg_unselected);
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
