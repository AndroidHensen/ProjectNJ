package com.handsome.projectnz.Adapter.Home.MaterialHandling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.MaterialIO;
import com.handsome.projectnz.Module.MaterialIORecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class MaterialIODetailAdapter extends BaseAdapter {

    private List<MaterialIO> lists = new ArrayList<MaterialIO>();
    private Context context;

    public MaterialIODetailAdapter(Context context, List<MaterialIO> lists) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_material_io_detail, null, false);
            holder = new ViewHolder();
            holder.tv_material_name = (TextView) convertView.findViewById(R.id.material_name);
            holder.tv_material_type = (TextView) convertView.findViewById(R.id.material_type);
            holder.tv_material_count = (TextView) convertView.findViewById(R.id.material_count);
            holder.tv_material_department = (TextView) convertView.findViewById(R.id.material_department);

            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_material_name.setText(lists.get(position).getMaterial_name());
        holder.tv_material_type.setText(lists.get(position).getMaterial_type());
        holder.tv_material_count.setText(lists.get(position).getMaterial_io_count()+"");
        holder.tv_material_department.setText(lists.get(position).getMaterial_department());


        return convertView;
    }

    static class ViewHolder {
        TextView tv_material_name;//材料名称
        TextView tv_material_type;//材料类型
        TextView tv_material_count;//材料进出库数量
        TextView tv_material_department;//材料单位
    }
}
