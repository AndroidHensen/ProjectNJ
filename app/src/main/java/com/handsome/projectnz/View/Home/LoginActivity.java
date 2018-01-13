package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class LoginActivity extends BaseActivity {

    private Button btn_login;
    private TextView tv_username;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initViews() {
    }

    @Override
    public void initListener() {
    }

    @Override
    public void initData() {
        initLoginData();
        initRegisterData();
        initUserData();
    }


    @Override
    public void processClick(View v) {
        switch (v.getId()){

        }
    }

    private void initLoginData() {

    }


    private void initUserData() {
    }

    private void initRegisterData() {
    }
}
