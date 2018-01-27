package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
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

public class PictureView extends LinearLayout {
    private Context context;
    private View view;

    private ImageView iv_delete;//删除
    private ImageView iv_picture;//图片



    public PictureView(Context context) {
        this(context, null);
    }

    public PictureView(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public PictureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_picture, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
    }

    public void initViews() {
        iv_delete = (ImageView) findViewById(R.id.delete);
        iv_picture = (ImageView) findViewById(R.id.picture);
    }
}
