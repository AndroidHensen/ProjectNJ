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

public class AssignmentArrangeFragment extends BaseLazyFragment {
    private ListView lv_assignment_record;//任务记录
    private Spinner spinner;//快速定位
    private AssignmentAdapter adapter;
    private List<TaskRecord> lists;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_assignment_arrange;
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
        record.setTaskCount(10);
        record.setTaskFinish(9);
        record.setTaskArranger("Adah");
        record.setTaskExecute("Diko");
        lists.add(record);
        TaskRecord record1=new TaskRecord();
        record1.setTaskCount(10);
        record1.setTaskFinish(9);
        record1.setTaskArranger("Adah");
        record1.setTaskExecute("Diko");
        lists.add(record1);

        adapter=new AssignmentAdapter(getActivity(),lists);
        adapter.showType=0;
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
