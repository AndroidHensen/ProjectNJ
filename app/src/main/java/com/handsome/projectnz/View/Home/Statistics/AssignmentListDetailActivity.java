package com.handsome.projectnz.View.Home.Statistics;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Statistics.AssignmentProjectAdapter;
import com.handsome.projectnz.Module.Task;
import com.handsome.projectnz.Module.TaskRecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class AssignmentListDetailActivity extends BaseActivity{
    private LinearLayout ll_project;//项目任务
    private LinearLayout ll_office;//办公任务
    private ListView lv_project;//项目任务清单
    private LinearLayout list_office;//办公任务清单

    private TaskRecord taskRecord;
    private List<Task> projectLists;
    private List<Task> officeLists;
    private AssignmentProjectAdapter projectAdapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_assignment_arrange;
    }

    @Override
    public void initViews() {
        ll_project=findView(R.id.ll_project);
        ll_office=findView(R.id.ll_office);
        list_office=findView(R.id.list_office);
        lv_project=findView(R.id.lv_task_prject);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitleCanBack();
        taskRecord=getIntent().getParcelableExtra("task");

        setTitle(taskRecord.getTaskArranger()+"给"+taskRecord.getTaskExecute()+"的项目");

        projectLists=new ArrayList<>();
        Task task=new Task();
        task.setTaskName("界面");
        task.setTaskType("建造");
        task.setTaskNotice("无");
        task.setTaskLimitTime(30);
        task.setTaskProgress(100);
        task.setTaskEndTime("2018-12-12");
        task.setTaskStartTime("2018-11-13");
        task.setTaskSummary("无");
        task.setExecutePerson("Diko");
        task.setTaskAddress("广东梅州");
        task.setTaskBelongProject("1028工程");
        task.setTaskPriority("重要");
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        projectLists.add(task);
        officeLists=projectLists;
        projectAdapter=new AssignmentProjectAdapter(this,projectLists);
        lv_project.setAdapter(projectAdapter);
        addOfficeAssignment(officeLists);
        lv_project.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(AssignmentListDetailActivity.this,AssignmentProjectActivity.class);
                startActivity(i);
            }
        });
    }

    public void addOfficeAssignment(List<Task> tasks){

        for(Task task:tasks){
            View v=LayoutInflater.from(this).inflate(R.layout.adapter_assignment_office,null,false);
            TextView tv_task_name=(TextView)v.findViewById(R.id.task_name);
            TextView tv_task_priority=(TextView)v.findViewById(R.id.task_priority);
            TextView tv_task_time=(TextView)v.findViewById(R.id.task_time);
            TextView tv_task_content=(TextView)v.findViewById(R.id.task_content);
            TextView tv_task_progress=(TextView)v.findViewById(R.id.task_progress);
            tv_task_name.setText(task.getTaskName());
            tv_task_priority.setText(task.getTaskPriority());
            tv_task_time.setText(task.getTaskStartTime());
            tv_task_content.setText(task.getTaskSummary());
            tv_task_progress.setText(task.getTaskProgress()+"%");
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AssignmentListDetailActivity.this,AssignmentOfficeActivity.class);
                    startActivity(i);
                }
            });
            list_office.addView(v);
        }
    }
    @Override
    public void processClick(View v) {

    }
}
