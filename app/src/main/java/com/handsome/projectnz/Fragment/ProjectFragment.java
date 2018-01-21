package com.handsome.projectnz.Fragment;

import android.content.Intent;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.FastMenuBar;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Project.ProjectDeleteFile;
import com.handsome.projectnz.View.Project.ProjectFile;
import com.handsome.projectnz.View.Project.ProjectNew;
import com.handsome.projectnz.View.Project.ProjectUpdate;
import com.handsome.projectnz.View.Project.ProjectSum;

/**
 * Created by Diko(kedongyu) on 2016/4/7.
 * 本界面对应主界面-项目
 */
public class ProjectFragment extends BaseLazyFragment implements FastMenuBar.onMenuBarClickListener {
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
        fmb_project_new = findView(R.id.project_new);
        fmb_project_update = findView(R.id.project_update);
        fmb_project_file = findView(R.id.project_file);
        fmb_project_delect_file = findView(R.id.project_delete_file);
        fmb_project_sum = findView(R.id.project_sum);
    }

    @Override
    public void initListener() {
        fmb_project_new.setOnMenuBarClickListener(this);
        fmb_project_update.setOnMenuBarClickListener(this);
        fmb_project_file.setOnMenuBarClickListener(this);
        fmb_project_delect_file.setOnMenuBarClickListener(this);
        fmb_project_sum.setOnMenuBarClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("项目");
    }

    @Override
    public void processClick(View v) {

    }

    @Override
    public void onMenuBarClick(FastMenuBar v) {
        Intent i;
        switch (v.getId()) {
            case R.id.project_new:
                i = new Intent(getActivity(), ProjectNew.class);
                startActivity(i);
                break;
            case R.id.project_update:
                i = new Intent(getActivity(), ProjectUpdate.class);
                startActivity(i);
                break;
            case R.id.project_file:
                i = new Intent(getActivity(), ProjectFile.class);
                startActivity(i);
                break;
            case R.id.project_delete_file:
                i = new Intent(getActivity(), ProjectDeleteFile.class);
                startActivity(i);
                break;
            case R.id.project_sum:
                i = new Intent(getActivity(), ProjectSum.class);
                startActivity(i);
                break;
            default:
        }
    }
}
