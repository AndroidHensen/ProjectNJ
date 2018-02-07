package com.handsome.projectnz.View.Home.PlanDetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Plandetail.PlanScheduleRecordAdapter;
import com.handsome.projectnz.Module.PlanScheduleRecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/15.
 * 界面：工作台_进度计划_计划详情_反馈记录
 */
public class PlanScheduleRecordActivity extends BaseActivity {
    private ListView lv_content;//listview控件
    private PlanScheduleRecordAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_schedule_record;
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
        setTitle("反馈记录");
        setTitleCanBack();
        List<PlanScheduleRecord> lists = new ArrayList<PlanScheduleRecord>();
        PlanScheduleRecord planScheduleRecord = new PlanScheduleRecord("2019-12-23", "林楚杰", "3000"
                , "90");
        lists.add(planScheduleRecord);
        PlanScheduleRecord  planScheduleRecord1= new PlanScheduleRecord("2019-12-23", "姚喜", "3000"
                , "90");
        lists.add(planScheduleRecord1);
        adapter=new PlanScheduleRecordAdapter(lists,PlanScheduleRecordActivity.this);
        lv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
