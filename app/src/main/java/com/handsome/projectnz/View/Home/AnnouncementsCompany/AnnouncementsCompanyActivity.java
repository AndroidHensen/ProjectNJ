package com.handsome.projectnz.View.Home.AnnouncementsCompany;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.AnnouncementsAdapter;
import com.handsome.projectnz.Module.Announcements;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/15.
 */

public class AnnouncementsCompanyActivity extends BaseActivity {
    private ListView lv;
    private AnnouncementsAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_announcements_company;
    }

    @Override
    public void initViews() {
        lv = findView(R.id.lv_announcements);
        List<Announcements> lists = new ArrayList<Announcements>();
        Announcements Announcements = new Announcements("工作申请", true, "申请标题：android开发工程师\n" +
                "内容概要：工作问题，工作问题\n" +
                "截至时间：2018年12月11日", "2017年11月10日", "查看详情");
        lists.add(Announcements);
        Announcements Announcements1 = new Announcements("工作申请", false, "申请标题：android开发工程师\n" +
                "内容概要：工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题\n" +
                "截至时间：2018年12月11日", "2017年11月10日", "查看详情");
        lists.add(Announcements1);
        mAdapter = new AnnouncementsAdapter(this, lists);
        lv.setAdapter(mAdapter);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("公司公告");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
