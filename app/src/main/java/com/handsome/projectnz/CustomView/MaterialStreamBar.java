package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.R;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialStreamBar extends LinearLayout {
    private Context context;
    private View view;

    private TextView tv_stream_date;//日期
    private TextView tv_stream_handler;//经办人
    private TextView tv_stream_belong_project;//项目
    private TextView tv_stream_count;//进出库数量

    private String streamDate;
    private String streamHandler;
    private String streamBelongProject;
    private int streamCount;

    public MaterialStreamBar(Context context) {
        this(context, null);
    }

    public MaterialStreamBar(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public MaterialStreamBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_material_stream_bar, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.MaterialStreamBar, def, 0);
        streamDate = ta.getString(R.styleable.MaterialStreamBar_stream_date);
        streamHandler=ta.getString(R.styleable.MaterialStreamBar_stream_handler);
        streamBelongProject=ta.getString(R.styleable.MaterialStreamBar_stream_belong_project);
        streamCount=ta.getInt(R.styleable.MaterialStreamBar_stream_count,0);
    }

    public void initViews() {
        tv_stream_date = (TextView) findViewById(R.id.stream_date);
        tv_stream_handler = (TextView) findViewById(R.id.stream_handler);
        tv_stream_belong_project = (TextView) findViewById(R.id.stream_belong_project);
        tv_stream_count = (TextView) findViewById(R.id.stream_count);
        tv_stream_date.setText(streamDate);
        tv_stream_handler.setText(streamHandler);
        tv_stream_belong_project.setText(streamBelongProject);
        tv_stream_count.setText(streamCount+"");
    }
}
