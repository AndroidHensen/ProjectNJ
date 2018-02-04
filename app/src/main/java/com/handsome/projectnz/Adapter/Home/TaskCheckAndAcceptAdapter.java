package com.handsome.projectnz.Adapter.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Adapter.Home.Statistics.InfoStatisticsAdapter;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.Module.Task;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.WorkTask.WorkTaskOfficial.WorkTaskOfficialAcceptActivity;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/29.
 */

public class TaskCheckAndAcceptAdapter extends BaseAdapter {
    private List<Task> lists=new ArrayList<Task>();
    private Context context;
    public TaskCheckAndAcceptAdapter(Context context, List<Task> lists ){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_task_acceptance_check,null,false);
            holder = new ViewHolder();
            holder.tv_task_name = (TextView) convertView.findViewById(R.id.task_name);
            holder.tv_task_type=(TextView)convertView.findViewById(R.id.task_type);
            holder.tv_task_manager = (TextView) convertView.findViewById(R.id.task_manager);
            holder.tv_task_end_time=(TextView)convertView.findViewById(R.id.task_end_time);
            holder.tv_task_limit_time = (TextView) convertView.findViewById(R.id.task_limit_time);
            holder.tv_task_progress=(TextView)convertView.findViewById(R.id.task_progress);
            holder.bn_check_and_accept=(Button)convertView.findViewById(R.id.task_check_and_accept);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_task_name.setText(lists.get(position).getTaskName());
        holder.tv_task_type.setText(lists.get(position).getTaskType());
        holder.tv_task_manager.setText(lists.get(position).getExecutePerson());
        holder.tv_task_end_time.setText(lists.get(position).getTaskEndTime());
        holder.tv_task_limit_time.setText(lists.get(position).getTaskLimitTime()+"");
        holder.tv_task_progress.setText(lists.get(position).getTaskProgress()+"");
        holder.bn_check_and_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(context, WorkTaskOfficialAcceptActivity.class);
                context.startActivity(i);
            }
        });
        return convertView;
    }

    static class ViewHolder{
        TextView tv_task_name;
        TextView tv_task_type;
        TextView tv_task_manager;
        TextView tv_task_end_time;
        TextView tv_task_limit_time;
        TextView tv_task_progress;
        Button bn_check_and_accept;
    }
}
