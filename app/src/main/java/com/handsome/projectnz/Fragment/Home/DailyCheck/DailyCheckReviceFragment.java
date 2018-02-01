package com.handsome.projectnz.Fragment.Home.DailyCheck;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.DailyCheck.DailyCheckInformAdapter;
import com.handsome.projectnz.Adapter.Home.DailyCheck.DailyCheckReviceAdapter;
import com.handsome.projectnz.CustomView.SecurityCheckInput;
import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/28.
 */

public class DailyCheckReviceFragment extends BaseLazyFragment {
    private static final String TAG = "DailyCheckReviceFragmen";
    private SecurityCheckInput SecurityCheckInput_input;//组合控件（上方搜索栏）
    private Button bt_search;//搜索按钮
    private ListView rv_content;//下方内容
    private ImageButton ib_find;//收索栏的搜索镜
    private String SecurityCheckInput_input_content;//搜索栏所填文本
    private DailyCheckReviceAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_daily_check_revice;
    }

    @Override
    public void initViews() {
        SecurityCheckInput_input = findView(R.id.SecurityCheckInput_input);
        bt_search = findView(R.id.bt_search);
        rv_content = findView(R.id.rv_content);
        ib_find = SecurityCheckInput_input.getIb_find();
    }

    @Override
    public void initListener() {
        bt_search.setOnClickListener(this);
    }

    @Override
    public void initData() {
        List<DailyCheck> lists = new ArrayList<DailyCheck>();
        DailyCheck dailyCheck = new DailyCheck("XNC1344", "20天", "项目一"
                , "杰", "土建", "未巡查", "");
        lists.add(dailyCheck);
        DailyCheck dailyCheck1 = new DailyCheck("XNC1344", "20天", "项目一"
                , "杰", "土建", "未巡查", "查看详情>>");
        lists.add(dailyCheck1);
        adapter=new DailyCheckReviceAdapter(lists,getActivity());
        rv_content.setAdapter(adapter);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()){
            case R.id.bt_search:
                SecurityCheckInput_input_content = SecurityCheckInput_input.gettext();
                Log.d(TAG, "initViews: "+SecurityCheckInput_input_content);
                break;
            default:
                break;
        }
    }
}
