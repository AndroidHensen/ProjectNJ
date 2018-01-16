package com.handsome.projectnz.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.WorkTaskProjectMessage;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/15.
 */

public class WorkTaskProjectAdapter extends BaseAdapter {
    private List<WorkTaskProjectMessage> lists = new ArrayList<>();
    private Context context;

    public WorkTaskProjectAdapter(Context context, List<WorkTaskProjectMessage> lists) {
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
        ViewHolder holder = null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_return_project_task_item, null, false);
            holder=new ViewHolder();
            holder.tv_project_status=(TextView)convertView.findViewById(R.id.tv_project_status);
            holder.tv_arrange_people=(TextView)convertView.findViewById(R.id.tv_arrange_people);
            holder.tv_project_schedule_status=(TextView)convertView.findViewById(R.id.tv_project_schedule_status);
            holder.tv_project_time=(TextView)convertView.findViewById(R.id.tv_project_time);
            holder.tv_over_date=(TextView)convertView.findViewById(R.id.tv_over_date);
            holder.tv_work_date=(TextView)convertView.findViewById(R.id.tv_work_date);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        holder.tv_project_status.setText(lists.get(position).getProject_status());
        holder.tv_arrange_people.setText(lists.get(position).getArrange_people());
        holder.tv_project_schedule_status.setText(lists.get(position).getProject_schedule_status());
        holder.tv_project_time.setText(lists.get(position).getProject_time());
        holder.tv_over_date.setText(lists.get(position).getOver_date());
        holder.tv_work_date.setText(lists.get(position).getWork_date());
        return convertView;
    }

    static class ViewHolder {
        TextView tv_project_status;    //状态(项目任务)
        TextView tv_arrange_people;    //安排人
        TextView tv_project_schedule_status;     //进度状态(项目任务)
        TextView tv_project_time; //时间(项目任务)
        TextView tv_over_date;    //超期
        TextView tv_work_date;    //工期
    }
}
