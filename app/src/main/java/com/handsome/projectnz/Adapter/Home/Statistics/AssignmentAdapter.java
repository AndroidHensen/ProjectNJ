package com.handsome.projectnz.Adapter.Home.Statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.handsome.projectnz.Module.TaskRecord;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diko（柯东煜） on 2018/1/28.
 */

public class AssignmentAdapter extends BaseAdapter {
    private List<TaskRecord> lists = new ArrayList<TaskRecord>();
    private Context context;
    public  int showType = 0;//显示类型 ，默认为0，0的话显示执行者，1的话显示安排者
    static public int ARRANGE = 1;
    static public int EXECUTE = 0;

    public AssignmentAdapter(Context context, List<TaskRecord> lists) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_assignment, null, false);
            holder = new ViewHolder();
            holder.tv_assignment_type = (TextView) convertView.findViewById(R.id.assignment_type);
            holder.tv_assignment_object = (TextView) convertView.findViewById(R.id.assignment_object);
            holder.tv_assignment_sum = (TextView) convertView.findViewById(R.id.assignment_sum);
            holder.tv_assignment_finish = (TextView) convertView.findViewById(R.id.assignment_finish);

            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_assignment_sum.setText(lists.get(position).getTaskCount() + "");
        holder.tv_assignment_finish.setText(lists.get(position).getTaskFinish() + "");
        if (showType == EXECUTE) {
            holder.tv_assignment_type.setText("执行人：");
            holder.tv_assignment_object.setText(lists.get(position).getTaskExecute());

        } else {
            holder.tv_assignment_type.setText("安排人：");
            holder.tv_assignment_object.setText(lists.get(position).getTaskArranger());

        }

        return convertView;
    }

    static class ViewHolder {
        TextView tv_assignment_type;
        TextView tv_assignment_object;
        TextView tv_assignment_sum;
        TextView tv_assignment_finish;
    }
}
