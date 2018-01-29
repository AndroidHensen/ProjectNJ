package com.handsome.projectnz.View.Home.MaterialHandling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialStreamAdapter;
import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.Module.MaterialStream;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class MaterialStreamActivity extends BaseActivity{
    private TextView tv_material_name;//名称
    private TextView tv_material_type;//规格
    private TextView tv_material_source;//类别，来源
    private TextView tv_material_department;//单位
    private ListView lv;

    private Material material;
    private MaterialStreamAdapter adapter;
    private List<MaterialStream> lists;
    @Override
    public int getLayoutId() {
        return R.layout.activity_material_stream;
    }

    @Override
    public void initViews() {
        tv_material_name=findView(R.id.material_name);
        tv_material_type=findView(R.id.material_type);
        tv_material_source=findView(R.id.source);
        tv_material_department=findView(R.id.department);
        lv=findView(R.id.lv);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("物资流水");
        setTitleCanBack();
        setEdit2("编辑");
        material=getIntent().getParcelableExtra("material");
        if(material!=null){
            tv_material_name.setText(material.getName());
            tv_material_type.setText(material.getType());
            tv_material_department.setText(material.getDepartment());
            tv_material_source.setText(material.getSource());
        }
        lists=new ArrayList<>();
        MaterialStream ms=new MaterialStream();
        ms.setStreamCount(-100);
        ms.setBelongProject("1028工程");
        ms.setStreamDate("2018-11-23");
        ms.setStreamHandler("Diko");
        lists.add(ms);
        MaterialStream ms1=new MaterialStream();
        ms1.setStreamCount(100);
        ms1.setBelongProject("1028工程");
        ms1.setStreamDate("2018-11-23");
        ms1.setStreamHandler("Diko");
        lists.add(ms1);
        MaterialStream ms3=new MaterialStream();
        ms3.setStreamCount(0);
        ms3.setBelongProject("1028工程");
        ms3.setStreamDate("2018-11-23");
        ms3.setStreamHandler("Diko");
        lists.add(ms3);
        adapter=new MaterialStreamAdapter(this,lists);
        lv.setAdapter(adapter);

    }

    @Override
    public void processClick(View v) {
        switch (v.getId()){
            case R.id.tv_edit2:
                Intent i=new Intent(this,MaterialEditActivity.class);
                i.putExtra("material",material);
                startActivity(i);
                break;
        }
    }
}
