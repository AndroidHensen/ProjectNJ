package com.handsome.projectnz.Adapter.Home.WorkTask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.WorkTaskOfficialMessage;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YX_PC on 2018/1/16.
 */

public class WorkTaskOfficialAdapter extends BaseAdapter {
    private List<WorkTaskOfficialMessage> lists = new ArrayList<>();
    private Context context;

    public WorkTaskOfficialAdapter(Context context,List<WorkTaskOfficialMessage> lists) {
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
        WorkTaskOfficialAdapter.ViewHolder holder = null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_work_task_assign_official_item, null, false);
            holder=new ViewHolder();
            holder.tv_department=(TextView)convertView.findViewById(R.id.tv_department);
            holder.tv_official_status=(TextView)convertView.findViewById(R.id.tv_official_status);
            holder.tv_official_time=(TextView)convertView.findViewById(R.id.tv_official_time);
            holder.tv_content=(TextView)convertView.findViewById(R.id.tv_content);
            holder.tv_official_schedule_status=(TextView)convertView.findViewById(R.id.tv_official_schedule_status);
            convertView.setTag(holder);
        }else{
            holder=(WorkTaskOfficialAdapter.ViewHolder)convertView.getTag();
        }
        holder.tv_department.setText(lists.get(position).getDepartment());
        holder.tv_official_status.setText(lists.get(position).getOfficial_schedule_status());
        holder.tv_official_time.setText(lists.get(position).getOfficial_time());
        holder.tv_content.setText(lists.get(position).getContent());
        holder.tv_official_schedule_status.setText(lists.get(position).getOfficial_status());
        return convertView;
    }
    static class ViewHolder {
        TextView tv_department;   //部门
        TextView tv_official_status;   //状态(办公任务)
        TextView tv_official_time;     //时间(办公任务)
        TextView tv_content;      //内容
        TextView tv_official_schedule_status;    //进度状态(办公任务)
    }
}
