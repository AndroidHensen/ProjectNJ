package com.handsome.projectnz.Fragment.Home.Statistics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Spinner;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.Statistics.AssignmentAdapter;
import com.handsome.projectnz.Module.AssignmentRecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class AssignmentExecuteFragment extends BaseLazyFragment {
    private ListView lv_assignment_record;//任务记录
    private Spinner spinner;//快速定位
    private AssignmentAdapter adapter;
    private List<AssignmentRecord> lists;
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
        AssignmentRecord record=new AssignmentRecord();
        record.setAssignmentCount(11);
        record.setAssignmentFinish(9);
        record.setAssignmentType(AssignmentRecord.EXECUTE);
        record.setAssignmentObject("Diko");
        lists.add(record);
        AssignmentRecord record1=new AssignmentRecord();
        record1.setAssignmentCount(100);
        record1.setAssignmentFinish(90);
        record1.setAssignmentType(AssignmentRecord.EXECUTE);
        record1.setAssignmentObject("adah");
        lists.add(record1);
        adapter=new AssignmentAdapter(getActivity(),lists);
        lv_assignment_record.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
