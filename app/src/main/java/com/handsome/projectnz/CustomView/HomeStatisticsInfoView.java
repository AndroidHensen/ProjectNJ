package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class HomeStatisticsInfoView extends LinearLayout{
    private Context context;
    private View view;

    private TextView tv_info_name;//资料清单名称
    private Button bn_download;//下载资料

    private String infoName;//文件清单名

    public HomeStatisticsInfoView(Context context) {
        this(context, null);
    }

    public HomeStatisticsInfoView(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public HomeStatisticsInfoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_home_statistics_info, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.HomeStatisticsInfoView, def, 0);
        infoName = ta.getString(R.styleable.HomeStatisticsInfoView_info_name);
    }

    public void initViews() {
        tv_info_name = (TextView) findViewById(R.id.info_name);
        bn_download = (Button) findViewById(R.id.info_download);
        tv_info_name.setText(infoName);

    }
}
