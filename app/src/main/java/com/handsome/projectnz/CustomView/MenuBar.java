package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.R;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class MenuBar extends LinearLayout {
    private Context context;
    private View view;

    private TextView tv_menu_name;//菜单名称
    private TextView tv_menu_content;//菜单内容
    private TextView tv_menu_comment;//菜单备注
    private TextView tv_menu_ic;//菜单尾部图片

    private String menuName;//名称
    private String menuContent;//内容
    private String menuComment;//备注
    private Boolean menuIcVisible;//尾部图标是否可见

    public MenuBar(Context context) {
        this(context, null);
    }

    public MenuBar(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public MenuBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_menu_bar, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.MenuBar, def, 0);
        menuName = ta.getString(R.styleable.MenuBar_menu_name);
        menuContent=ta.getString(R.styleable.MenuBar_menu_content);
        menuComment=ta.getString(R.styleable.MenuBar_menu_comment);
        menuIcVisible=ta.getBoolean(R.styleable.MenuBar_menu_ic_visible,true);
    }

    public void initViews() {
        tv_menu_name = (TextView) findViewById(R.id.menu_name);
        tv_menu_content = (TextView) findViewById(R.id.menu_content);
        tv_menu_comment = (TextView) findViewById(R.id.menu_comment);
        tv_menu_ic = (TextView) findViewById(R.id.menu_ic);
        tv_menu_name.setText(menuName);
        tv_menu_content.setText(menuContent);
        tv_menu_comment.setText(menuComment);
        tv_menu_ic.setVisibility(menuIcVisible?VISIBLE:INVISIBLE);
    }
    public void setMenuNameText(String name){
        tv_menu_name.setText(name);
    }
    public void setMenuContentText(String content){
        tv_menu_content.setText(content);
        tv_menu_content.setTextColor(getResources().getColor(R.color.lightGray));
    }
    public void setTv_menu_commentText(String comment){
        tv_menu_comment.setText(comment);
    }
    public CharSequence getMenuNameText(){
        return tv_menu_name.getText();
    }
    public CharSequence getMenuContent(){
        return tv_menu_content.getText();
    }
    public CharSequence getMenuCommentText(){
        return tv_menu_comment.getText();
    }


}
