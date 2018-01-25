package com.handsome.projectnz.Adapter.Project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/24.
 * 项目模块-项目删档
 *
 */
//项目销档

public class ProjectDeleteFileAdapter extends BaseAdapter {private List<Project> lists=new ArrayList<>();
    private Context context;
    public ProjectDeleteFileAdapter(Context context, List<Project> lists){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_project_delete_file,null,false);
            holder = new ViewHolder();
            holder.tv_project_num=(TextView)convertView.findViewById(R.id.project_num);
            holder.tv_project_name= (TextView) convertView.findViewById(R.id.project_name);
            holder.tv_project_manager = (TextView) convertView.findViewById(R.id.project_manager);
            holder.tv_project_time_limit=(TextView)convertView.findViewById(R.id.time_limit);
            holder.bn_project_delete_file=(Button)convertView.findViewById(R.id.delete_file);
            holder.tv_project_type=(TextView)convertView.findViewById(R.id.project_type);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //设置项目编号
        holder.tv_project_num.setText(lists.get(position).getProjectNum());
        //设置项目名称
        holder.tv_project_name.setText(lists.get(position).getProjectName());
        //设置项目负责人，项目经理
        holder.tv_project_manager.setText(lists.get(position).getProjectManager());
        //设置项目类别
        holder.tv_project_type.setText(lists.get(position).getProjectType());
        //设置项目工期
        holder.tv_project_time_limit.setText(lists.get(position).getTimeLimit()+"天");

        return convertView;
    }

    static class ViewHolder{
        TextView tv_project_num;//项目编号
        TextView tv_project_name;//项目名称
        TextView tv_project_type;//项目类别
        TextView tv_project_manager;//项目经理
        TextView tv_project_time_limit;//项目工期
        Button bn_project_delete_file;//项目销档
    }

}