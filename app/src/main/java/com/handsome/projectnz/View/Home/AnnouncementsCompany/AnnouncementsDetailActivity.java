package com.handsome.projectnz.View.Home.AnnouncementsCompany;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.AnnouncementsDetailAdapter;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/17.
 */

public class AnnouncementsDetailActivity extends BaseActivity {
    private TextView tv_detail_time;//公告时间（查看公告）
    private TextView et_announcement_content;//公告内容（查看公告）
    private RecyclerView rv_announcement_photos;//公告照片（查看公告）
    private TextView tv_vaild_time;//有效时间截止日（查看公告）
    List<Integer>myList;
    AnnouncementsDetailAdapter announcementsDetailAdapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_announcement_detail;
    }

    @Override
    public void initViews() {
        tv_detail_time = findView(R.id.tv_detail_time);
        et_announcement_content = findView(R.id.et_announcement_content);
        tv_vaild_time = findView(R.id.tv_vaild_time);
        rv_announcement_photos = findView(R.id.rv_announcement_photos);
        rv_announcement_photos.setLayoutManager(new GridLayoutManager(this,3));
        announcementsDetailAdapter = new AnnouncementsDetailAdapter(this,myList,R.layout.view_announcements_detail);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("公告详情");
        setTitleCanBack();
        myList = new ArrayList<Integer>();
        myList.add(R.drawable.return_project_task_ic_defalut_pic);
        myList.add(R.drawable.register_unit_ic_creadit1);
        myList.add(R.drawable.register_unit_ic_creadit2);

    }

    @Override
    public void processClick(View v) {

    }
}
