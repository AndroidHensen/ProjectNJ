package com.handsome.projectnz.View.Mine;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created By Diko (柯东煜) 2018.1.15
 * 对应主界面-我的模块-意见反馈
 */
public class MineFeedback extends BaseActivity {
    private EditText et_feedback_title;
    private EditText et_feedback_content;
    private TextView tv_feedback_date;
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_feedback;
    }

    @Override
    public void initViews() {
        et_feedback_content=findView(R.id.feedback_content);
        et_feedback_title=findView(R.id.feedback_title);
        tv_feedback_date=findView(R.id.feedback_date);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("意见反馈");
        setTitleCanBack();
        setEdit2("提交");
    }

    @Override
    public void processClick(View v) {

    }
}
