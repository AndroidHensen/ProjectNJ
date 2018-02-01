package com.handsome.projectnz.View.Home.SecurityCheck;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.QualityCheck.QualityCheckCharacterActivity;
import com.handsome.projectnz.View.Home.QualityCheck.QualityCheckNewActivity;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by jie on 2018/1/26.
 */

public class SecurityCheckNewActivity extends BaseActivity {
    private static final String TAG = "SecurityCheckNewActivit";
    private EditText et_item_name;//项目名
    private ImageButton ib_right;//项目名右侧小控件
    private EditText et_check_man;//检查人
    private EditText et_check_item;//检查项
    private EditText et_check_result;//检查结果
    private Button btn_up;//上传文件按钮
    private RadioButton rbtn_through;//单选按钮之通过
    private RadioButton rbtn_warn;//单选按钮之口头警告
    private RadioButton rbtn_review;//单选按钮之书面修改
    private EditText et_announce_man;//通知人
    private EditText et_record;//记录btn_commit
    private Button btn_commit;//提交
    private EditText et_time;//日期
    private ImageButton ib_right1;//日期右侧小控件
    private LinearLayout linearlayout_add;//被选性质容器
    private ArrayList<String> Myarray;//检查性质被选性质

    @Override
    public int getLayoutId() {
        return R.layout.activity_security_check_new;
    }

    @Override
    public void initViews() {
        et_item_name = findView(R.id.et_item_name);
        ib_right = findView(R.id.ib_right);
        et_check_man = findView(R.id.et_check_man);
        et_check_item = findView(R.id.et_check_item);
        et_check_result = findView(R.id.et_check_result);
        btn_up = findView(R.id.btn_up);
        rbtn_through = findView(R.id.rbtn_through);
        rbtn_warn = findView(R.id.rbtn_warn);
        rbtn_review = findView(R.id.rbtn_review);
        et_announce_man = findView(R.id.et_announce_man);
        et_record = findView(R.id.et_record);
        btn_commit = findView(R.id.btn_commit);
        ib_right1 = findView(R.id.ib_right1);
        et_time = findView(R.id.et_time);
        et_time.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘
        linearlayout_add = findView(R.id.linearlayout_add);
    }

    //初始化被选性质容器的控件
    private void init_linearlayout_add() {
        int length = Myarray.size();
        if (length != 0) {
            if (length >= 2) {
                length = 2;
            }
            for (int i = 0; i < length; i++) {
                TextView add_view = new TextView(this);
                String choice = Myarray.get(i);
                add_view.setText(choice);
                add_view.setTextColor(getResources().getColor(R.color.white));
                add_view.setTextSize(16);
                add_view.setBackground(getResources().getDrawable(R.drawable.common_bg_blue_radius));
                add_view.setPadding(10, 4, 10, 4);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(8, 0, 8, 0);
                add_view.setLayoutParams(layoutParams);
                linearlayout_add.addView(add_view);
            }
        }
    }

    @Override
    public void initListener() {
        et_time.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_time.setOnClickListener(new myonclistener());
        ib_right.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("新增质量检查");
        setTitleCanBack();
        Intent intent = getIntent();
        Myarray = intent.getStringArrayListExtra("myArray");
        if (Myarray!=null){
            Log.d(TAG, "initData: " + Myarray);
            init_linearlayout_add();
        }

    }

    @Override
    public void processClick(View v) {
        switch (v.getId()){
            case R.id.ib_right:
                Intent intent1 = new Intent(SecurityCheckNewActivity.this, SecurityCheckCharacterActivity.class);
                startActivity(intent1);
                finish();
                break;
            default:
                break;
        }
    }

    private class myOnfocusChangeListener implements View.OnFocusChangeListener {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                showDatePickerDialog();
            }
        }
    }

    /**
     * 展示日期选择对话框
     */
    private void showDatePickerDialog() {
        Calendar c = Calendar.getInstance();
        new DatePickerDialog(SecurityCheckNewActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub
                et_time.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }

    private class myonclistener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            showDatePickerDialog();
        }
    }
}
