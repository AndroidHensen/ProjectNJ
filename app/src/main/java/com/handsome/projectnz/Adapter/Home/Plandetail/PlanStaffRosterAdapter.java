package com.handsome.projectnz.Adapter.Home.Plandetail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.Module.PlanStaffRoster;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.DailyCheck.DailyCheckAlreadyActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class PlanStaffRosterAdapter extends BaseAdapter {
    private List<PlanStaffRoster> lists=new ArrayList<PlanStaffRoster>();
    private Context context;

    public PlanStaffRosterAdapter(List<PlanStaffRoster> lists, Context context) {
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
        PlanStaffRosterAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_plan_staff_roster_item,null,false);
            holder = new PlanStaffRosterAdapter.ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_station=(TextView)convertView.findViewById(R.id.tv_station);
            holder.tv_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            holder.tv_email=(TextView) convertView.findViewById(R.id.tv_email);
            holder.tv_category=(TextView)convertView.findViewById(R.id.tv_category);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (PlanStaffRosterAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_name.setText(lists.get(position).getName());
        holder.tv_station.setText(lists.get(position).getStation());
        holder.tv_phone.setText(lists.get(position).getPhone());
        holder.tv_email.setText(lists.get(position).getEmail());
        holder.tv_category.setText(lists.get(position).getCategory());
        return convertView;
    }
    static class ViewHolder{
        TextView tv_name;//名字
        TextView tv_station;//岗位
        TextView tv_phone;//项目名称
        TextView tv_email;//邮箱
        TextView tv_category;//人员类别
    }
}
