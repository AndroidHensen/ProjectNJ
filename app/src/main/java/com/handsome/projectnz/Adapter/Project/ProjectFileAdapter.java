package com.handsome.projectnz.Adapter.Project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Project.ProjectFileCollectActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/21.
 * 项目模块-项目归档
 */

public class ProjectFileAdapter extends BaseAdapter {
    private List<Project> lists = new ArrayList<>();
    private Context context;

    public ProjectFileAdapter(Context context, List<Project> lists) {
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_project_file, null, false);
            holder = new ViewHolder();
            holder.tv_project_num = (TextView) convertView.findViewById(R.id.project_num);
            holder.tv_project_name = (TextView) convertView.findViewById(R.id.project_name);
            holder.tv_project_manager = (TextView) convertView.findViewById(R.id.project_manager);
            holder.tv_project_state = (TextView) convertView.findViewById(R.id.project_state);
            holder.bn_project_file = (Button) convertView.findViewById(R.id.file);
            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //设置项目编号
        holder.tv_project_num.setText(lists.get(position).getProjectNum());
        //设置项目名称
        holder.tv_project_name.setText(lists.get(position).getProjectName());
        //设置项目负责人，项目经理
        holder.tv_project_manager.setText(lists.get(position).getProjectManager());
        //设置项目进度
        if (lists.get(position).getProjectProgress() == 100) {
            holder.tv_project_state.setText("已完成");
            holder.bn_project_file.setVisibility(View.VISIBLE);
        } else {
            holder.tv_project_state.setText("正在进行中");
            holder.bn_project_file.setVisibility(View.INVISIBLE);
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProjectFileCollectActivity.class);
                i.putExtra("project", lists.get(position));
                context.startActivity(i);
            }
        });
        return convertView;
    }

    static class ViewHolder {
        TextView tv_project_num;//项目编号
        TextView tv_project_name;//项目名称
        TextView tv_project_manager;//项目经理
        TextView tv_project_state;//项目状态
        Button bn_project_file;//项目归档
    }
}
