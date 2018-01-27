package com.handsome.projectnz.View.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by YX_PC on 2018/1/27.
 * 界面：工作台_签到记功
 */
public class SignMeritActivity extends BaseActivity {

    private View tv_project;//项目
    private View tv_task_name;//任务名称
    private View tv_address;//地址
    private View tv_duty;//职务
    private View iv_add_member;//添加(班组成员)
    private View btn_add_photos_scene;//上传照片(现场班组合照)
    private View iv_add_photos_scene_one;//现场班组合照1
    private View iv_add_photos_scene_two;//现场班组合照2
    private View iv_add_photos_scene_three;//现场班组合照3
    private View btn_add_photos_tool;//上传照片(工具合照)
    private View iv_add_photos_tool_one;//工具合照1
    private View iv_add_photos_tool_two;//工具合照2
    private View iv_add_photos_tool_three;//工具合照3
    private View btn_add_photos_construction;//上传照片(施工日志照)
    private View iv_add_photos_construction_one;//施工日志照1
    private View iv_add_photos_construction_two;//施工日志照2
    private View iv_add_photos_construction_three;//施工日志照3
    private View btn_approach;//进场签到
    private View btn_departure;//离场记功

    @Override
    public int getLayoutId() {
        return R.layout.activity_sign_merit;
    }

    @Override
    public void initViews() {
        tv_project = findView(R.id.tv_project);
        tv_task_name = findView(R.id.tv_task_name);
        tv_address = findView(R.id.tv_address);
        tv_duty = findView(R.id.tv_duty);
        iv_add_member = findView(R.id.iv_add_member);
        btn_add_photos_scene = findView(R.id.btn_add_photos_scene);
        iv_add_photos_scene_one = findView(R.id.iv_add_photos_scene_one);
        iv_add_photos_scene_two = findView(R.id.iv_add_photos_scene_two);
        iv_add_photos_scene_three = findView(R.id.iv_add_photos_scene_three);
        btn_add_photos_tool = findView(R.id.btn_add_photos_tool);
        iv_add_photos_tool_one = findView(R.id.iv_add_photos_tool_one);
        iv_add_photos_tool_two = findView(R.id.iv_add_photos_tool_two);
        iv_add_photos_tool_three = findView(R.id.iv_add_photos_tool_three);
        btn_add_photos_construction = findView(R.id.btn_add_photos_construction);
        iv_add_photos_construction_one = findView(R.id.iv_add_photos_construction_one);
        iv_add_photos_construction_two = findView(R.id.iv_add_photos_construction_two);
        iv_add_photos_construction_three = findView(R.id.iv_add_photos_construction_three);
        btn_approach = findView(R.id.btn_approach);
        btn_departure = findView(R.id.btn_departure);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("签到记功");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
