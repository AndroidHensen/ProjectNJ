package com.handsome.projectnz.Fragment.Home.Statistics;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.Statistics.AssignmentAdapter;
import com.handsome.projectnz.Module.TaskRecord;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.Statistics.AssignmentListDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class AssignmentExecuteFragment extends BaseLazyFragment {
    private ListView lv_assignment_record;//任务记录
    private Spinner spinner;//快速定位
    private AssignmentAdapter adapter;
    private List<TaskRecord> lists;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_assignment_execute;
    }

    @Override
    public void initViews() {
        lv_assignment_record=findView(R.id.lv);
        spinner=findView(R.id.spinner);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        lists=new ArrayList<>();
        TaskRecord record=new TaskRecord();
        record.setTaskCount(11);
        record.setTaskFinish(9);
        record.setTaskExecute("Adah");
        record.setTaskArranger("Diko");
        lists.add(record);
        TaskRecord record1=new TaskRecord();
        record1.setTaskCount(100);
        record1.setTaskFinish(90);
        record1.setTaskExecute("Adah");
        record1.setTaskArranger("Diko");
        lists.add(record1);
        adapter=new AssignmentAdapter(getActivity(),lists);
        adapter.showType=1;
        lv_assignment_record.setAdapter(adapter);
        lv_assignment_record.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), AssignmentListDetailActivity.class);
                i.putExtra("task",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
