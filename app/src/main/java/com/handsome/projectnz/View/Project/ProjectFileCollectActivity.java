package com.handsome.projectnz.View.Project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.ProjectDataFileView;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.Module.ProjectDataFile;
import com.handsome.projectnz.R;

import org.w3c.dom.Text;

public class ProjectFileCollectActivity extends BaseActivity{
    private TextView tv_project_name;
    private TextView tv_project_type;
    private TextView tv_project_num;
    private ProjectDataFileView pdfv_info_technology;
    private ProjectDataFileView pdfv_info_material;
    private ProjectDataFileView pdfv_info_work;
    private ProjectDataFileView pdfv_info_detection;
    private Project project;
    @Override
    public int getLayoutId() {
        return R.layout.activity_project_file_collect;
    }

    @Override
    public void initViews() {
        tv_project_name=findView(R.id.project_name);
        tv_project_num=findView(R.id.project_num);
        tv_project_type=findView(R.id.project_type);
        pdfv_info_technology=findView(R.id.info_technology);
        pdfv_info_material=findView(R.id.info_material);
        pdfv_info_detection=findView(R.id.info_detection);
        pdfv_info_work=findView(R.id.info_work);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        project=getIntent().getParcelableExtra("project");
        setTitleCanBack();
        setTitle("项目资料收集");
        tv_project_name.setText(project.getProjectName());
        tv_project_num.setText(project.getProjectNum());
        tv_project_type.setText(project.getProjectType());
        ProjectDataFile file=new ProjectDataFile();
        file.setFileName("文件1.xml");
        pdfv_info_technology.addFile(file);
        ProjectDataFile file1=new ProjectDataFile();
        file1.setFileName("文件2.xml");
        pdfv_info_technology.addFile(file1);
        ProjectDataFile file2=new ProjectDataFile();
        file2.setFileName("文件3.xml");
        pdfv_info_technology.addFile(file2);
        ProjectDataFile file3=new ProjectDataFile();
        file3.setFileName("文件4.xml");
        pdfv_info_technology.addFile(file3);

    }

    @Override
    public void processClick(View v) {

    }
}
