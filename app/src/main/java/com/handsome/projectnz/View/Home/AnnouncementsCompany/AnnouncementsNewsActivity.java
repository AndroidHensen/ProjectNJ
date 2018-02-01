package com.handsome.projectnz.View.Home.AnnouncementsCompany;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/15.
 */

public class AnnouncementsNewsActivity extends BaseActivity {
    private EditText et_announcement_title;
    private EditText et_announcement_content;
    private ImageButton ib_camera;
    private ImageButton ib_right;

    @Override
    public int getLayoutId() {
        return R.layout.activity_announcement_new;
    }

    @Override
    public void initViews() {
        et_announcement_title = (EditText) findViewById(R.id.et_announcement_title);
        et_announcement_content = (EditText) findViewById(R.id.et_announcement_content);
        ib_camera = (ImageButton) findViewById(R.id.ib_camera);
        ib_right = (ImageButton) findViewById(R.id.ib_right);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setEdit2("发送");
        setTitleCanBack();
        setTitle("新建公告");
    }

    @Override
    public void processClick(View v) {

    }
}
