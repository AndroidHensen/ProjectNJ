package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/30.
 * 界面：工作台_签到记功_用工名册_新建工人信息
 */
public class WorkerInformationNewActivity extends BaseActivity {


    private EditText et_name;//姓名
    private EditText et_id_number;//身份证号码
    private EditText et_phone;//电话
    private EditText et_email;//邮箱
    private EditText et_daily_wages;//日工资
    private ImageView iv_camera_add;//证件照片(添加按钮)

    @Override
    public int getLayoutId() {
        return R.layout.activity_worker_information_new;
    }

    @Override
    public void initViews() {
        et_name=findView(R.id.et_name);
        et_id_number=findView(R.id.et_id_number);
        et_phone=findView(R.id.et_phone);
        et_email=findView(R.id.et_email);
        et_daily_wages=findView(R.id.et_daily_wages);
        iv_camera_add=findView(R.id.iv_camera_add);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("新建工人信息");
        setEdit2("保存");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
