package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/26.
 */

public class SecurityCheckInput extends LinearLayout {
    private Context context;
    private View myview;
    private ImageButton ib_find;
    private EditText et_input;
    private ImageButton ib_wrong;
//    private Button bt_serach;
    private String k;
    private String space=null;
    public SecurityCheckInput(Context context) {
        this(context, null);
    }

    public SecurityCheckInput(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SecurityCheckInput(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        context=context;
        myview = LayoutInflater.from(context).inflate(R.layout.view_security_check_serach, this, true);
        init();
        initclick();
    }

    private void initclick() {
        et_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                k =et_input.getText().toString();
                if (k.equals("")){
                    ib_wrong.setVisibility(GONE);
                }else{
                    ib_wrong.setVisibility(VISIBLE);

                }
            }
        });
        ib_wrong.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input.setText("");
            }
        });
    }

    private void init() {
        ib_find = (ImageButton) myview.findViewById(R.id.ib_find);
        et_input = (EditText) myview.findViewById(R.id.et_input);
        ib_wrong = (ImageButton) myview.findViewById(R.id.ib_wrong);
        et_input.setHint("按项目名称,检查人或者检查项查询");
        et_input.setTextSize(14);
        ib_wrong.setVisibility(GONE);
    }
    //获取文本的内容
    public String gettext(){
        String temp = et_input.getText().toString();
        return temp;
    }
    //获得搜索按钮控件
    public ImageButton getIb_find(){
        return ib_find;
    }
}
