package com.handsome.projectnz.View.Home.MaterialHandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.MenuBar;
import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.R;

import java.util.Date;

/**
 * Create By Diko （柯东煜） in 2018.1.27
 *
 */

public class StockOutputNewActivity extends BaseActivity{
    private MenuBar mb_project_name;//项目名称
    private MenuBar mb_material_name;//物资名称
    private MenuBar mb_material_type;//物资类型
    private MenuBar mb_material_output_count;//出库数量
    private MenuBar mb_material_department;//物资单位
    private MenuBar mb_output_date;//出库日期
    private MenuBar mb_output_manager;//经办人
    private ImageView iv_output_picture;//出库凭证

    private Material material;//物资信息；

    @Override
    public int getLayoutId() {
        return R.layout.activity_stock_output_new;
    }

    @Override
    public void initViews() {
        mb_project_name=findView(R.id.project_name);
        mb_material_name=findView(R.id.material_name);
        mb_material_type=findView(R.id.material_type);
        mb_material_output_count=findView(R.id.material_output_count);
        mb_material_department=findView(R.id.material_department);
        mb_output_date=findView(R.id.material_date);
        mb_output_manager=findView(R.id.output_manager);
        iv_output_picture=findView(R.id.output_picture);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("新建出库物资");
        setTitleCanBack();
        setEdit2("提交");
        material=getIntent().getParcelableExtra("material");
        if(material!=null){
            mb_material_name.setMenuContentText(material.getName());
            mb_material_type.setMenuContentText(material.getType());
            mb_material_department.setMenuContentText(material.getDepartment());
            mb_material_output_count.setTv_menu_commentText("(存："+material.getKeepCount()+")");
        }
        mb_output_date.setMenuContentText(new Date().toString());
    }

    @Override
    public void processClick(View v) {

    }
}
