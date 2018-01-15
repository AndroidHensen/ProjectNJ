package com.handsome.projectnz.View.Home;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.Fragment.Register.RegisterCarFragment;
import com.handsome.projectnz.Fragment.Register.RegisterMachineFragment;
import com.handsome.projectnz.Fragment.Register.RegisterPersonalFragment;
import com.handsome.projectnz.Fragment.Register.RegisterUnitFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    private TextView register_car;
    private TextView register_machine;
    private TextView register_personal;
    private TextView register_unit;
    private ViewPager vp_register;
    private List<Fragment> list;
    private MainAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void initViews() {
        register_car=findView(R.id.register_car);
        register_machine=findView(R.id.register_machine);
        register_personal=findView(R.id.register_personal);
        register_unit=findView(R.id.register_unit);
        vp_register=findView(R.id.vp_register);
    }

    @Override
    public void initListener() {
        setOnClick(register_car);
        setOnClick(register_machine);
        setOnClick(register_personal);
        setOnClick(register_unit);
        vp_register.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        setTitle("注册");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.register_unit:
                selectPager(0);
                break;
            case R.id.register_personal:
                selectPager(1);
                break;
            case R.id.register_car:
                selectPager(2);
                break;
            case R.id.register_machine:
                selectPager(3);
                break;
        }
    }
    //初始化碎片
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new RegisterUnitFragment());
        list.add(new RegisterPersonalFragment());
        list.add(new RegisterCarFragment());
        list.add(new RegisterMachineFragment());
        adapter = new MainAdapter(this.getSupportFragmentManager(), list);
        vp_register.setAdapter(adapter);
        vp_register.setOffscreenPageLimit(3);
        selectPager(0);
    }
    public void selectPager(int position){
        vp_register.setCurrentItem(position);
        register_unit.setTextColor(position == 0 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_personal.setTextColor(position == 1 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_car.setTextColor(position ==2 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_machine.setTextColor(position == 3 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_unit.setBackgroundResource(position == 0 ? R.color.color_view_mtb  :  R.drawable.common_bd_green);
        register_personal.setBackgroundResource(position == 1 ? R.color.color_view_mtb :  R.drawable.common_bd_green);
        register_car.setBackgroundResource(position == 2 ? R.color.color_view_mtb : R.drawable.common_bd_green);
        register_machine.setBackgroundResource(position == 3 ? R.color.color_view_mtb : R.drawable.common_bd_green);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        register_unit.setTextColor(position == 0 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_personal.setTextColor(position == 1 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_car.setTextColor(position ==2 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_machine.setTextColor(position == 3 ? Color.parseColor("#ffffff") : Color.parseColor("#259B24"));
        register_unit.setBackgroundResource(position == 0 ? R.color.color_view_mtb  :  R.drawable.common_bd_green);
        register_personal.setBackgroundResource(position == 1 ? R.color.color_view_mtb :  R.drawable.common_bd_green);
        register_car.setBackgroundResource(position == 2 ? R.color.color_view_mtb : R.drawable.common_bd_green);
        register_machine.setBackgroundResource(position == 3 ? R.color.color_view_mtb : R.drawable.common_bd_green);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
