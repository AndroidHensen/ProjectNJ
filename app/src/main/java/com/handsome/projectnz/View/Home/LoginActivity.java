package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class LoginActivity extends BaseActivity {
    private ImageButton ib_wechat;//微信登陆
    private ImageButton ib_qq;//QQ登陆
    private Button btn_register;//注册

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initViews() {
        ib_wechat = findView(R.id.ib_wechat);
        ib_qq = findView(R.id.ib_qq);
        btn_register = findView(R.id.btn_register);
    }

    @Override
    public void initListener() {
    }

    @Override
    public void initData() {
        setTitle("注册");
    }

    @Override
    public void processClick(View v) {

    }
}
