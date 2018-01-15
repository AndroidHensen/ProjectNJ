package com.handsome.projectnz.Fragment.Project;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.ProjectSumConductingAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handsome on 2016/4/7.
 */
public class ProjectSumConductingFragment extends BaseLazyFragment {
    private ListView lv_project;
    private ProjectSumConductingAdapter adapter;
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
        lists.add(project);
        adapter=new ProjectSumConductingAdapter(getActivity(),lists);
        lv_project.setAdapter(adapter);

    }

    @Override
    public void processClick(View v) {

    }
}
