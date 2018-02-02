package com.handsome.projectnz.Adapter.Home.WorkReport;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Announcements;
import com.handsome.projectnz.Module.WorkReport;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.AnnouncementsCompany.AnnouncementsDetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/14.
 */

public class WorkRportReceiveAdaptere extends BaseAdapter {
    private List<WorkReport> lists=new ArrayList<WorkReport>();
    private Context context;
    public WorkRportReceiveAdaptere(Context context, List<WorkReport> lists ){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.view_work_report,null,false);
            holder = new ViewHolder();
            holder.tv_title_content = (TextView) convertView.findViewById(R.id.tv_title_content);
            holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            holder.tv_work_content = (TextView) convertView.findViewById(R.id.tv_work_content);
            holder.tv_read_state = (TextView) convertView.findViewById(R.id.tv_read_state);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_title_content.setText(lists.get(position).getTitle_content());
        if(lists.get(position).getRead_state()){
            holder.tv_read_state.setText("已阅");
            holder.tv_read_state.setTextColor(context.getResources().getColor(R.color.blue));
        }
        else{
            holder.tv_read_state.setText("待阅");
            holder.tv_read_state.setTextColor(context.getResources().getColor(R.color.blue));
        }
        holder.tv_work_content.setText(lists.get(position).getWork_content());
        holder.tv_time.setText(lists.get(position).getTime());

        return convertView;
    }

    static class ViewHolder{
        TextView tv_title_content;  //标题
        TextView tv_read_state;  //是否已读   已读true 未读false
        TextView tv_work_content;   //内容
        TextView tv_time;   //日期
    }
}
