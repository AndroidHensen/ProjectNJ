package com.handsome.projectnz.View.Home.QualityCheck;

import android.view.View;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/28.
 */

public class QualityCheckAlreadyActivity extends BaseActivity {
    private TextView tv_item_name;//项目名
    private TextView tv_check_character;//检查性质
    private TextView tv_time1;//日期
    private TextView tv_name;//检查人
    private TextView tv_check_item;//检查项
    private TextView tv_check_result;//检查结果
    private TextView tv_accessory;//上传附件名
    private TextView tv_evaluate;//评价
    private TextView tv_inform_man;//通知人
    private TextView tv_record;//记录
    @Override
    public int getLayoutId() {
        return R.layout.activity_quality_check_already;
    }

    @Override
    public void initViews() {
        tv_item_name = findView(R.id.tv_item_name);
        tv_check_character = findView(R.id.tv_check_character);
        tv_time1 = findView(R.id.tv_time1);
        tv_name = findView(R.id.tv_name);
        tv_check_item = findView(R.id.tv_check_item);
        tv_check_result = findView(R.id.tv_check_result);
        tv_accessory = findView(R.id.tv_accessory);
        tv_evaluate = findView(R.id.tv_evaluate);
        tv_inform_man = findView(R.id.tv_inform_man);
        tv_record = findView(R.id.tv_record);
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
