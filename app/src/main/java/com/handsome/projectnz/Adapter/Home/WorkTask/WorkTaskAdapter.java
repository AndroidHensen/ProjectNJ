package com.handsome.projectnz.Adapter.Home.WorkTask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/15.
 */

public class WorkTaskAdapter extends BaseAdapter {
    private List<TextView> lists = new ArrayList<TextView>();
    private Context context;

    public WorkTaskAdapter(Context context, List<TextView> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.view_message_content,null,false);
        return convertView;
    }
}
