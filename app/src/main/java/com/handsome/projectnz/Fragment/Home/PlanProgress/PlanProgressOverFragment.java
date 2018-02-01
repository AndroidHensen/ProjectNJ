package com.handsome.projectnz.Fragment.Home.PlanProgress;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.PlanProgress.PlanProgressAlreadyAdapter;
import com.handsome.projectnz.Adapter.Home.PlanProgress.PlanProgressOverAdapter;
import com.handsome.projectnz.Module.PlanProgress;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/24.
 */

public class PlanProgressOverFragment extends BaseLazyFragment {
    private ListView lv_content;//列表展示
    private PlanProgressOverAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_progress_over;
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
        List<PlanProgress> lists = new ArrayList<PlanProgress>();
        PlanProgress planProgress = new PlanProgress("完成界面", "建造", "杰"
                , "2018-2-1", "20", "40张", "90" ,"20" );
        lists.add(planProgress);
        PlanProgress planProgress1 = new PlanProgress("完成界面", "质量整改", "杰"
                , "2018-2-1", "20", "40张", "90" ,"23");
        lists.add(planProgress1);
        adapter=new PlanProgressOverAdapter(lists,getActivity());
        lv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
