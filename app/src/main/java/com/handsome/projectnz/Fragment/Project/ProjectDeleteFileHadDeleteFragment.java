package com.handsome.projectnz.Fragment.Project;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Project.ProjectDeleteFileAdapter;
import com.handsome.projectnz.Adapter.Project.ProjectFileAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kedongyu 2018.1.24
 * 对应主界面-项目模块-项目销档-已销档
 */
public class ProjectDeleteFileHadDeleteFragment extends BaseLazyFragment {
    private ListView lv_project;
    private ProjectDeleteFileAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project_list_view;
    }

    @Override
    public void initViews() {
        lv_project=findView(R.id.lv_project);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<Project> lists=new ArrayList<>();
        Project project=new Project();
        project.setProjectName("1028工程");
        project.setTimeLimit(30);
        project.setEngineeringType("系统内工程");
        project.setProjectType("检测试验");
        project.setProjectManager("Diko(柯东煜)");
        project.setInitiator("adah.");
        project.setProjectNum("20170120");
        project.setProjectProgress(30);
        lists.add(project);
        Project project1=new Project();
        project1.setProjectName("1028工程");
        project1.setTimeLimit(30);
        project1.setEngineeringType("系统内工程");
        project1.setProjectType("检测试验");
        project1.setProjectManager("adah...");
        project1.setProjectNum("20170121");
        project1.setInitiator("adah。。");
        project1.setProjectProgress(100);
        lists.add(project1);
        adapter=new ProjectDeleteFileAdapter(getActivity(),lists);
        lv_project.setAdapter(adapter);

    }

    @Override
    public void processClick(View v) {

    }
}
