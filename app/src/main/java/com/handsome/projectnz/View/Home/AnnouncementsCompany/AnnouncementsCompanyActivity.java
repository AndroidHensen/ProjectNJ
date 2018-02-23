package com.handsome.projectnz.View.Home.AnnouncementsCompany;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.Announcements.AnnouncementsAdapter;
import com.handsome.projectnz.Controller.HomeController;
import com.handsome.projectnz.Manager.InterfaceManger;
import com.handsome.projectnz.Manager.PrefManager;
import com.handsome.projectnz.Module.Announcements;
import com.handsome.projectnz.R;
import com.handsome.projectnz.Utils.RetrofitUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by jie on 2018/1/15.
 */

public class AnnouncementsCompanyActivity extends BaseActivity {

    private ListView lv_announcements;//列表内容
    private ImageButton btn_add;//添加新公告
    private AnnouncementsAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_announcements_company;
    }

    @Override
    public void initViews() {
        lv_announcements = findView(R.id.lv_announcements);
        btn_add = findView(R.id.btn_add);
    }

    @Override
    public void initListener() {
        btn_add.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("公司公告");
        setTitleCanBack();

        initAnnouncementsData();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                Intent intent = new Intent(AnnouncementsCompanyActivity.this, AnnouncementsNewsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    private void initAnnouncementsData() {
        List<String> photos = new ArrayList<>();

        List<MultipartBody.Part> parts = null;
//        parts = RetrofitUtils.filesToMultipartBodyParts("photo", photos);

        Map<String, RequestBody> params = new HashMap<>();
        params.put("token", RetrofitUtils.convertToRequestBody(PrefManager.getToken()));

        HomeController.show_notice_abstract(params, parts, new InterfaceManger.OnRequestListener() {
            @Override
            public void onSuccess(Object success) {
                Announcements announcements = (Announcements) success;
                mAdapter = new AnnouncementsAdapter(AnnouncementsCompanyActivity.this, announcements.getContent().getContent());
                lv_announcements.setAdapter(mAdapter);
            }

            @Override
            public void onError(String error) {
                Toast.makeText(AnnouncementsCompanyActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
