package com.handsome.projectnz.Adapter.Home.Announcements;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.module_engine.U.DateUtils;
import com.handsome.projectnz.Manager.InterfaceManger;
import com.handsome.projectnz.Module.Announcements;
import com.handsome.projectnz.Module.Message;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.AnnouncementsCompany.AnnouncementsCompanyActivity;
import com.handsome.projectnz.View.Home.AnnouncementsCompany.AnnouncementsDetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jie on 2018/1/14.
 */

public class AnnouncementsAdapter extends BaseAdapter {

    private List<Announcements.ContentBean.ContentBeanBean> lists = new ArrayList<>();
    private Context context;

    public AnnouncementsAdapter(Context context, List<Announcements.ContentBean.ContentBeanBean> lists) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.view_announcements_company, null, false);
            holder = new ViewHolder();
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_announcements_title);
            holder.tv_read_state = (TextView) convertView.findViewById(R.id.tv_announcements_state);
            holder.tv_content = (TextView) convertView.findViewById(R.id.announcements_content);
            holder.tv_data = (TextView) convertView.findViewById(R.id.tv_announcements_data);
            holder.tv_operation = (TextView) convertView.findViewById(R.id.tv_announcements_operation);
            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_title.setText(lists.get(position).getTitle());
        if (lists.get(position).getIsread() == 1) {
            Drawable gray = context.getResources().getDrawable(R.drawable.message_content_grey_circle_shape);
            holder.tv_read_state.setBackground(gray);
        } else {
            Drawable red = context.getResources().getDrawable(R.drawable.message_content_red_circle_shape);
            holder.tv_read_state.setBackground(red);
        }
        holder.tv_content.setText(lists.get(position).getContent());
        holder.tv_data.setText(DateUtils.stampToDate(lists.get(position).getValidity()));
        holder.tv_operation.setText("查看详情");
        holder.tv_operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AnnouncementsDetailActivity.class);
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    static class ViewHolder {
        TextView tv_title;  //标题
        TextView tv_read_state;  //是否已读   已读true 未读false
        TextView tv_content;    //内容
        TextView tv_data;   //日期
        TextView tv_operation;    //操作
    }
}
