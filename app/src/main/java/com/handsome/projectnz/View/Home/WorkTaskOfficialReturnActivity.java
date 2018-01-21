package com.handsome.projectnz.View.Home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/21.
 */

public class WorkTaskOfficialReturnActivity extends BaseActivity {
    private TextView tv_official_project_name;//项目名称（反馈任务的）
    private RecyclerView rv_progress_detail;//项目具体进度情况（反馈任务）
    private SeekBar sb_progress;//滑动条（展示项目进度）
    private TextView tv_show_progress;//滑动条的进度（格式：50%）
    private EditText et_explain_task;//任务说明（对反馈任务的说明）
    private RecyclerView rv_return_photos;//被挑选的图片
    private ImageButton ib_add_photos;//点击上传按钮（上传图片）
    private Button bt_return_commit;//提交

    @Override
    public int getLayoutId() {
        return R.layout.activity_work_task_official_return;
    }

    @Override
    public void initViews() {
        tv_official_project_name = findView(R.id.tv_official_project_name);
        rv_progress_detail = findView(R.id.rv_progress_detail);
        sb_progress = findView(R.id.sb_progress);
        tv_show_progress = findView(R.id.tv_show_progress);
        et_explain_task = findView(R.id.et_explain_task);
        rv_return_photos = findView(R.id.rv_return_photos);
        ib_add_photos = findView(R.id.ib_add_photos);
        bt_return_commit = findView(R.id.bt_return_commit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("反馈任务");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
