package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/24.
 */

public class PlanProgressTabButton extends LinearLayout {
    private TextView tv_define_number;//标题数字
    private TextView tv_define_content;//标题栏
    private View myview;
    private Context context;
    private int plan_number;//计划个数
    private String plan_content;//计划说明
    public PlanProgressTabButton(Context context) {
        this(context, null);
    }

    public PlanProgressTabButton(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PlanProgressTabButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        myview = LayoutInflater.from(context).inflate(R.layout.view_plan_progress_tab, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
    }

    private void initViews() {
        tv_define_number = (TextView) myview.findViewById(R.id.tv_number);
        tv_define_content = (TextView) myview.findViewById(R.id.tv_plan_content);
        tv_define_content.setText(plan_content);
        if (plan_number!=0) {
           tv_define_number.setText("("+plan_number+")");
        } else {
            tv_define_number.setVisibility(GONE);
        }
//        isSelected(mtb_selected);
    }

    private void initAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PlanProgressTabButton, defStyleAttr, 0);
        plan_content = ta.getString(R.styleable.PlanProgressTabButton_Plan_explain);
        plan_number = ta.getInteger(R.styleable.PlanProgressTabButton_Plan_number,0);

    }
    public void isSelected(boolean b) {
        if (b) {
            myview.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tv_define_content.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_define_number.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            myview.setBackground(getResources().getDrawable(R.drawable.work_task_bd_white_bg_blue));
            tv_define_content.setTextColor(getResources().getColor(R.color.colorWhite));
            tv_define_number.setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }
}
