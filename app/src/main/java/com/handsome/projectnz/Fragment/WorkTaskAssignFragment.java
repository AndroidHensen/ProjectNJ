package com.handsome.projectnz.Fragment;

import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by YX_PC on 2018/1/15.
 */

public class WorkTaskAssignFragment extends BaseLazyFragment {
    private TextView tv_assign;
    private ArrayList<TextView> lists;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_work_task_assign;
    }

    @Override
    public void initViews() {
        tv_assign=findView(R.id.tv_assign);
        lists=new ArrayList<TextView>();
        lists.add(tv_assign);
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
