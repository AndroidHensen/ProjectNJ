package com.handsome.projectnz.View.Home.Statistics;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Home.Statistics.AssignmentArrangeFragment;
import com.handsome.projectnz.Fragment.Home.Statistics.AssignmentExecuteFragment;
import com.handsome.projectnz.Fragment.Message.MessageAssignmentFragment;
import com.handsome.projectnz.Fragment.Message.MessageCompanyNoticeFragment;
import com.handsome.projectnz.Fragment.Message.MessageOfficeFragment;
import com.handsome.projectnz.Fragment.Message.MessageSystemFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class AssignmentStatisticsActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    private LinearLayout ll_arrange;//我安排的
    private LinearLayout ll_execute;//我执行的
    private TextView tv_arrange_text;//我安排的text
    private TextView tv_execute_text;//我执行的text
    private ImageView iv_arrange_ic;//我安排的icon
    private ImageView iv_execute_ic;//我执行的icon
    private ViewPager vp;

    private List<Fragment> list;
    private MainAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_assignment_statistics;
    }

    @Override
    public void initViews() {
        ll_arrange = findView(R.id.assignment_arrange);
        ll_execute = findView(R.id.assignment_execute);
        tv_arrange_text = findView(R.id.assignment_arrange_text);
        tv_execute_text = findView(R.id.assignment_execute_text);
        iv_arrange_ic = findView(R.id.assignment_arrange_ic);
        iv_execute_ic = findView(R.id.assignment_execute_ic);
        vp = findView(R.id.vp);

    }

    @Override
    public void initListener() {
        setOnClick(ll_arrange);
        setOnClick(ll_execute);
        vp.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        setTitle("任务统计");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.assignment_arrange:
                selectPager(0);
                break;
            case R.id.assignment_execute:
                selectPager(1);
                break;
        }
    }

    /**
     * 初始化碎片
     */
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new AssignmentArrangeFragment());
        list.add(new AssignmentExecuteFragment());
        adapter = new MainAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(adapter);
        selectPager(0);
    }

    public void selectPager(int position) {
        vp.setCurrentItem(position);
        int grey=getResources().getColor(R.color.gray);
        int blue=getResources().getColor(R.color.blue);
        Drawable drawable_arrange_selected=getResources().getDrawable(R.drawable.home_statistics_assignment_arrange_selected);
        Drawable drawable_arrange_unselected=getResources().getDrawable(R.drawable.home_statistics_assignment_arrange_unselected);
        Drawable drawable_execute_selected=getResources().getDrawable(R.drawable.home_statistics_assignment_execute_selected);
        Drawable drawable_execute_unselected=getResources().getDrawable(R.drawable.home_statistics_assignment_execute_unselected);

        tv_arrange_text.setTextColor(position == 0 ? blue : grey);
        tv_execute_text.setTextColor(position == 1 ? blue : grey);
        iv_execute_ic.setBackground(position == 1 ? drawable_execute_selected : drawable_execute_unselected);
        iv_arrange_ic.setBackground(position==0?drawable_arrange_selected:drawable_arrange_unselected);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        selectPager(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
