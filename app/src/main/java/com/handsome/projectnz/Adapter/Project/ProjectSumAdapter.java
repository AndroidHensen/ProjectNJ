package com.handsome.projectnz.Adapter.Project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/15.
 * 项目模块-项目汇总
 */

public class ProjectSumAdapter extends BaseAdapter {
    private List<Project> lists=new ArrayList<>();
    private Context context;
    public ProjectSumAdapter(Context context, List<Project> lists){
        this.context=context;
        this.lists=lists;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_project_sum,null,false);
            holder = new ViewHolder();
            holder.tv_project_name= (TextView) convertView.findViewById(R.id.project_name);
            holder.tv_time_limit = (TextView) convertView.findViewById(R.id.time_limit);
            holder.tv_engineering_type = (TextView) convertView.findViewById(R.id.engineering_type);
            holder.tv_project_type = (TextView) convertView.findViewById(R.id.project_type);
            holder.tv_project_manager = (TextView) convertView.findViewById(R.id.project_manager);
            holder.tv_initiator = (TextView) convertView.findViewById(R.id.project_initiator);
            holder.tv_project_progress = (TextView) convertView.findViewById(R.id.project_progress);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //设置项目名称
        holder.tv_project_name.setText(lists.get(position).getProjectName());
        //设置项目工期
        holder.tv_time_limit.setText(lists.get(position).getTimeLimit()+"天");
        //设置工程类别
        holder.tv_engineering_type.setText(lists.get(position).getEngineeringType());
        //设置项目类别
        holder.tv_project_type.setText(lists.get(position).getProjectType());
        //设置项目经理 （项目负责人）
        holder.tv_project_manager.setText(lists.get(position).getProjectManager());
        //设置发起人
        holder.tv_initiator.setText(lists.get(position).getInitiator());
        //设置项目进度
        holder.tv_project_progress.setText(lists.get(position).getProjectProgress()+"%");
        return convertView;
    }

    static class ViewHolder{
        TextView tv_project_name;  //项目名称
        TextView tv_time_limit;//工期
        TextView tv_engineering_type;  //工程类别
        TextView tv_project_type;    //项目类别
        TextView tv_project_manager;   //项目经理
        TextView tv_initiator;    //项目发起人
        TextView tv_project_progress;//项目进度
    }
}
