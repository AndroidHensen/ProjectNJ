package com.handsome.projectnz.Fragment.Home.OptionProject;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.OptionProject.OptionProjectElseAdapter;
import com.handsome.projectnz.Adapter.Home.OptionProject.OptionProjectExpanAdapter;
import com.handsome.projectnz.Module.OptionProject;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/23.
 */

public class OptionProjectExpanFragment extends BaseLazyFragment {
    private ListView lv_content;//容器
    private OptionProjectExpanAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_option_project_expan;
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
        List<OptionProject> lists = new ArrayList<OptionProject>();
        OptionProject optionProject = new OptionProject("1028", "页面", "app"
                , "30", "90", "hensen");
        lists.add(optionProject);
        OptionProject optionProject1 = new OptionProject("1028", "页面", "app"
                , "30", "90", "hensen");
        lists.add(optionProject1);
        adapter=new OptionProjectExpanAdapter(lists,getActivity());
        lv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
