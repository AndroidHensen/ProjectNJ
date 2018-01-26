package com.handsome.projectnz.Fragment.Project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.ProjectDataFileView;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.Module.ProjectDataFile;
import com.handsome.projectnz.R;

/**
 * Created by kedongyu 2018.1.24
 * 对应主界面-项目模块-新建项目-项目资料
 */
public class ProjectNewDataFragment extends BaseLazyFragment {
    //工作量表，材料清单，设计图纸，安全基准表，质量指导书，施工方案，
    private ProjectDataFileView list_work,list_material,list_design,list_danger,list_guidance,list_measure;
    //预算表，结算表，其他
    private ProjectDataFileView list_budget,list_balance,list_others;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project_new_data;
    }

    @Override
    public void initViews() {
        list_work=findView(R.id.list_work);
        list_material=findView(R.id.list_material);
        list_design=findView(R.id.list_design);
        list_danger=findView(R.id.list_danger);
        list_guidance=findView(R.id.list_guidance);
        list_measure=findView(R.id.list_measure);
        list_budget=findView(R.id.list_budget);
        list_balance=findView(R.id.list_balance);
        list_others=findView(R.id.list_others);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        ProjectDataFile pdf=new ProjectDataFile();
        pdf.setFileName("表1");
        list_work.addFile(pdf);
        ProjectDataFile pdf1=new ProjectDataFile();
        pdf1.setFileName("表2");
        ProjectDataFile pdf2=new ProjectDataFile();
        pdf2.setFileName("表3");
        list_material.addFile(pdf1);
        list_design.addFile(pdf1);
        list_work.addFile(pdf1);
        list_guidance.addFile(pdf1);
        list_work.addFile(pdf2);
        list_budget.addFile(pdf2);
        list_balance.addFile(pdf2);
        list_others.addFile(pdf2);
    }

    @Override
    public void processClick(View v) {

    }
}
