package com.handsome.projectnz.Adapter.Mine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class CompanyInfoEmployeeAdapter extends BaseAdapter {
    private List<Employee> lists=new ArrayList<Employee>();
    private Context context;
    public CompanyInfoEmployeeAdapter(Context context, List<Employee> lists ){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_mine_company_info_employee,null,false);
            holder = new ViewHolder();
            holder.tv_employee_name = (TextView) convertView.findViewById(R.id.employee_name);
            holder.tv_phone = (TextView) convertView.findViewById(R.id.employee_phone);
            holder.tv_e_mail = (TextView) convertView.findViewById(R.id.employee_e_mail);
            holder.tv_position = (TextView) convertView.findViewById(R.id.employee_position);
            holder.tv_company = (TextView) convertView.findViewById(R.id.employee_company);
            holder.tv_department = (TextView) convertView.findViewById(R.id.employee_department);
            holder.tv_comment = (TextView) convertView.findViewById(R.id.employee_comment);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_employee_name.setText(lists.get(position).getEmployee_name());
        holder.tv_position.setText(lists.get(position).getPosition());
        holder.tv_phone.setText(lists.get(position).getPhone());
        holder.tv_e_mail.setText(lists.get(position).getE_mail());
        holder.tv_company.setText(lists.get(position).getCompany());
        holder.tv_department.setText(lists.get(position).getDepartment());
        holder.tv_comment.setText(lists.get(position).getComment());
        return convertView;
    }

    static class ViewHolder{
        TextView tv_employee_name;
        TextView tv_position;
        TextView tv_phone;
        TextView tv_e_mail;
        TextView tv_company;
        TextView tv_department;
        TextView tv_comment;
    }
}
