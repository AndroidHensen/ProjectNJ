package com.handsome.projectnz.View.Home.MaterialHandling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialIORecordAdapter;
import com.handsome.projectnz.Module.MaterialIORecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class MaterialOutputRecordActivity extends BaseActivity{
    private ListView lv_record;
    private List<MaterialIORecord> records;
    private MaterialIORecordAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_material_io_record;
    }

    @Override
    public void initViews() {
        lv_record=findView(R.id.lv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitleCanBack();
        setTitle("出库记录");
        records=new ArrayList<>();
        MaterialIORecord record=new MaterialIORecord();
        record.setDate("2018-11-23");
        record.setCount(3);
        record.setHandler("Diko");
        record.setBelong("初期");
        records.add(record);
        MaterialIORecord record1=new MaterialIORecord();
        record1.setDate("2018-11-23");
        record1.setCount(3);
        record1.setHandler("adah.");
        record1.setBelong("初期");
        records.add(record);
        adapter=new MaterialIORecordAdapter(this,records);
        lv_record.setAdapter(adapter);
        lv_record.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MaterialOutputRecordActivity.this,MaterialOutputRecordDetailActivity.class);
                i.putExtra("record",records.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
