package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
/**
 * Created by YX_PC on 2018/1/20.
 * 界面：工作台_通用申请_申请详情
 */
public class ApplyDetailsActivity extends BaseActivity {


    private TextView tv_apply_people;//申请人
    private TextView tv_apply_time;//申请时间
    private TextView tv_project;//项目
    private TextView tv_task;//任务
    private TextView tv_title;//标题
    private TextView tv_content;//内容
    private RecyclerView rv_photos;//照片
    private Button btn_backout;//撤销
    private Button btn_submit;//提交修改

    @Override
    public int getLayoutId() {
        return R.layout.activity_apply_details;
    }

    @Override
    public void initViews() {
        tv_apply_people=findView(R.id.tv_apply_people);
        tv_apply_time=findView(R.id.tv_apply_time);
        tv_project=findView(R.id.tv_project);
        tv_task=findView(R.id.tv_task);
        tv_title=findView(R.id.tv_title);
        tv_content=findView(R.id.tv_content);
        rv_photos=findView(R.id.rv_photos);
        btn_backout=findView(R.id.btn_backout);
        btn_submit=findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("申请详情");
        setEdit2("编辑");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
