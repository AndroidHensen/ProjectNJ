package com.handsome.projectnz.Adapter.Home.Statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Adapter.Mine.CompanyInfoEmployeeAdapter;
import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class InfoStatisticsAdapter extends BaseAdapter {
    private List<Project> lists=new ArrayList<Project>();
    private Context context;
    public InfoStatisticsAdapter(Context context, List<Project> lists ){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_home_statistics_info,null,false);
            holder = new ViewHolder();
            holder.tv_project_name = (TextView) convertView.findViewById(R.id.project_name);
            holder.tv_project_state=(TextView)convertView.findViewById(R.id.project_state);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_project_name.setText(lists.get(position).getProjectName());
        if(lists.get(position).getProjectProgress()<100)
             holder.tv_project_state.setText("进行中");
        else{
            //已归档，未归档，是否验收的判断
            holder.tv_project_state.setText("已完成");
        }
        return convertView;
    }

    static class ViewHolder{
        TextView tv_project_name;
        TextView tv_project_state;
    }
}
