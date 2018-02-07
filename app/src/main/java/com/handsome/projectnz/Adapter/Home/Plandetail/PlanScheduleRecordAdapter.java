package com.handsome.projectnz.Adapter.Home.Plandetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.PlanScheduleRecord;
import com.handsome.projectnz.Module.PlanStaffRoster;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class PlanScheduleRecordAdapter extends BaseAdapter {
    private List<PlanScheduleRecord> lists=new ArrayList<PlanScheduleRecord>();
    private Context context;

    public PlanScheduleRecordAdapter(List<PlanScheduleRecord> lists, Context context) {
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
        PlanScheduleRecordAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_plan_schedule_record_item,null,false);
            holder = new PlanScheduleRecordAdapter.ViewHolder();
            holder.tv_date = (TextView) convertView.findViewById(R.id.tv_date);
            holder.tv_feedback_people=(TextView)convertView.findViewById(R.id.tv_feedback_people);
            holder.tv_feedback_amount=(TextView)convertView.findViewById(R.id.tv_feedback_amount);
            holder.tv_schedule=(TextView) convertView.findViewById(R.id.tv_schedule);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (PlanScheduleRecordAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_date.setText(lists.get(position).getTime());
        holder.tv_feedback_people.setText(lists.get(position).getName());
        holder.tv_feedback_amount.setText(lists.get(position).getDistance()+"米");
        holder.tv_schedule.setText(lists.get(position).getProgress()+"%");
        return convertView;
    }
    static class ViewHolder{
        TextView tv_date;//日期
        TextView tv_feedback_people;//姓名
        TextView tv_feedback_amount;//距离
        TextView tv_schedule;//进度
    }
}
