package com.handsome.projectnz.Fragment.Home.WorkTask;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.WorkTask.WorkTaskOfficialArrangeAdapter;
import com.handsome.projectnz.Adapter.Home.WorkTask.WorkTaskOfficialAssignAdapter;
import com.handsome.projectnz.Adapter.Home.WorkTask.WorkTaskProjectArrangeAdapter;
import com.handsome.projectnz.Adapter.Home.WorkTask.WorkTaskProjectAssignAdapter;
import com.handsome.projectnz.Module.WorkTaskOfficialMessage;
import com.handsome.projectnz.Module.WorkTaskProjectMessage;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.WorkTask.WorkTaskOfficial.WorkTaskOfficialActivity;
import com.handsome.projectnz.View.Home.WorkTask.WorkTaskProject.WorkTaskProjectActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/15.
 * 工作台-工作任务-我安排的
 */

public class WorkTaskArrangeFragment extends BaseLazyFragment {
    private ListView lv_project;//项目任务
    private ListView lv_official;//办公任务
    private List<WorkTaskProjectMessage> lists_project;
    private List<WorkTaskOfficialMessage> lists_official;
    private WorkTaskProjectArrangeAdapter mAdapter_project;
    private WorkTaskOfficialArrangeAdapter mAdapter_official;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_work_task_arrange;
    }

    @Override
    public void initViews() {
        lv_project = findView(R.id.lv_project);
        lv_official = findView(R.id.lv_official);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        lists_project = new ArrayList<>();
        lists_official = new ArrayList<>();

        WorkTaskProjectMessage wtm1 = new WorkTaskProjectMessage("紧急", "姚喜", "80", "2017-10-11 ", " 2018-10-11", "6", "30");
        WorkTaskOfficialMessage wtm2 = new WorkTaskOfficialMessage("XXX", "重要", "2017-12-28", "去机场接人", "待验收");

        lists_project.add(wtm1);
        lists_official.add(wtm2);

        mAdapter_project = new WorkTaskProjectArrangeAdapter(getActivity(), lists_project);
        mAdapter_official = new WorkTaskOfficialArrangeAdapter(getActivity(), lists_official);

        lv_project.setAdapter(mAdapter_project);
        lv_official.setAdapter(mAdapter_official);

        lv_project.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), WorkTaskProjectActivity.class);
//                i.putExtra("material",lists.get(position));
                startActivity(i);
            }
        });
        lv_official.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), WorkTaskOfficialActivity.class);
//                i.putExtra("material",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
