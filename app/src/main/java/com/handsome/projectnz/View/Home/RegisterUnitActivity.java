package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.EditText;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/13.
 */

public class RegisterUnitActivity extends BaseActivity {

    private EditText et_unit_name;

    @Override
    public int getLayoutId() {
        return R.layout.activity_register_unit;
    }

    @Override
    public void initViews() {
        et_unit_name = findView(R.id.et_unit_name);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("注册");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
