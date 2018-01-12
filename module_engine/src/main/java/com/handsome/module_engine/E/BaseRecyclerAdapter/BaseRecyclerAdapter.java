package com.handsome.module_engine.E.BaseRecyclerAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/11/3.
 */
public abstract class BaseRecyclerAdapter<T> extends android.widget.BaseAdapter {

    protected LayoutInflater inflater;
    protected Context context;
    protected List<T> list;
    protected int layoutId;

    public BaseRecyclerAdapter(Context context, List<T> list, int layoutId) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = getViewHolder(context, convertView, parent);
        convert(viewHolder, list.get(position));
        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder viewHolder, T item);

    private ViewHolder getViewHolder(Context context, View convertView
            , ViewGroup parent) {
        return ViewHolder.getViewHolder(context, convertView, parent, layoutId);
    }
}
