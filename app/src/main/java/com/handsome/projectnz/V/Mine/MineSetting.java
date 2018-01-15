package com.handsome.projectnz.V.Mine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

import java.util.List;

/**
 * Created by Diko(柯东煜) 2018.1.15
 * 对应 主界面-我的模块-设置
 */
public class MineSetting extends BaseActivity {
    private LinearLayout ll_version_information;
    private TextView tv_version_num;
    private Button b_logout;

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_setting;
    }

    @Override
    public void initViews() {
        ll_version_information = findView(R.id.version_information);
        tv_version_num = findView(R.id.version_num);
        b_logout = findView(R.id.logout);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("设置");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
