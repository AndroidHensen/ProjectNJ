package com.handsome.projectnz.View.Home.SignMerit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
/**
 * Created by YX_PC on 2018/1/29.
 * 界面：工作台_签到记功_用工名册
 */
public class RegisterLabourActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_register_labour;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("用工名册");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
