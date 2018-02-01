package com.handsome.projectnz.View.Home.DailyCheck;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/29.
 */

public class DailyCheckAlreadyActivity extends BaseActivity {
    private TextView tv_item_name;//项目名
    private TextView tv_check_character;//检查性质
    private TextView tv_time1;//日期
    private TextView tv_name;//检查人
    private TextView tv_check_item;//检查项
    private TextView tv_accessory;//上传附件名
    private TextView tv_evaluate;//已通过
    private TextView tv_revice;//已通过
    private LinearLayout tv_write_man;//抄送人
    @Override
    public int getLayoutId() {
        return R.layout.activity_daily_check_already;
    }

    @Override
    public void initViews() {
        tv_item_name = findView(R.id.tv_item_name);
        tv_check_character = findView(R.id.tv_check_character);
        tv_time1 = findView(R.id.tv_time1);
        tv_name = findView(R.id.tv_name);
        tv_revice = findView(R.id.tv_revice);
        tv_check_item = findView(R.id.tv_check_item);
        tv_accessory = findView(R.id.tv_accessory);
        tv_evaluate = findView(R.id.tv_evaluate);
        tv_write_man = findView(R.id.tv_write_man);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("已检查详情");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
