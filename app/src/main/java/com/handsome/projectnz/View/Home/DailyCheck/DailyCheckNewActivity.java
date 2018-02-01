package com.handsome.projectnz.View.Home.DailyCheck;

import android.app.DatePickerDialog;
import android.support.annotation.IdRes;
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
import android.widget.RadioGroup;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.DailyCheckNewAdd;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jie on 2018/1/28.
 */

public class DailyCheckNewActivity extends BaseActivity {
    private static final String TAG = "DailyCheckNewActivity";
    private EditText et_item_name;//项目名
    private ImageButton ib_right;//项目名右侧小控件
    private EditText et_check_man;//检查人
    private EditText et_check_item;//检查项
    private Button btn_up;//上传文件按钮
    private RadioGroup radiogroup;//单选按钮组
    private RadioButton rbtn_inform;//单选按钮之已通知
    private TextView tv_inform;//已通知
    private RadioButton rbtn_review;//单选按钮之已修改
    private TextView tv_revice;//已修改
    private Button btn_commit;//提交
    private EditText et_time;//日期
    private ImageButton ib_right1;//日期右侧小控件
    private ImageButton ibtn_add_man;//添加抄送人
    private LinearLayout Linearlayout_man;//抄送人
    private List<DailyCheckNewAdd> List_man_parent = new ArrayList<DailyCheckNewAdd>();//抄送人控件的集合
    private List<String> List_man = new ArrayList<String>();//抄送人名字集合
    private int index = 0;//生成id索引
    private LinearLayout linearlayout_add;//被选性质容器
    private ArrayList<String> Myarray;//检查性质被选性质集合

    @Override
    public int getLayoutId() {
        return R.layout.activity_daily_check_new;
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
    public void initViews() {
        radiogroup = findView(R.id.radiogroup);
        et_item_name = findView(R.id.et_item_name);
        ib_right = findView(R.id.ib_right);
        et_check_man = findView(R.id.et_check_man);
        et_check_item = findView(R.id.et_check_item);
        btn_up = findView(R.id.btn_up);
        rbtn_inform = findView(R.id.rbtn_inform);
        tv_inform = findView(R.id.tv_inform);
        rbtn_review = findView(R.id.rbtn_review);
        tv_revice = findView(R.id.tv_revice);
        Linearlayout_man = findView(R.id.Linearlayout_man);
        btn_commit = findView(R.id.btn_commit);
        ib_right1 = findView(R.id.ib_right1);
        ibtn_add_man = findView(R.id.ibtn_add_man);
        et_time = findView(R.id.et_time);
        et_time.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘
        linearlayout_add = findView(R.id.linearlayout_add);
    }

    @Override
    public void initListener() {
        et_time.setOnFocusChangeListener(new myOnfocusChangeListener());
        et_time.setOnClickListener(new myonclistener());
        ibtn_add_man.setOnClickListener(this);
        btn_commit.setOnClickListener(this);
        radiogroup.setOnCheckedChangeListener(new myoncheckchagelistener());
    }

    @Override
    public void initData() {
        setTitle("新增日常巡查");
        setTitleCanBack();
//        Intent intent = getIntent();
//        Myarray = intent.getStringArrayListExtra("myArray");
//        Log.d(TAG, "initData: " + Myarray);
//        init_linearlayout_add();
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.ibtn_add_man:
                add_view();
                break;
            case R.id.btn_commit:
                commit();
                break;
            default:
                break;
        }
    }

    /*点击提交时Listman为抄送人的内容*/
    private void commit() {
        for (DailyCheckNewAdd dailyCheckNewAdd : List_man_parent) {
            String temp = dailyCheckNewAdd.getedittive().getText().toString();
            List_man.add(temp);
        }
        Log.d(TAG, "commit:" + List_man);

    }

    //移除抄送人
    private void remove_view(View myview) {
        int id = myview.getId();
        Log.d(TAG, "remove_view: " + id);
        DailyCheckNewAdd daily = null;
        for (DailyCheckNewAdd dailyCheckNewAdd : List_man_parent) {
            int find_id = dailyCheckNewAdd.gettextview().getId();
            Log.d(TAG, "remove_view: " + find_id);
            if (id == find_id) {
                daily = dailyCheckNewAdd;
            }
        }
        String temp = daily.getedittive().getText().toString();
        Iterator<String> iterator = List_man.iterator();
        while (iterator.hasNext()) {
            String x = iterator.next();
            if (x.equals(temp)) {
                iterator.remove();
            }
        }
        Linearlayout_man.removeView(daily);
        Iterator<DailyCheckNewAdd> it = List_man_parent.iterator();
        while (it.hasNext()) {
            DailyCheckNewAdd x = it.next();
            if (x.equals(daily)) {
                it.remove();
            }
        }
        Log.d(TAG, "List_man:" + List_man);
    }

    /*为页面添加抄送人*/
    private void add_view() {
        DailyCheckNewAdd add_view = new DailyCheckNewAdd(this);
        add_view.setId(index + 100);
        add_view.gettextview().setId(index);
        index++;
        int id = add_view.gettextview().getId();
        Log.d(TAG, "add_view: " + id);
        add_view.gettextview().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove_view(v);
            }
        });
        List_man_parent.add(add_view);
        Linearlayout_man.addView(add_view);

    }

    /*
    时间选择器的监听内部类
    * */
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
        new DatePickerDialog(DailyCheckNewActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub
                et_time.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }

    /*监听点击时间选择器*/
    private class myonclistener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            showDatePickerDialog();
        }
    }

    /*radiogroup的选择监听*/
    private class myoncheckchagelistener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
            if (checkedId == R.id.rbtn_inform) {
                tv_inform.setBackgroundColor(getResources().getColor(R.color.green));
                tv_revice.setBackgroundColor(getResources().getColor(R.color.lightGray));
            } else {
                tv_revice.setBackgroundColor(getResources().getColor(R.color.green));
                tv_inform.setBackgroundColor(getResources().getColor(R.color.lightGray));
            }
        }
    }
}
