package com.handsome.module_engine.U;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/3/4.
 */
public class GlideUtils {

    /**
     * 加载网络图片
     *
     * @param url
     * @param imageView
     */
    public static void displayImage(Context context, String url, ImageView imageView) {
        try {
            if (url != null) {
                Glide.with(context).load(url).thumbnail(0.1f).into(imageView);
            }
        } catch (Exception e) {
            //Gradle error:java.lang.IllegalArgumentException: You cannot start a load for a destroyed activity
            e.printStackTrace();
        }
    }

}
