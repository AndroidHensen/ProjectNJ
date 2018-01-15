package com.handsome.projectnz.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;
import com.handsome.projectnz.V.Project.ProjectSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/15.
 */

public class ProjectSumConductingAdapter extends BaseAdapter {
    private List<Project> lists=new ArrayList<>();
    private Context context;
    public ProjectSumConductingAdapter(Context context, List<Project> lists){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.view_project_sum_conducting,null,false);
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
        holder.tv_project_name.setText(lists.get(position).getProjectName());
        holder.tv_time_limit.setText(lists.get(position).getTimeLimit()+"天");
        holder.tv_engineering_type.setText(lists.get(position).getEngineeringType());
        holder.tv_project_type.setText(lists.get(position).getProjectType());
        holder.tv_project_manager.setText(lists.get(position).getProjectManager());
        holder.tv_initiator.setText(lists.get(position).getInitiator());
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
