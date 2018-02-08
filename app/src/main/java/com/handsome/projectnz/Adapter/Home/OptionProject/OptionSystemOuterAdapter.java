package com.handsome.projectnz.Adapter.Home.OptionProject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.Module.OptionProject;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.DailyCheck.DailyCheckAlreadyActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class OptionSystemOuterAdapter extends BaseAdapter {
    private List<OptionProject> lists=new ArrayList<OptionProject>();
    private Context context;

    public OptionSystemOuterAdapter(List<OptionProject> lists, Context context) {
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
        OptionSystemOuterAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.view_option_project,null,false);
            holder = new OptionSystemOuterAdapter.ViewHolder();
            holder.tv_itme = (TextView) convertView.findViewById(R.id.tv_item);
            holder.tv_work_day=(TextView)convertView.findViewById(R.id.tv_day);
            holder.tv_work_name=(TextView)convertView.findViewById(R.id.tv_work_kind);
            holder.tv_item_name=(TextView) convertView.findViewById(R.id.tv_item_kind);
            holder.tv_man=(TextView)convertView.findViewById(R.id.tv_managers);
            holder.tv_progress=(TextView)convertView.findViewById(R.id.tv_work_progress);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (OptionSystemOuterAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_itme.setText(lists.get(position).getItem());
        holder.tv_work_day.setText(lists.get(position).getWork_day());
        holder.tv_work_name.setText(lists.get(position).getWork_kind());
        holder.tv_item_name.setText(lists.get(position).getItem_kind());
        holder.tv_man.setText(lists.get(position).getManager());
        holder.tv_progress.setText(lists.get(position).getProgress());
        return convertView;
    }
    static class ViewHolder{
        TextView tv_itme;//项目
        TextView tv_work_day;//工期
        TextView tv_work_name;//工作类别
        TextView tv_item_name;//项目类别
        TextView tv_man;//负责人
        TextView tv_progress;//查看详情
    }
}
