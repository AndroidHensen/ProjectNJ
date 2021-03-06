package com.handsome.projectnz.View.Home.MaterialHandling;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.MainAdapter;
import com.handsome.projectnz.CustomView.MessageTabButton;
import com.handsome.projectnz.Fragment.Home.MaterialHandling.MaterialOutputArmourFragment;
import com.handsome.projectnz.Fragment.Home.MaterialHandling.MaterialOutputPrimeFragment;
import com.handsome.projectnz.Fragment.Home.MaterialHandling.MaterialOutputProprietorSupplyFragment;
import com.handsome.projectnz.Fragment.Home.MaterialHandling.MaterialOutputPurchaseFragment;
import com.handsome.projectnz.Fragment.Message.MessageAssignmentFragment;
import com.handsome.projectnz.Fragment.Message.MessageCompanyNoticeFragment;
import com.handsome.projectnz.Fragment.Message.MessageOfficeFragment;
import com.handsome.projectnz.Fragment.Message.MessageSystemFragment;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Diko （柯东煜） in 2018.1.27
 *
 */
public class StockOutputActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    //甲供材，初期，业主供材，自购
    private TextView tv_armour,tv_prime,tv_proprietor_supply,tv_purchase;
    private ViewPager vp;//材料清单
    private List<Fragment> list;
    private MainAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_stock_output;
    }

    @Override
    public void initViews() {
        tv_prime=findView(R.id.prime);
        tv_armour=findView(R.id.armour);
        tv_proprietor_supply=findView(R.id.proprietor_supply);
        tv_purchase=findView(R.id.purchase);
        vp=findView(R.id.vp);
    }

    @Override
    public void initListener() {
        setOnClick(tv_prime);
        setOnClick(tv_armour);
        setOnClick(tv_proprietor_supply);
        setOnClick(tv_purchase);
        vp.setOnPageChangeListener(this);
    }

    @Override
    public void initData() {
        setTitle("出库：选择物资");
        setEdit2("新建");
        setTitleCanBack();
        //初始化碎片
        initFragments();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.tv_edit2:
                Intent i=new Intent(this,StockOutputNewActivity.class);
                startActivity(i);

                break;
            case R.id.prime:
                selectPager(0);
                break;
            case R.id.armour:
                selectPager(1);
                break;
            case R.id.proprietor_supply:
                selectPager(2);
                break;
            case R.id.purchase:
                selectPager(3);
                break;
        }
    }
    /**
     * 初始化碎片
     */
    private void initFragments() {
        list = new ArrayList<>();
        list.add(new MaterialOutputPrimeFragment());
        list.add(new MaterialOutputArmourFragment());
        list.add(new MaterialOutputProprietorSupplyFragment());
        list.add(new MaterialOutputPurchaseFragment());
        adapter = new MainAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(adapter);
        vp.setOffscreenPageLimit(4);
        selectPager(0);
    }
    public void selectPager(int position){
        vp.setCurrentItem(position);
        int white=getResources().getColor(R.color.white);
        int blue=getResources().getColor(R.color.colorPrimary);
        int grey=getResources().getColor(R.color.colorPrimaryBackGroup);
        int black=getResources().getColor(R.color.black);
        tv_prime.setBackgroundColor(position==0?grey:white);
        tv_armour.setBackgroundColor(position==1?grey:white);
        tv_proprietor_supply.setBackgroundColor(position==2?grey:white);
        tv_purchase.setBackgroundColor(position==3?grey:white);
        tv_prime.setTextColor(position==0?blue:black);
        tv_armour.setTextColor(position==1?blue:black);
        tv_proprietor_supply.setTextColor(position==2?blue:black);
        tv_purchase.setTextColor(position==3?blue:black);
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
