package com.handsome.projectnz.View.Home.MaterialsManagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/2/2.
 * 界面：工作台_物资管理_新建入库
 */
public class NewPutActivity extends BaseActivity {


    private EditText et_project;//项目
    private ImageView iv_project_right;//项目(箭头)
    private EditText et_material_source;//物资来源
    private ImageView iv_material_source_right;//物资来源(箭头)
    private EditText et_material_name;//物资名称
    private ImageView iv_material_name_right;//物资名称(箭头)
    private EditText et_type;//型号规格
    private ImageView iv_type_right;//型号规格(箭头)
    private EditText et_number;//入库数量
    private ImageView iv_number_right;//入库数量(箭头)
    private EditText et_unit;//单位
    private ImageView iv_unit_right;//单位(箭头)
    private EditText et_date;//日期
    private ImageView iv_date_right;//日期(箭头)
    private EditText et_operator;//经办人
    private ImageView iv_operator_right;//经办人(箭头)
    private ImageButton ib_camera;//照相机（入库单凭证）

    @Override
    public int getLayoutId() {
        return R.layout.activity_new_put;
    }

    @Override
    public void initViews() {
        et_project = findView(R.id.et_project);
        iv_project_right = findView(R.id.iv_project_right);
        et_material_source = findView(R.id.et_material_source);
        iv_material_source_right = findView(R.id.iv_material_source_right);
        et_material_name = findView(R.id.et_material_name);
        iv_material_name_right = findView(R.id.iv_material_name_right);
        et_type = findView(R.id.et_type);
        iv_type_right = findView(R.id.iv_type_right);
        et_number = findView(R.id.et_number);
        iv_number_right = findView(R.id.iv_number_right);
        et_unit = findView(R.id.et_unit);
        iv_unit_right = findView(R.id.iv_unit_right);
        et_date = findView(R.id.et_date);
        iv_date_right = findView(R.id.iv_date_right);
        et_operator = findView(R.id.et_operator);
        iv_operator_right = findView(R.id.iv_operator_right);
        ib_camera = findView(R.id.ib_camera);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("新建入库物资");
        setEdit2("提交");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
