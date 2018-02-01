package com.handsome.projectnz.View.Home.SecurityCheck;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.SecurityCheckInput;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/26.
 */

public class SecurityCheckActivity extends BaseActivity {
    private static final String TAG = "SecurityCheckActivity";
    private SecurityCheckInput SecurityCheckInput_input;//组合控件（上方搜索栏）
    private Button bt_search;//搜索按钮
    private RecyclerView rv_content;//下方内容
    private ImageButton ib_find;//收索栏的搜索镜
    private String SecurityCheckInput_input_content;//搜索栏所填文本

    @Override
    public int getLayoutId() {
        return R.layout.activity_security_check;
    }

    @Override
    public void initViews() {
        SecurityCheckInput_input = findView(R.id.SecurityCheckInput_input);
        bt_search = findView(R.id.bt_search);
        rv_content = findView(R.id.rv_content);
        ib_find = SecurityCheckInput_input.getIb_find();
        SecurityCheckInput_input_content = SecurityCheckInput_input.gettext();
    }

    @Override
    public void initListener() {
        bt_search.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("安全检查");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.bt_search:
                SecurityCheckInput_input_content = SecurityCheckInput_input.gettext();
                Log.d(TAG, "initViews: " + SecurityCheckInput_input_content);
                break;
            default:
                break;
        }
    }
}