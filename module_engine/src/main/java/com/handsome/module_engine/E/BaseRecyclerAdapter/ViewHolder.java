package com.handsome.module_engine.E.BaseRecyclerAdapter;

import android.view.View;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/11/3.
 */
public class ViewHolder {

    private SparseArray<View> views;
    private View convertView;

    public ViewHolder(Context context, ViewGroup parent, int layoutId) {
        views = new SparseArray<>();
        convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        convertView.setTag(this);
    }

    public static ViewHolder getViewHolder(Context context, View convertView
            , ViewGroup parent, int layoutId) {
        if (convertView == null) {
            return new ViewHolder(context, parent, layoutId);
        }
        return (ViewHolder) convertView.getTag();
    }

    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public View getConvertView() {
        return convertView;
    }
}
