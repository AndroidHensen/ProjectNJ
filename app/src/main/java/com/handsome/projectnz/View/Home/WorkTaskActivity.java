package com.handsome.projectnz.View.Home;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.WorkTaskArrangeFragment;
import com.handsome.projectnz.Fragment.WorkTaskAssignFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;

/**
 * Created by YX_PC on 2018/1/15.
 */

public class WorkTaskActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    private Button btn_assign;//派给我的
    private Button btn_arrange;//我安排的
    private ViewPager vp_work_task;
    private ArrayList<Fragment> list;
    private MainAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task;
    }

    @Override
    public void initViews() {
        btn_assign = findView(R.id.btn_assign);
        btn_arrange = findView(R.id.btn_arrange);
        vp_work_task = findView(R.id.vp_work_task);
    }

    @Override
    public void initListener() {
        setOnClick(btn_assign);
        setOnClick(btn_arrange);
        vp_work_task.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        setTitle("工作任务");
        setTitleCanBack();
       initFragments();
    }
    /**
     * 初始化碎片
     */
    private void initFragments() {
        list=new ArrayList<Fragment>();
        list.add(new WorkTaskAssignFragment());
        list.add(new WorkTaskArrangeFragment());
        adapter=new MainAdapter(this.getSupportFragmentManager(),list);
        vp_work_task.setAdapter(adapter);
        vp_work_task.setOffscreenPageLimit(1);
        onPageSelected(0);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()){
            case R.id.btn_assign:
                onPageSelected(0);
                break;
            case R.id.btn_arrange:
                onPageSelected(1);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        vp_work_task.setCurrentItem(position);
        if(position==0){
            btn_assign.setBackgroundColor(Color.WHITE);
            btn_assign.setTextColor(Color.parseColor("#3F51B5"));
            btn_arrange.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_arrange.setTextColor(Color.WHITE);
        }else{
            btn_assign.setBackgroundColor(Color.parseColor("#3F51B5"));
            btn_assign.setTextColor(Color.WHITE);
            btn_arrange.setBackgroundColor(Color.WHITE);
            btn_arrange.setTextColor(Color.parseColor("#3F51B5"));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
