package com.handsome.projectnz.View.Home.MaterialsManagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/2/2.
 * 界面：工作台_物资管理
 */
public class MaterialsManagementActivity extends BaseActivity {


    private ImageButton ib_put;//入库
    private ImageButton ib_out;//出库
    private LinearLayout ly_repertory;//库存
    private LinearLayout ly_put;//入库
    private LinearLayout ly_out;//出库

    @Override
    public int getLayoutId() {
        return R.layout.activity_materials_management;
    }

    @Override
    public void initViews() {
        ib_put = findView(R.id.ib_put);
        ib_out = findView(R.id.ib_out);
        ly_repertory = findView(R.id.ly_repertory);
        ly_put = findView(R.id.ly_put);
        ly_out = findView(R.id.ly_out);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("物资管理");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}