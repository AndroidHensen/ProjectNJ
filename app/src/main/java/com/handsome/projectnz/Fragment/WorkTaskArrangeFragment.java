package com.handsome.projectnz.Fragment;

import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by YX_PC on 2018/1/15.
 */

public class WorkTaskArrangeFragment extends BaseLazyFragment {
    private TextView tv_arrange;
    private ArrayList<TextView> lists;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_work_task_arrange;
    }

    @Override
    public void initViews() {
        tv_arrange = findView(R.id.tv_arrange);
        lists = new ArrayList<TextView>();
        lists.add(tv_arrange);
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
