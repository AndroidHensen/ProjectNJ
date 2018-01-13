package com.handsome.projectnz.Fragment;

import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

/**
 * Created by handsome on 2016/4/7.
 */
public class MessageFragment extends BaseLazyFragment {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_message;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("消息");
    }

    @Override
    public void processClick(View v) {

    }
}
