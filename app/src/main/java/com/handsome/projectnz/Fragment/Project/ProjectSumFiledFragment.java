package com.handsome.projectnz.Fragment.Project;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Project.ProjectSumAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handsome on 2016/4/7.
 */
public class ProjectSumFiledFragment extends BaseLazyFragment {
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
        project.setProjectManager("adah(zjf)");
        project.setInitiator("kedongyu");
        project.setProjectProgress(100);
        lists.add(project);
        Project project1=new Project();
        project1.setProjectName("1028工程");
        project1.setTimeLimit(30);
        project1.setEngineeringType("系统内工程");
        project1.setProjectType("检测试验");
        project1.setProjectManager("adah(zjf)");
        project1.setInitiator("kedongyu");
        project1.setProjectProgress(100);
        lists.add(project);
        adapter=new ProjectSumAdapter(getActivity(),lists);
        lv_project.setAdapter(adapter);

    }

    @Override
    public void processClick(View v) {

    }
}
