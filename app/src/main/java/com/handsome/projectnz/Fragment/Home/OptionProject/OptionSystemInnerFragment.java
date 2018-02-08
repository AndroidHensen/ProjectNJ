package com.handsome.projectnz.Fragment.Home.OptionProject;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.OptionProject.OptionProjectExpanAdapter;
import com.handsome.projectnz.Adapter.Home.OptionProject.OptionSystemInnerAdapter;
import com.handsome.projectnz.Module.OptionProject;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/23.
 */

public class OptionSystemInnerFragment extends BaseLazyFragment {
    private ListView lv_cotent;//容器
    private OptionSystemInnerAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_option_system_inside;
    }

    @Override
    public void initViews() {
        lv_cotent = findView(R.id.lv_content);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<OptionProject> lists = new ArrayList<OptionProject>();
        OptionProject dailyCheck = new OptionProject("1028", "页面", "app"
                , "30", "90", "hensen");
        lists.add(dailyCheck);
        OptionProject dailyCheck1 = new OptionProject("1028", "页面", "app"
                , "30", "90", "hensen");
        lists.add(dailyCheck1);
        adapter=new OptionSystemInnerAdapter(lists,getActivity());
        lv_cotent.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
