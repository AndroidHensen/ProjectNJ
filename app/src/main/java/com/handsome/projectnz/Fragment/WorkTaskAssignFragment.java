package com.handsome.projectnz.Fragment;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.WorkTaskOfficialAdapter;
import com.handsome.projectnz.Adapter.WorkTaskProjectAdapter;
import com.handsome.projectnz.Module.WorkTaskOfficialMessage;
import com.handsome.projectnz.Module.WorkTaskProjectMessage;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/15.
 * 工作台-工作任务-派给我的
 */

public class WorkTaskAssignFragment extends BaseLazyFragment {
    private ListView lv_project;//项目任务
    private ListView lv_official;//办公任务
    private List<WorkTaskProjectMessage> lists_project;
    private List<WorkTaskOfficialMessage> lists_official;
    private WorkTaskProjectAdapter mAdapter_project;
    private WorkTaskOfficialAdapter mAdapter_official;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_work_task_assign;
    }

    @Override
    public void initViews() {
        lv_project = findView(R.id.lv_project);
        lv_official = findView(R.id.lv_official);

        lists_project = new ArrayList<>();
        lists_official = new ArrayList<>();

        WorkTaskProjectMessage wtm1 = new WorkTaskProjectMessage("紧急", "姚喜", "80%", "2017-10-11至2018-10-11", "6天", "30天");
        WorkTaskOfficialMessage wtm2=new WorkTaskOfficialMessage("XXX", "重要", "2017-12-28", "去机场接人", "待验收");

        lists_project.add(wtm1);
        lists_official.add(wtm2);

        mAdapter_project = new WorkTaskProjectAdapter(getActivity(), lists_project);
        mAdapter_official = new WorkTaskOfficialAdapter(getActivity(), lists_official);

        lv_project.setAdapter(mAdapter_project);
        lv_official.setAdapter(mAdapter_official);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {

    }
}
