package com.handsome.projectnz.Adapter.Home.WorkTask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.ReturnProjectTask;
import com.handsome.projectnz.Module.WorkTaskOfficialMessage;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/16.
 */

public class ReturnProjectTaskAdapter extends BaseAdapter {
    private List<ReturnProjectTask> lists = new ArrayList<>();
    private Context context;

    public ReturnProjectTaskAdapter(Context context, List<ReturnProjectTask> lists) {
        this.lists = lists;
        this.context = context;
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
        ReturnProjectTaskAdapter.ViewHolder holder = null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_return_project_task_item, null, false);
            holder=new ViewHolder();
            holder.data=(TextView)convertView.findViewById(R.id.tv_data);
            holder.detail=(TextView)convertView.findViewById(R.id.tv_workload);
            convertView.setTag(holder);
        }else{
            holder=(ReturnProjectTaskAdapter.ViewHolder)convertView.getTag();
        }
        holder.data.setText(lists.get(position).getData());
        holder.data.setTextColor(context.getResources().getColor(R.color.blue));
        holder.detail.setText("完成工作量： "+lists.get(position).getMeter()+"  米  进度："+lists.get(position).getProgress());
        holder.detail.setTextColor(context.getResources().getColor(R.color.white));
        return convertView;
    }
    static class ViewHolder {
        TextView data;   //时间
        TextView detail;   //具体详情
    }
}
