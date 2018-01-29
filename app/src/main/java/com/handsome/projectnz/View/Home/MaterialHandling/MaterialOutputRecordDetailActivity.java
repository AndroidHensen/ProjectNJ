package com.handsome.projectnz.View.Home.MaterialHandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialIODetailAdapter;
import com.handsome.projectnz.Module.MaterialIO;
import com.handsome.projectnz.Module.MaterialIORecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class MaterialOutputRecordDetailActivity extends BaseActivity{
    private ListView lv_records;
    private TextView tv_date;
    private MaterialIODetailAdapter adapter;
    private List<MaterialIO> lists;
    private MaterialIORecord record;
    @Override
    public int getLayoutId() {
        return R.layout.activity_material_io_record_detail;
    }

    @Override
    public void initViews() {
        tv_date=findView(R.id.records_time);
        lv_records=findView(R.id.lv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("出库记录详情");
        setTitleCanBack();
        record=getIntent().getParcelableExtra("record");
        tv_date.setText(record.getDate() );

        lists=new ArrayList<>();

        MaterialIO input=new MaterialIO();
        input.setProject_name("1028工程");
        input.setMaterial_name("枪支");
        input.setMaterial_type("AK47");
        input.setMaterial_department("把");
        input.setMaterial_handler("Diko");
        input.setMaterial_io_count(1000);
        input.setMaterial_io_date("2018-01-10");
        lists.add(input);
        MaterialIO input1=new MaterialIO();
        input1.setProject_name("1028工程");
        input1.setMaterial_name("枪支");
        input1.setMaterial_type("AK47");
        input1.setMaterial_department("把");
        input1.setMaterial_handler("Diko");
        input1.setMaterial_io_count(1000);
        input1.setMaterial_io_date("2018-01-10");
        lists.add(input1);
        adapter=new MaterialIODetailAdapter(this,lists);
        lv_records.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {

    }
}
