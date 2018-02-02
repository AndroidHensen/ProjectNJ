package com.handsome.projectnz.Fragment.Home.WorkReport;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.WorkReport.WorkRportReceiveAdaptere;
import com.handsome.projectnz.Module.WorkReport;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.WorkReport.WorkReportContentAcitvity;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;

/**
 * Created by jie on 2018/1/22.
 */

public class WorkReportSubmitFragment extends BaseLazyFragment {
    private ListView rv_submit;//提交汇报任务
    WorkRportReceiveAdaptere adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_work_report_submit;
    }

    @Override
    public void initViews() {
        rv_submit = findView(R.id.rv_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<WorkReport> lists = new ArrayList<WorkReport>();
        WorkReport workReport = new WorkReport("新春大吉", "2017-12-24", "大吉大利晚上吃鸡"
                ,FALSE);
        lists.add(workReport);
        WorkReport workReport1 = new WorkReport("新春大吉", "2017-12-24", "大吉大利晚上吃鸡"
                ,true);
        lists.add(workReport1);
        adapter=new WorkRportReceiveAdaptere(getActivity(),lists);
        rv_submit.setAdapter(adapter);
        rv_submit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), WorkReportContentAcitvity.class);
//                i.putExtra("material",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
