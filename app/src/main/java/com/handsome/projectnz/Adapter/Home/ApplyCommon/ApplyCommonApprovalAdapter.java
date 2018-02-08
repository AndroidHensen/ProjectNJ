package com.handsome.projectnz.Adapter.Home.ApplyCommon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.handsome.projectnz.Module.ApplyCommon;
import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.ApplyCommon.ApplyDetailsActivity;
import com.handsome.projectnz.View.Home.DailyCheck.DailyCheckAlreadyActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/2/1.
 */

public class ApplyCommonApprovalAdapter extends BaseAdapter {
    private List<ApplyCommon> lists=new ArrayList<ApplyCommon>();
    private Context context;

    public ApplyCommonApprovalAdapter(List<ApplyCommon> lists, Context context) {
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
        ApplyCommomSubmitAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_apply_common,null,false);
            holder = new ApplyCommomSubmitAdapter.ViewHolder();
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tv_time=(TextView)convertView.findViewById(R.id.tv_time);
            holder.tv_details=(TextView)convertView.findViewById(R.id.tv_content);
            holder.tv_status=(TextView) convertView.findViewById(R.id.tv_status);
            if (lists.get(position).getStatus()=="待审批"){
                holder.tv_status.setTextColor(context.getResources().getColor(R.color.blue));
            }if (lists.get(position).getStatus()=="已审批"){
                holder.tv_status.setTextColor(context.getResources().getColor(R.color.green));
            }if (lists.get(position).getStatus()=="审批不通过"){
                holder.tv_status.setTextColor(context.getResources().getColor(R.color.red));
            }
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ApplyCommomSubmitAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_title.setText(lists.get(position).getTitle());
        holder.tv_time.setText(lists.get(position).getTime());
        holder.tv_status.setText(lists.get(position).getStatus());
        holder.tv_details.setText("点击查看详情");
        holder.tv_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, ApplyDetailsActivity.class);
//                i.putExtra("material",lists.get(position));
                context.startActivity(i);
            }
        });
        return convertView;
    }
    static class ViewHolder{
        TextView tv_title;//标题
        TextView tv_time;//时间
        TextView tv_details;//查看详情
        TextView tv_status;//状态
    }
}
