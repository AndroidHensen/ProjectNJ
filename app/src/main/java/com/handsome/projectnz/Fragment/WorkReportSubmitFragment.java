package com.handsome.projectnz.Fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/22.
 */

public class WorkReportSubmitFragment extends BaseLazyFragment {
    private RecyclerView rv_submit;//提交汇报任务
    @Override
    public int getLayoutId() {
        return R.layout.activity_work_report_submit;
    }

    @Override
    public void initViews() {
        rv_submit = findView(R.id.rv_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {

    }
}
