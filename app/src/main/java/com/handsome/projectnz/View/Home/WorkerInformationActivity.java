package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/31.
 * 界面：工作台_签到记功_用工名册_工人信息
 */
public class WorkerInformationActivity extends BaseActivity {

    private TextView tv_name;//姓名
    private TextView tv_id_number;//身份证号码
    private TextView tv_address;//地址
    private TextView tv_phone;//电话
    private TextView tv_email;//邮箱
    private TextView tv_daily_wages;//日工资
    private TextView tv_remark;//备注
    private ImageView iv_camera_add;//证件照片(添加按钮)
    private Button btn_remove;//移除工人

    @Override
    public int getLayoutId() {
        return R.layout.activity_worker_information;
    }

    @Override
    public void initViews() {
        tv_name = findView(R.id.tv_name);
        tv_id_number = findView(R.id.tv_id_number);
        tv_address = findView(R.id.tv_address);
        tv_phone = findView(R.id.tv_phone);
        tv_email = findView(R.id.tv_email);
        tv_daily_wages = findView(R.id.tv_daily_wages);
        tv_remark = findView(R.id.tv_remark);
        iv_camera_add = findView(R.id.iv_camera_add);
        btn_remove = findView(R.id.btn_remove);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("工人信息");
        setEdit2("保存");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
