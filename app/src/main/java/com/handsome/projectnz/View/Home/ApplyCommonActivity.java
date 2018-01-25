package com.handsome.projectnz.View.Home;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.ApplyCommonApprovalFragment;
import com.handsome.projectnz.Fragment.Register.ApplyCommonSubmitFragment;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Main.MainActivity;

import java.util.ArrayList;

public class ApplyCommonActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    private ImageButton ib_find;
    private ImageButton ib_add;
    private Button btn_approval;
    private Button btn_submit;
    private ViewPager vp_apply_common;
    private ArrayList<Fragment> list;
    private MainAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_apply_common;
    }

    @Override
    public void initViews() {
        ib_find = findView(R.id.ib_find);
        ib_add = findView(R.id.ib_add);
        btn_approval = findView(R.id.btn_approval);
        btn_submit = findView(R.id.btn_submit);
        vp_apply_common = findView(R.id.vp_apply_common);
    }

    @Override
    public void initListener() {
        setOnClick(btn_approval);
        setOnClick(btn_submit);
        vp_apply_common.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        setTitle("通用申请");
        setTitleCanBack();
        initFragments();
    }

    private void initFragments() {
        list = new ArrayList<Fragment>();
        list.add(new ApplyCommonApprovalFragment());
        list.add(new ApplyCommonSubmitFragment());
        adapter =new MainAdapter(this.getSupportFragmentManager(),list);
        vp_apply_common.setAdapter(adapter);
        vp_apply_common.setOffscreenPageLimit(1);
        onPageSelected(0);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.btn_approval:
                onPageSelected(0);
                break;
            case R.id.btn_submit:
                onPageSelected(1);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        vp_apply_common.setCurrentItem(position);
        if (position == 0) {
            btn_approval.setBackgroundColor(Color.WHITE);
            btn_approval.setTextColor(Color.parseColor("#3F51B5"));
            btn_submit.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_submit.setTextColor(Color.WHITE);
        } else {
            btn_approval.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_approval.setTextColor(Color.WHITE);
            btn_submit.setBackgroundColor(Color.WHITE);
            btn_submit.setTextColor(Color.parseColor("#3F51B5"));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
