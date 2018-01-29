package com.handsome.projectnz.Adapter.Home.MaterialHandling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.Module.MaterialIORecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialIORecordAdapter extends BaseAdapter {
    private List<MaterialIORecord> lists = new ArrayList<MaterialIORecord>();
    private Context context;

    public MaterialIORecordAdapter(Context context, List<MaterialIORecord> lists) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_material_io_record, null, false);
            holder = new ViewHolder();
            holder.tv_record_date = (TextView) convertView.findViewById(R.id.record_date);
            holder.tv_record_handler = (TextView) convertView.findViewById(R.id.record_handler);
            holder.tv_material_count = (TextView) convertView.findViewById(R.id.material_count);
            holder.tv_material_belong = (TextView) convertView.findViewById(R.id.material_belong);

            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_record_date.setText(lists.get(position).getDate());
        holder.tv_record_handler.setText(lists.get(position).getHandler());
        holder.tv_material_count.setText(lists.get(position).getCount()+"");
        holder.tv_material_belong.setText(lists.get(position).getBelong());


        return convertView;
    }

    static class ViewHolder {
        TextView tv_record_date;//记录日期
        TextView tv_record_handler;//记录经办人
        TextView tv_material_count;//材料项数
        TextView tv_material_belong;//材料所属
    }
}
