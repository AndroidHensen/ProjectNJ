package com.handsome.projectnz.V.Main;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.A.MainAdapter;
import com.handsome.projectnz.F.HomeFragment;
import com.handsome.projectnz.F.MessageFragment;
import com.handsome.projectnz.F.MineFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vp_main;
    private MainAdapter adapter;
    private List<Fragment> list;
    private ImageView iv_bottom_message, iv_bottom_mine, iv_bottom_home;
    private TextView tv_bottom_message, tv_bottom_mine, tv_bottom_home;
    private LinearLayout ly_bottom_home, ly_bottom_message, ly_bottom_mine;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        vp_main = findView(R.id.vp_main);
        iv_bottom_message = findView(R.id.iv_bottom_message);
        iv_bottom_mine = findView(R.id.iv_bottom_mine);
        iv_bottom_home = findView(R.id.iv_bottom_home);
        tv_bottom_message = findView(R.id.tv_bottom_message);
        tv_bottom_mine = findView(R.id.tv_bottom_mine);
        tv_bottom_home = findView(R.id.tv_bottom_home);
        ly_bottom_home = findView(R.id.ly_bottom_home);
        ly_bottom_message = findView(R.id.ly_bottom_message);
        ly_bottom_mine = findView(R.id.ly_bottom_mine);
    }

    @Override
    public void initListener() {
        setOnClick(ly_bottom_home);
        setOnClick(ly_bottom_message);
        setOnClick(ly_bottom_mine);
        vp_main.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.ly_bottom_home:
                iconLight(0);
                break;
            case R.id.ly_bottom_message:
                iconLight(1);
                break;
            case R.id.ly_bottom_mine:
                iconLight(2);
                break;
        }
    }


    /**
     * 初始化碎片
     */
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new MessageFragment());
        list.add(new MineFragment());
        adapter = new MainAdapter(getSupportFragmentManager(), list);
        vp_main.setAdapter(adapter);
        vp_main.setOffscreenPageLimit(3);
        //初始化图标
        iconLight(0);
    }

    /**
     * 图标高亮
     *
     * @param position
     */
    private void iconLight(int position) {
        vp_main.setCurrentItem(position, false);
        iv_bottom_home.setBackgroundResource(position == 0 ? R.drawable.main_bot_tab_home_on : R.drawable.main_bot_tab_home_off);
        iv_bottom_message.setBackgroundResource(position == 1 ? R.drawable.main_bot_tab_message_on : R.drawable.main_bot_tab_message_off);
        iv_bottom_mine.setBackgroundResource(position == 2 ? R.drawable.main_bot_tab_mine_on : R.drawable.main_bot_tab_mine_off);
        tv_bottom_home.setTextColor(position == 0 ? Color.parseColor("#4B72BF") : Color.parseColor("#5D5F6A"));
        tv_bottom_message.setTextColor(position == 1 ? Color.parseColor("#4B72BF") : Color.parseColor("#5D5F6A"));
        tv_bottom_mine.setTextColor(position == 2 ? Color.parseColor("#4B72BF") : Color.parseColor("#5D5F6A"));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //改变图标高亮
        iconLight(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
