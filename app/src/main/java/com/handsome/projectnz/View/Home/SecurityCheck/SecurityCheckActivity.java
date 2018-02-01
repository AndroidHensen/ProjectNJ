package com.handsome.projectnz.View.Home.SecurityCheck;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.Adapter.Home.QualityCheck.QualityCheckAdapter;
import com.handsome.projectnz.Adapter.Home.SecurityCheck.SecurityCheckAdapter;
import com.handsome.projectnz.CustomView.SecurityCheckInput;
import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.QualityCheck.QualityCheckActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/26.
 */

public class SecurityCheckActivity extends BaseActivity {
    private static final String TAG = "SecurityCheckActivity";
    private SecurityCheckInput SecurityCheckInput_input;//组合控件（上方搜索栏）
    private Button bt_search;//搜索按钮
    private ListView rv_content;//下方内容
    private ImageButton ib_find;//收索栏的搜索镜
    private ImageButton btn_add;//新增安全检查
    private String SecurityCheckInput_input_content;//搜索栏所填文本
    private SecurityCheckAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_security_check;
    }

    @Override
    public void initViews() {
        SecurityCheckInput_input = findView(R.id.SecurityCheckInput_input);
        bt_search = findView(R.id.bt_search);
        rv_content = findView(R.id.rv_content);
        ib_find = SecurityCheckInput_input.getIb_find();
        btn_add = findView(R.id.btn_add);
        SecurityCheckInput_input_content = SecurityCheckInput_input.gettext();
    }

    @Override
    public void initListener() {
        bt_search.setOnClickListener(this);
        btn_add.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("安全检查");
        setTitleCanBack();
        setTitle("质量检查");
        setTitleCanBack();
        List<DailyCheck> lists = new ArrayList<DailyCheck>();
        DailyCheck dailyCheck = new DailyCheck("XNC1344", "20天", "项目一"
                , "杰", "土建", "未检", "");
        lists.add(dailyCheck);
        DailyCheck dailyCheck1 = new DailyCheck("XNC1344", "20天", "项目一"
                , "杰", "土建", "已检", "查看详情>>");
        lists.add(dailyCheck1);
        adapter=new SecurityCheckAdapter(lists,SecurityCheckActivity.this);
        rv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.bt_search:
                SecurityCheckInput_input_content = SecurityCheckInput_input.gettext();
                Log.d(TAG, "initViews: " + SecurityCheckInput_input_content);
                break;
            case R.id.btn_add:
                Intent intent = new Intent(SecurityCheckActivity.this, SecurityCheckNewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}