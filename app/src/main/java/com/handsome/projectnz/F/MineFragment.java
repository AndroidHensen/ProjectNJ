package com.handsome.projectnz.F;

import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;
import com.handsome.projectnz.V.MyView.FastMenuBar;

/**
 * Created by Diko on 2018/1/13.
 */
public class MineFragment extends BaseLazyFragment {
    private FastMenuBar fmb_company_information;
    private FastMenuBar fmb_help;
    private FastMenuBar fmb_cache_clean_up;
    private FastMenuBar fmb_feedback;
    private FastMenuBar fmb_setting;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initViews() {
        fmb_company_information=findView(R.id.company_information);
        fmb_help=findView(R.id.help);
        fmb_cache_clean_up=findView(R.id.cache_clean_up);
        fmb_setting=findView(R.id.setting);
        fmb_feedback=findView(R.id.feedback);
    }
    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("我的");
    }

    @Override
    public void processClick(View v) {

    }
}
