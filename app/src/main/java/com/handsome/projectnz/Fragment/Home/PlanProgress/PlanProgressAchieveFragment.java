package com.handsome.projectnz.Fragment.Home.PlanProgress;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.PlanProgress.PlanProgressAchieveAdapter;
import com.handsome.projectnz.Adapter.Home.PlanProgress.PlanProgressAlreadyAdapter;
import com.handsome.projectnz.Module.PlanProgress;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.PlanDetails.PlanDetailsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/24.
 */

public class PlanProgressAchieveFragment extends BaseLazyFragment {
    private ListView lv_content;//列表展示
    private PlanProgressAchieveAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_progress_achieve;
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
                , "2018-2-1", "20", "40张", "90" ," " );
        lists.add(planProgress);
        PlanProgress planProgress1 = new PlanProgress("完成界面", "质量整改", "杰"
                , "2018-2-1", "20", "40张", "90" ," ");
        lists.add(planProgress1);
        adapter=new PlanProgressAchieveAdapter(lists,getActivity());
        lv_content.setAdapter(adapter);
        lv_content.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), PlanDetailsActivity.class);
//                i.putExtra("material",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
