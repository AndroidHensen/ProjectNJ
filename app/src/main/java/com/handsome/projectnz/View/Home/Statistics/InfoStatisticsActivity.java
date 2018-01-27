package com.handsome.projectnz.View.Home.Statistics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Statistics.InfoStatisticsAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class InfoStatisticsActivity extends BaseActivity {
    private ListView lv_projects;
    private InfoStatisticsAdapter adapter;
    private List<Project> lists;
    @Override
    public int getLayoutId() {
        return R.layout.activity_info_statistics;
    }

    @Override
    public void initViews() {
        lv_projects=findView(R.id.lv);
    }

    @Override
    public void initListener() {
    }

    @Override
    public void initData() {
        setTitle("资料统计");
        setTitleCanBack();

        lists=new ArrayList<>();
        Project project=new Project();
        project.setProjectName("1028工程");
        project.setTimeLimit(30);
        project.setEngineeringType("系统内工程");
        project.setProjectType("检测试验");
        project.setProjectManager("Diko(柯东煜)");
        project.setInitiator("adah.");
        project.setProjectNum("20170120");
        project.setProjectNum("20170120");
        project.setProjectProgress(30);
        lists.add(project);
        Project project1=new Project();
        project1.setProjectName("1029工程");
        project1.setTimeLimit(30);
        project1.setEngineeringType("系统内工程");
        project1.setProjectType("检测试验");
        project1.setProjectManager("adah...");
        project1.setProjectNum("20170121");
        project1.setInitiator("adah。。");
        project1.setProjectProgress(100);
        lists.add(project1);
        Project project2=new Project();
        project2.setProjectName("1030工程");
        project2.setTimeLimit(30);
        project2.setEngineeringType("系统内工程");
        project2.setProjectType("检测试验");
        project2.setProjectManager("adah...");
        project2.setProjectNum("20170121");
        project2.setInitiator("adah。。");
        project2.setProjectProgress(80);
        lists.add(project2);
        adapter=new InfoStatisticsAdapter(this,lists);
        lv_projects.setAdapter(adapter);

        lv_projects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(InfoStatisticsActivity.this,InfoStatisticsDownloadActivity.class);
                i.putExtra("project",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
