package com.handsome.projectnz.Fragment.Project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.ProjectDataDownloadView;
import com.handsome.projectnz.CustomView.ProjectDataFileView;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.Module.ProjectDataFile;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kedongyu 2018.1.24
 * 对应主界面-项目模块-新建项目-项目资料
 */
public class ProjectDetailFileFragment extends BaseLazyFragment {
    //工作量表，材料清单，设计图纸，安全基准表，质量指导书，施工方案，
    private ProjectDataDownloadView pddv_work,pddv_material,pddv_design,pddv_danger,pddv_guidance,pddv_measure;
    //其他
    private ProjectDataDownloadView pddv_others;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project_detail_file;
    }

    @Override
    public void initViews() {
        pddv_work=findView(R.id.files_work);
        pddv_material=findView(R.id.files_material);
        pddv_measure=findView(R.id.files_measure);
        pddv_others=findView(R.id.files_other);
        pddv_design=findView(R.id.files_design);
        pddv_danger=findView(R.id.files_danger);
        pddv_guidance=findView(R.id.files_guidance);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<ProjectDataFile> files=new ArrayList<>();
        ProjectDataFile file=new ProjectDataFile();
        file.setFileName("文件1.xml");
        ProjectDataFile file1=new ProjectDataFile();
        file1.setFileName("文件2.xml");
        ProjectDataFile file2=new ProjectDataFile();
        file2.setFileName("文件3.xml");
        ProjectDataFile file3=new ProjectDataFile();
        file3.setFileName("文件4.xml");
        files.add(file);
        files.add(file1);
        files.add(file2);
        files.add(file3);
        pddv_work.setFlieList(files);
        pddv_danger.setFlieList(files);
        pddv_others.setFlieList(files);
        pddv_material.setFlieList(files);
    }

    @Override
    public void processClick(View v) {

    }
}
