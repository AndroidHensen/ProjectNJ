package com.handsome.projectnz.Fragment;

import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.FastMenuBar;
import com.handsome.projectnz.R;

/**
 * Created by Diko(kedongyu) on 2016/4/7.
 * 本界面对应主界面-项目
 */
public class ProjectFragment extends BaseLazyFragment {
    private FastMenuBar fmb_project_new;
    private FastMenuBar fmb_project_update;
    private FastMenuBar fmb_project_file;
    private FastMenuBar fmb_project_delect_file;
    private FastMenuBar fmb_project_sum;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project;
    }

    @Override
    public void initViews() {
        fmb_project_new=findView(R.id.project_new);
        fmb_project_update=findView(R.id.project_update);
        fmb_project_file=findView(R.id.project_file);
        fmb_project_delect_file=findView(R.id.project_delete_file);
        fmb_project_sum=findView(R.id.project_sum);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("项目");
    }

    @Override
    public void processClick(View v) {

    }
}
