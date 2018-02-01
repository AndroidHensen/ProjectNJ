package com.handsome.projectnz.View.Home.SecurityCheck;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/27.
 */

public class SecurityCheckCharacterActivity extends BaseActivity {
    private static final String TAG = "SecurityCheckCharacterA";
    private LinearLayout linearlayout_add;//已选性质容器
    private LinearLayout linearlayout_add1;//已选性质容器1
    private LinearLayout linearlayout_add2;//已选性质容器2
    private TextView tv_inspect_month;//月度检查
    private TextView tv_inspect_season;//季度检查
    private TextView tv_inspect_item;//专项检查
    private TextView tv_inspect_recover;//节后复工检查
    private TextView tv_inspect_team;//施工队自检
    private TextView tv_inspect_branch;//项目部检查
    private TextView tv_inspect_department;//工程部检查
    private List<String> myList = new ArrayList<>();//存放被选性质
    private int record = 0;//记录被选性质的个数
    private TextView tv_edit2;//保存控件


    @Override
    public int getLayoutId() {
        return R.layout.activity_security_check_character;
    }

    @Override
    public void initViews() {
        linearlayout_add = findView(R.id.linearlayout_add);
        linearlayout_add1 = findView(R.id.linearlayout_add1);
        linearlayout_add2 = findView(R.id.linearlayout_add2);
        tv_inspect_month = findView(R.id.tv_inspect_month);
        tv_inspect_season = findView(R.id.tv_inspect_season);
        tv_inspect_item = findView(R.id.tv_inspect_item);
        tv_inspect_recover = findView(R.id.tv_inspect_recover);
        tv_inspect_team = findView(R.id.tv_inspect_team);
        tv_inspect_branch = findView(R.id.tv_inspect_branch);
        tv_inspect_department = findView(R.id.tv_inspect_department);
        tv_edit2 = findView(R.id.tv_edit2);
    }

    @Override
    public void initListener() {
        tv_inspect_month.setOnClickListener(this);
        tv_inspect_season.setOnClickListener(this);
        tv_inspect_item.setOnClickListener(this);
        tv_inspect_recover.setOnClickListener(this);
        tv_inspect_team.setOnClickListener(this);
        tv_inspect_branch.setOnClickListener(this);
        tv_inspect_department.setOnClickListener(this);
        tv_edit2.setOnClickListener(this);
    }


    @Override
    public void initData() {
        setTitle("检查性质");
        setTitleCanBack();
        setEdit2("保存");
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.tv_inspect_department:
                add_view(v);
                break;
            case R.id.tv_inspect_season:
                add_view(v);
                break;
            case R.id.tv_inspect_item:
                add_view(v);
                break;
            case R.id.tv_inspect_month:
                add_view(v);
                break;
            case R.id.tv_inspect_recover:
                add_view(v);
                break;
            case R.id.tv_inspect_branch:
                add_view(v);
                break;
            case R.id.tv_inspect_team:
                add_view(v);
                break;
            case R.id.tv_edit2:
                Intent intent = new Intent(SecurityCheckCharacterActivity.this, SecurityCheckNewActivity.class);
                intent.putStringArrayListExtra("myArray", (ArrayList<String>) myList);
                Log.d(TAG, "processClick: "+myList);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    private void add_view(View v) {
        TextView textView = (TextView) v;
        String choice = textView.getText().toString();
        if (judge(choice)) {
            myList.add(choice);
            TextView add_view = new TextView(this);
            add_view.setText(choice);
            add_view.setTextColor(getResources().getColor(R.color.green));
            add_view.setTextSize(16);
            add_view.setBackground(getResources().getDrawable(R.drawable.security_check_character_choice_bd));
            add_view.setPadding(10, 4, 10, 4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(8, 0, 8, 0);
            add_view.setLayoutParams(layoutParams);
            if (record < 3) {
                linearlayout_add.addView(add_view);
            }
            if (record >= 3 && record < 6) {
                linearlayout_add1.setVisibility(View.VISIBLE);
                linearlayout_add1.addView(add_view);
            }
            if (record >= 6) {
                linearlayout_add2.setVisibility(View.VISIBLE);
                linearlayout_add2.addView(add_view);
            }
            record = record + 1;
        }
    }

    private boolean judge(String word) {
        for (String s : myList) {
            if (word.equals(s)) {
                return false;
            }
        }
        return true;
    }

}
