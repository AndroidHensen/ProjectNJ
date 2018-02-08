package com.handsome.projectnz.Fragment.Home.ApplyCommon;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.ApplyCommon.ApplyCommomSubmitAdapter;
import com.handsome.projectnz.Module.ApplyCommon;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/25.
 */

public class ApplyCommonSubmitFragment extends BaseLazyFragment {
    private ListView lv_content;//listview容器
    private ApplyCommomSubmitAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_apply_common_submit;
    }

    @Override
    public void initViews() {
        lv_content = findView(R.id.lv_content);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<ApplyCommon> lists = new ArrayList<ApplyCommon>();
        ApplyCommon applyCommon = new ApplyCommon("立项审批", "2018-1-1", "待审批");
        lists.add(applyCommon);
        ApplyCommon applyCommon1 = new ApplyCommon("有新的单位注册", "2018-1-1", "已审批");
        lists.add(applyCommon1);
        ApplyCommon applyCommon2 = new ApplyCommon("有新的个人注册", "2018-1-1", "审批不通过");
        lists.add(applyCommon2);
        adapter=new ApplyCommomSubmitAdapter(lists,getActivity());
        lv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
