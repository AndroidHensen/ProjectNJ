package com.handsome.projectnz.Adapter.Home.MaterialHandling;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.MaterialHandling.StockOutputNewActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/27.
 */

public class MaterialKeepAdapter extends BaseAdapter {
    private List<Material> lists=new ArrayList<Material>();
    private Context context;
    public MaterialKeepAdapter(Context context, List<Material> lists ){
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
        MaterialOutputAdapter.ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_material_keep,null,false);
            holder = new MaterialOutputAdapter.ViewHolder();
            holder.tv_material_name = (TextView) convertView.findViewById(R.id.material_name);
            holder.tv_material_type=(TextView)convertView.findViewById(R.id.material_type);
            holder.tv_material_department=(TextView)convertView.findViewById(R.id.department_count);
            holder.tv_material_input=(TextView)convertView.findViewById(R.id.input_count);
            holder.tv_material_ouput=(TextView)convertView.findViewById(R.id.output_count);
            holder.tv_material_add=(TextView)convertView.findViewById(R.id.add_count);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (MaterialOutputAdapter.ViewHolder) convertView.getTag();
        }
        holder.tv_material_name.setText(lists.get(position).getName());
        holder.tv_material_type.setText(lists.get(position).getType());
        holder.tv_material_department.setText(lists.get(position).getDepartment());
        holder.tv_material_input.setText(lists.get(position).getInputCount()+"");
        holder.tv_material_ouput.setText(lists.get(position).getOutputCount()+"");
        holder.tv_material_add.setText(lists.get(position).getKeepCount()+"");

        return convertView;
    }

    static class ViewHolder{
        TextView tv_material_name;//物资名称
        TextView tv_material_type;//物资类型
        TextView tv_material_department;//物资计数单位
        TextView tv_material_input;//入库量
        TextView tv_material_ouput;//出库量
        TextView tv_material_add;//存库量
    }
}
