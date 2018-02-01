package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/28.
 */

public class DailyCheckNewAdd extends RelativeLayout {
    private Context context;
    private View myview;
    private EditText myedittive;
    private TextView mytextview;
    public DailyCheckNewAdd(Context context) {
        this(context, null);
    }

    public DailyCheckNewAdd(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DailyCheckNewAdd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        myview = LayoutInflater.from(context).inflate(R.layout.view_daily_check_new, this, true);
        init();
    }

    private void init() {
        myedittive = (EditText) myview.findViewById(R.id.et_add);
        mytextview = (TextView) myview.findViewById(R.id.tv_red);
    }
    //获取Edittive控件
    public EditText getedittive(){
        return myedittive;
    }
    //获取textview控件
    public TextView gettextview(){
        return mytextview;
    }
    //获取editive输入的字体
    public String getstringofeditvie(){
        String temp = myedittive.getText().toString();
        return temp;
    }
    //
}
