package com.handsome.projectnz.Fragment;

import android.content.Intent;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.LoginActivity;
import com.handsome.projectnz.View.Home.RegisterActivity;

/**
 * Created by handsome on 2016/4/7.
 */
public class HomeFragment extends BaseLazyFragment {

    @Override
    public int getLayoutId() {
        return R.layout.activity_workbench;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("工作台");
        setEdit("登陆");
        setEdit2("注册");
    }

    @Override
    public void processClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.tv_edit://登陆
                i=new Intent(getActivity(), LoginActivity.class);
                startActivity(i);
                break;
            case R.id.tv_edit2://注册
                i=new Intent(getActivity(), RegisterActivity.class);
                startActivity(i);
                break;
        }
    }
}
