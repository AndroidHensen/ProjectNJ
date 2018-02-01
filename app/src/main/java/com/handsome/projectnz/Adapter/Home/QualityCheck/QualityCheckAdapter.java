package com.handsome.projectnz.Adapter.Home.QualityCheck;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.DailyCheck.DailyCheckAlreadyActivity;
import com.handsome.projectnz.View.Home.QualityCheck.QualityCheckAlreadyActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class QualityCheckAdapter extends BaseAdapter {
    private List<DailyCheck> lists=new ArrayList<DailyCheck>();
    private Context context;

    public QualityCheckAdapter(List<DailyCheck> lists, Context context) {
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
        QualityCheckAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_security_check,null,false);
            holder = new QualityCheckAdapter.ViewHolder();
            holder.tv_itme_number = (TextView) convertView.findViewById(R.id.tv_itme_number);
            holder.tv_work_day=(TextView)convertView.findViewById(R.id.tv_work_day);
            holder.tv_name=(TextView)convertView.findViewById(R.id.tv_name);
            holder.btn_check=(Button) convertView.findViewById(R.id.btn_check);
            holder.tv_man=(TextView)convertView.findViewById(R.id.tv_man);
            holder.tv_kind_name=(TextView)convertView.findViewById(R.id.tv_kind_name);
            holder.tv_detail=(TextView)convertView.findViewById(R.id.tv_detail);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (QualityCheckAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_itme_number.setText(lists.get(position).getItem_number());
        holder.tv_work_day.setText(lists.get(position).getAll_time());
        holder.tv_name.setText(lists.get(position).getItem_name());
        holder.btn_check.setText(lists.get(position).getItem_status());
        if (lists.get(position).getItem_status()=="已检"){
            Drawable green = context.getResources().getDrawable(R.drawable.common_bg_green_radius);
            holder.btn_check.setBackground(green);
        }else{
            Drawable blue= context.getResources().getDrawable(R.drawable.common_bg_blue_radius);
            holder.btn_check.setBackground(blue);
        }
        holder.tv_man.setText(lists.get(position).getManager());
        holder.tv_kind_name.setText(lists.get(position).getItem_character());
        holder.tv_detail.setText(lists.get(position).getDetail());
        holder.tv_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, QualityCheckAlreadyActivity.class);
//                i.putExtra("material",lists.get(position));
                context.startActivity(i);
            }
        });
        return convertView;
    }
    static class ViewHolder{
        TextView tv_itme_number;//项目编号
        TextView tv_work_day;//工期
        TextView tv_name;//项目名称
        Button btn_check;//已未检
        TextView tv_man;//负责人
        TextView tv_kind_name;//工程类别
        TextView tv_detail;//查看详情
    }
}
