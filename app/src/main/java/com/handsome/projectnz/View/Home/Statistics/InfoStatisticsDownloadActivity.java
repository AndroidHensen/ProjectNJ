package com.handsome.projectnz.View.Home.Statistics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.HomeStatisticsInfoView;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

public class InfoStatisticsDownloadActivity extends BaseActivity {
    private HomeStatisticsInfoView hsiv_project_info;//项目基本信息
    private HomeStatisticsInfoView hsiv_info_assignment;//任务资料
    private HomeStatisticsInfoView hsiv_info_invite;//申请资料
    private HomeStatisticsInfoView hsiv_info_intent;//计划资料
    private HomeStatisticsInfoView hsiv_info_signature;//签到资料
    private HomeStatisticsInfoView hsiv_info_material;//物资资料

    private Project project;//项目信息
    @Override
    public int getLayoutId() {
        return R.layout.activity_info_statistics_download;
    }

    @Override
    public void initViews() {
        hsiv_project_info=findView(R.id.project_info);
        hsiv_info_assignment=findView(R.id.info_assignment);
        hsiv_info_invite=findView(R.id.info_invite);
        hsiv_info_intent=findView(R.id.info_intent);
        hsiv_info_signature=findView(R.id.info_signature);
        hsiv_info_material=findView(R.id.info_material);

        project=getIntent().getParcelableExtra("project");
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle(project.getProjectName());
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }

}
