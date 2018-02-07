package com.handsome.projectnz.View.Home.PlanDetails;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

import java.util.Calendar;

/**
 * Created by YX_PC on 2018/1/15.
 * 界面：工作台_进度计划_计划详情_进度反馈
 */
public class PlanScheduleFeedbackActivity extends BaseActivity {
    private EditText et_project_name;//项目名称
    private EditText et_task_name;//任务名称
    private EditText et_task_style;//任务类型
    private EditText et_remain_workload;//剩余工作量
    private EditText et_start;//开始时间
    private EditText et_end;//结束时间
    private EditText et_now_date;//当前日期
    private EditText et_duration;//工期
    private EditText et_construction;//施工量
    private EditText et_explain;//补充说明
    private RecyclerView rv_photos;//照片
    private ImageButton ib_add_photos;//添加照片按钮
    private Button btn_submit;//提交

    @Override
    public int getLayoutId() {
        return R.layout.activity_plan_schedule_feedback;
    }

    @Override
    public void initViews() {
        et_project_name = findView(R.id.et_project_name);
        et_task_name = findView(R.id.et_task_name);
        et_task_style = findView(R.id.et_task_style);
        et_remain_workload = findView(R.id.et_remain_workload);
        et_start = findView(R.id.et_start);
        et_end = findView(R.id.et_end);
        et_now_date = findView(R.id.et_now_date);
        et_duration = findView(R.id.et_duration);
        et_construction = findView(R.id.et_construction);
        et_explain = findView(R.id.et_explain);
        rv_photos = findView(R.id.rv_photos);
        ib_add_photos = findView(R.id.ib_add_photos);
        btn_submit = findView(R.id.btn_submit);
    }

    @Override
    public void initListener() {
        et_start.setOnClickListener(this);
        et_start.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_end.setOnClickListener(this);
        et_end.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_now_date.setOnClickListener(this);
        et_now_date.setOnFocusChangeListener(new myOnfocusChangeListener());
    }

    @Override
    public void initData() {
        setTitle("进度反馈");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
    private class myOnfocusChangeListener implements View.OnFocusChangeListener {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                showDatePickerDialog(v);
            }
        }
    }
    /**
     * 展示日期选择对话框
     */
    private void showDatePickerDialog(View v) {
        Calendar c = Calendar.getInstance();
        final EditText editText = (EditText) v;
        new DatePickerDialog(PlanScheduleFeedbackActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub

                editText.setText(year + " - " + (monthOfYear + 1) + " - " + dayOfMonth);
            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }
}
