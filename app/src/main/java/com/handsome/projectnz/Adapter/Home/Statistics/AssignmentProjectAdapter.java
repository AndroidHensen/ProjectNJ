package com.handsome.projectnz.Adapter.Home.Statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Task;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class AssignmentProjectAdapter extends BaseAdapter {
    private List<Task> lists=new ArrayList<Task>();
    private Context context;
    public AssignmentProjectAdapter(Context context, List<Task> lists ){
        this.context=context;
        this.lists= lists;
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
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_assignment_project,null,false);
            holder = new ViewHolder();
            holder.tv_task_name = (TextView) convertView.findViewById(R.id.task_name);
            holder.tv_task_priority=(TextView)convertView.findViewById(R.id.task_priority);
            holder.tv_task_object=(TextView)convertView.findViewById(R.id.task_object);
            holder.tv_task_progress=(TextView)convertView.findViewById(R.id.task_progress);
            holder.tv_task_end_time=(TextView)convertView.findViewById(R.id.task_end_time);
            holder.tv_task_comment=(TextView)convertView.findViewById(R.id.task_comment);
            holder.tv_task_limit=(TextView)convertView.findViewById(R.id.task_limit_time);

            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_task_name.setText(lists.get(position).getTaskName());
        holder.tv_task_priority.setText(lists.get(position).getTaskPriority());
        holder.tv_task_progress.setText(lists.get(position).getTaskProgress()+"%");
        holder.tv_task_object.setText(lists.get(position).getExecutePerson());
        holder.tv_task_end_time.setText(lists.get(position).getTaskEndTime());
        holder.tv_task_limit.setText(lists.get(position).getTaskLimitTime()+"天");


        return convertView;
    }

    static class ViewHolder{
        TextView tv_task_name;
        TextView tv_task_priority;
        TextView tv_task_object;
        TextView tv_task_progress;
        TextView tv_task_end_time;
        TextView tv_task_comment;
        TextView tv_task_limit;
    }
}
