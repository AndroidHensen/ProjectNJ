package com.handsome.projectnz.Adapter.Home.MaterialHandling;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.Module.MaterialStream;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.MaterialHandling.StockOutputNewActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialStreamAdapter extends BaseAdapter {
    private List<MaterialStream> lists=new ArrayList<MaterialStream>();
    private Context context;
    public MaterialStreamAdapter(Context context, List<MaterialStream> lists ){
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.view_material_stream_bar,null,false);
            holder = new ViewHolder();
            holder.tv_stream_date= (TextView) convertView.findViewById(R.id.stream_date);
            holder.tv_stream_handler=(TextView)convertView.findViewById(R.id.stream_handler);
            holder.tv_belong_project=(TextView)convertView.findViewById(R.id.stream_belong_project);
            holder.tv_stream_count=(TextView)convertView.findViewById(R.id.stream_count);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_stream_date.setText(lists.get(position).getStreamDate());
        holder.tv_stream_handler.setText(lists.get(position).getStreamHandler());
        holder.tv_belong_project.setText(lists.get(position).getBelongProject());
        holder.tv_stream_count.setText(lists.get(position).getStreamCount()+"");
        int red=context.getResources().getColor(R.color.red);
        int green=context.getResources().getColor(R.color.green);
        int black=convertView.getResources().getColor(R.color.lightGray);
        holder.tv_stream_count.setTextColor(lists.get(position).getStreamCount()>0?red:lists.get(position).getStreamCount()<0?green:black);
        return convertView;
    }

    static class ViewHolder{
        TextView tv_stream_date;//流水日期
        TextView tv_stream_handler;//经办人
        TextView tv_belong_project;//所属项目
        TextView tv_stream_count;//出入库数量
    }
}
