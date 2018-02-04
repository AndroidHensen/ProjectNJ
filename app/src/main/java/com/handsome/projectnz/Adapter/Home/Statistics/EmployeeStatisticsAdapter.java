package com.handsome.projectnz.Adapter.Home.Statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.Module.Task;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/2/3.
 */

public class EmployeeStatisticsAdapter extends BaseAdapter {
    private List<Employee> lists=new ArrayList<Employee>();
    private Context context;
    public EmployeeStatisticsAdapter(Context context, List<Employee> lists ){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_employee_statistics,null,false);
            holder = new ViewHolder();
            holder.tv_employee_name = (TextView) convertView.findViewById(R.id.employee_name);
            holder.tv_employee_type=(TextView)convertView.findViewById(R.id.employee_type);
            holder.tv_employee_work_date=(TextView)convertView.findViewById(R.id.employee_work_date);
            holder.tv_employee_occupation=(TextView)convertView.findViewById(R.id.employee_occupation);

            holder.ll_employee_comment=(LinearLayout)convertView.findViewById(R.id.employee_comment);
            holder.tv_employee_detail=(TextView)convertView.findViewById(R.id.employee_detail);
            holder.tv_employee_salary=(TextView)convertView.findViewById(R.id.employee_salary);

            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_employee_name.setText(lists.get(position).getEmployee_name());
        holder.tv_employee_occupation.setText(lists.get(position).getPosition());
        holder.tv_employee_work_date.setText(lists.get(position).getWork_date());
        holder.tv_employee_type.setText(lists.get(position).getType());
        holder.tv_employee_salary.setText(lists.get(position).getSalary()+"");
        holder.tv_employee_detail.setText(lists.get(position).getComment());

        if(lists.get(position).getType().equals("外请员工"))
        {
            holder.tv_employee_detail.setVisibility(View.VISIBLE);
        }
        else{
            holder.tv_employee_detail.setVisibility(View.GONE);
        }

        return convertView;
    }

    static class ViewHolder{
        TextView tv_employee_name;//姓名
        TextView tv_employee_occupation;//职位
        LinearLayout ll_employee_comment;//员工备注
        TextView tv_employee_detail;//员工备注详情
        TextView tv_employee_salary;//员工合计工资
        TextView tv_employee_type;//类别，主要为外请和内部
        TextView tv_employee_work_date;//工作时长
    }
}
