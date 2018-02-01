package com.handsome.projectnz.View.Home.WorkTask.WorkTaskOfficial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/20.
 * 界面：工作台_工作任务_办公任务_任务接收
 */

public class WorkTaskOfficialAcceptActivity extends BaseActivity {
    private TextView tv_task_name;//任务名称
    private TextView tv_arrange_people;//安排人
    private TextView tv_operator;//执行人
    private TextView tv_start_time;//委派日期
    private TextView tv_end_time;//截止日期
    private TextView tv_now_time;//当前日期
    private TextView tv_over_date;//超期
    private TextView tv_schedule;//进度
    private TextView tv_describe;//描述
    private ImageView iv_photo1;//图片1
    private ImageView iv_photo2;//图片2
    private ImageView iv_photo3;//图片3
    private Button btn_pass;//通过
    private Button btn_no_pass;//不通过
    private RatingBar rb_evaluate;//评价
    private TextView tv_accept_opinion;//验收意见
    private RecyclerView rv_photos;//添加图片
    private Button btn_submit;//提交


    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_official_accept;
    }

    @Override
    public void initViews() {
        tv_task_name=findView(R.id.tv_task_name);
        tv_arrange_people=findView(R.id.tv_arrange_people);
        tv_operator=findView(R.id.tv_operator);
        tv_start_time=findView(R.id.tv_start_time);
        tv_end_time=findView(R.id.tv_end_time);
        tv_now_time=findView(R.id.tv_now_time);
        tv_over_date=findView(R.id.tv_over_date);
        tv_schedule=findView(R.id.tv_schedule);
        tv_describe=findView(R.id.tv_describe);
        iv_photo1=findView(R.id.iv_photo1);
        iv_photo2=findView(R.id.iv_photo2);
        iv_photo3=findView(R.id.iv_photo3);
        btn_pass=findView(R.id.btn_pass);
        btn_no_pass=findView(R.id.btn_no_pass);
        rb_evaluate=findView(R.id.rb_evaluate);
        tv_accept_opinion=findView(R.id.tv_accept_opinion);
        rv_photos=findView(R.id.rv_photos);
        btn_submit=findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("任务验收");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
