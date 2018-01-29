package com.handsome.projectnz.View.Home.MaterialHandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.MenuBar;
import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.R;

public class MaterialEditActivity extends BaseActivity{
    private MenuBar mb_material_name;//物资名称
    private MenuBar mb_material_type;//物资规格
    private MenuBar mb_material_department;//物资单位

    private Material material;

    @Override
    public int getLayoutId() {
        return R.layout.activity_material_edit;
    }

    @Override
    public void initViews() {
        mb_material_name=findView(R.id.material_name);
        mb_material_type=findView(R.id.material_type);
        mb_material_department=findView(R.id.material_department);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("编辑物资");
        setTitleCanBack();
        setEdit2("提交");
        material=getIntent().getParcelableExtra("material");
        if(material!=null){
            mb_material_name.setMenuContentText(material.getName());
            mb_material_type.setMenuContentText(material.getType());
            mb_material_department.setMenuContentText(material.getDepartment());
        }
    }

    @Override
    public void processClick(View v) {

    }
}
