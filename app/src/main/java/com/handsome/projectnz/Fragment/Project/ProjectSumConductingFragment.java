package com.handsome.projectnz.Fragment.Project;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Project.ProjectSumAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Project.ProjectDetailActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kedongyu 2018.1.24
 * 对应主界面-项目模块-项目汇总-正在进行中
 */
public class ProjectSumConductingFragment extends BaseLazyFragment {
    private ListView lv_project;
    private ProjectSumAdapter adapter;
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
        project.setInitiator("xuyingjun");
        project.setProjectProgress(30);
        lists.add(project);
        Project project1=new Project();
        project1.setProjectName("1028工程");
        project1.setTimeLimit(30);
        project1.setEngineeringType("系统内工程");
        project1.setProjectType("检测试验");
        project1.setProjectManager("Diko(柯东煜)");
        project1.setInitiator("xuyingjun");
        project1.setProjectProgress(30);
        lists.add(project1);
        adapter=new ProjectSumAdapter(getActivity(),lists);
        lv_project.setAdapter(adapter);
        lv_project.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), ProjectDetailActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void processClick(View v) {

    }
}
