package com.handsome.projectnz.View.Home.PlanDetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Plandetail.PlanStaffRosterAdapter;
import com.handsome.projectnz.Module.PlanStaffRoster;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/27.
 * 界面：工作台_计划详情_人员名册
 */
public class PlanStaffRosterActivity extends BaseActivity {
    private ListView lv_content;//listview控件
    private PlanStaffRosterAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_staff_roster;
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
        setTitle("人员名册");
        setTitleCanBack();
        List<PlanStaffRoster> lists = new ArrayList<PlanStaffRoster>();
        PlanStaffRoster lanStaffRoster = new PlanStaffRoster("林楚杰", "安卓工程师", "1781111111"
                , "@qq.com", "本部人员");
        lists.add(lanStaffRoster);
        PlanStaffRoster lanStaffRoster1 = new PlanStaffRoster("姚喜", "安卓工程师", "1782222222"
                , "@qq.com", "本部人员");
        lists.add(lanStaffRoster1);
        adapter=new PlanStaffRosterAdapter(lists,PlanStaffRosterActivity.this);
        lv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
