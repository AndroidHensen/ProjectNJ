package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.TaskCheckAndAcceptAdapter;
import com.handsome.projectnz.Module.Task;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class TaskCheckAndAcceptActivity extends BaseActivity{
    private ListView lv;
    private TaskCheckAndAcceptAdapter adapter;
    private List<Task> lists;
    @Override
    public int getLayoutId() {
        return R.layout.activity_task_check_and_accept;
    }

    @Override
    public void initViews() {
        lv=findView(R.id.lv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("完工验收");
        setTitleCanBack();
        lists=new ArrayList<>();
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
        lists.add(task);
        adapter=new TaskCheckAndAcceptAdapter(this,lists);
        lv.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
