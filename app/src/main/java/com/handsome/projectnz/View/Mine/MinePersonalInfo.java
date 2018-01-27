package com.handsome.projectnz.View.Mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class MinePersonalInfo extends BaseActivity {
    private TextView tv_my_name;//我的名字
    private TextView tv_my_id;//我的身份证
    private TextView tv_my_id_one;//身份证正面
    private TextView tv_my_id_two;//身份证反面
    private TextView tv_my_phone;//手机号码
    private TextView tv_my_email;//邮箱
    private TextView tv_my_company;//单位名称
    private TextView tv_my_department;//部门名称
    private Button bn_my_position;//职务
    private ImageView iv_my_photo_1;//我的照片1
    private ImageView iv_my_photo_2;//我的照片2
    private ImageView iv_my_photo_3;//我的照片3
    private ImageView iv_my_photo_4;//我的照片4
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_personal_info;
    }

    @Override
    public void initViews() {
        tv_my_name=findView(R.id.my_name);
        tv_my_id=findView(R.id.my_id_num);
        tv_my_id_one=findView(R.id.my_id_one);
        tv_my_id_two=findView(R.id.my_id_two);
        tv_my_phone=findView(R.id.my_phone);
        tv_my_email=findView(R.id.my_email);
        tv_my_company=findView(R.id.my_company);
        tv_my_department=findView(R.id.my_department);
        bn_my_position=findView(R.id.my_position);
        iv_my_photo_1=findView(R.id.my_photo_1);
        iv_my_photo_2=findView(R.id.my_photo_2);
        iv_my_photo_3=findView(R.id.my_photo_3);
        iv_my_photo_4=findView(R.id.my_photo_4);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("个人资料");
        setEdit2("修改");
        setTitleCanBack();

    }

    @Override
    public void processClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_edit2:
                Intent i=new Intent(this,MinePersonalInfoCorrect.class);
                startActivity(i);
                break;
        }
    }
}
