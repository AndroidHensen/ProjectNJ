package com.handsome.projectnz.Adapter.Home.PlanProgress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.PlanProgress;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class PlanProgressAchieveAdapter extends BaseAdapter {
    private List<PlanProgress> lists=new ArrayList<PlanProgress>();
    private Context context;

    public PlanProgressAchieveAdapter(List<PlanProgress> lists, Context context) {
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
        PlanProgressAchieveAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_plan_progress,null,false);
            holder = new PlanProgressAchieveAdapter.ViewHolder();
            holder.tv_work_content = (TextView) convertView.findViewById(R.id.tv_work_content);
            holder.tv_task_kind=(TextView)convertView.findViewById(R.id.tv_task_kind);
            holder.tv_manger=(TextView)convertView.findViewById(R.id.tv_manger);
            holder.tv_start_time=(TextView) convertView.findViewById(R.id.tv_start_time);
            holder.tv_allwork_time=(TextView)convertView.findViewById(R.id.tv_delay_time);
            holder.tv_workload=(TextView)convertView.findViewById(R.id.tv_workload);
            holder.tv_progress=(TextView)convertView.findViewById(R.id.tv_progress);
            holder.tv_over_time=(TextView)convertView.findViewById(R.id.tv_time);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (PlanProgressAchieveAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_work_content.setText(lists.get(position).getWork_content());
        holder.tv_task_kind.setText(lists.get(position).getTask_kind());
        holder.tv_manger.setText(lists.get(position).getManager());
        if (lists.get(position).getTask_kind()=="建造"){
            holder.tv_start_time.setText("派工日期："+lists.get(position).getTv_start_time());
            holder.tv_allwork_time.setText("工期："+lists.get(position).getAllwork_time()+"天");
        }else{
            holder.tv_start_time.setText("验收日期："+lists.get(position).getTv_start_time());
            holder.tv_allwork_time.setText("验收不通过："+lists.get(position).getAllwork_time()+"天");
        }

        holder.tv_workload.setText(lists.get(position).getWorkload());
        holder.tv_progress.setText(lists.get(position).getProgress()+"%");
        holder.tv_over_time.setText(lists.get(position).getOver_time());
        return convertView;
    }

    static class ViewHolder{
        TextView tv_work_content;//项目编号
        TextView tv_task_kind;//工作类型
        TextView tv_manger;//负责人
        TextView tv_start_time;//派工日期，验收日期
        TextView tv_allwork_time;//工期，验收不通过时间
        TextView tv_workload;//工作量
        TextView tv_progress;//工作进度
        TextView tv_over_time;//超期
    }
}
