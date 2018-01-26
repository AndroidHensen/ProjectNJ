package com.handsome.projectnz.Fragment.Project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

import org.w3c.dom.Text;

/**
 * Created by kedongyu 2018.1.24
 * 对应主界面-项目模块-新建项目-项目概况
 */
public class ProjectNewSummaryFragment extends BaseLazyFragment {
    //工程名称，工程类型，工程编号，建设单位
    private EditText et_engineering_name,et_engineering_type,et_engineering_num,builer;
    //项目名称，所属区域，项目地址
    private EditText et_project_name,et_project_area,et_project_address;
    //项目编号，项目类别,工期,发起人,审核方
    private TextView tv_project_num,tv_project_type,tv_time_limit,tv_project_initiator,tv_checher;
    //开工时间，截至时间,项目经理，概况，
    private EditText et_startTime,et_endTime,et_project_manager,et_project_summary;
    //难度
    private RatingBar star;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_project_summary;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {

    }
}
