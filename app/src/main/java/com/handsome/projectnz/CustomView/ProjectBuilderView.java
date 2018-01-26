package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.Module.Employee;
import com.handsome.projectnz.Module.ProjectDataFile;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class ProjectBuilderView extends LinearLayout{
    private Context context;
    private View view;

    private TextView tv_builder_name;//参建者清单
    private TextView tv_builder_add;//添加参加者
    private LinearLayout ll_builders;//参建者列表
    private LinearLayout ll_builder_bar;

    private String builderName;//文件清单名
    private Boolean buildersVisible;//文件清单是否可见
    private List<Employee> lists;

    public ProjectBuilderView(Context context) {
        this(context, null);
    }

    public ProjectBuilderView(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public ProjectBuilderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_project_builder, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
        lists=new ArrayList<Employee>();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.ProjectBuilderView, def, 0);
        builderName = ta.getString(R.styleable.ProjectBuilderView_builder_name);
        buildersVisible=ta.getBoolean(R.styleable.ProjectBuilderView_builders_visible,true);
    }

    public void initViews() {
        tv_builder_name = (TextView) findViewById(R.id.builder_name);
        tv_builder_add = (TextView) findViewById(R.id.builder_add);
        ll_builders=(LinearLayout)findViewById(R.id.builder_list);
        ll_builder_bar=(LinearLayout)findViewById(R.id.builder_bar);
        tv_builder_name.setText(builderName);
        if(!buildersVisible){
            ll_builders.setVisibility(GONE);
        }
        ll_builder_bar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buildersVisible){
                    buildersVisible=!buildersVisible;
                    ll_builders.setVisibility(GONE);
                }
                else{
                    buildersVisible=!buildersVisible;
                    ll_builders.setVisibility(VISIBLE);
                }
            }
        });

    }
    public void addBuidler(final Employee employee){
        lists.add(employee);
        final LinearLayout childView=(LinearLayout)LayoutInflater.from(context).inflate(R.layout.adapter_mine_company_info_employee,null,false);
        TextView tv_employee_name=(TextView)childView.findViewById(R.id.employee_name);
        TextView tv_employee_position=(TextView)childView.findViewById(R.id.employee_position);
        TextView tv_employee_phone=(TextView)childView.findViewById(R.id.employee_phone);
        TextView tv_employee_email=(TextView)childView.findViewById(R.id.employee_e_mail);
        TextView tv_employee_company=(TextView)childView.findViewById(R.id.employee_company);
        TextView tv_employee_department=(TextView)childView.findViewById(R.id.employee_department);
        TextView tv_employee_comment=(TextView)childView.findViewById(R.id.employee_comment);
        ll_builders.addView(childView);
        tv_employee_name.setText(employee.getEmployee_name());
        tv_employee_position.setText(employee.getPosition());
        tv_employee_phone.setText(employee.getPhone());
        tv_employee_email.setText(employee.getE_mail());
        tv_employee_company.setText(employee.getCompany());
        tv_employee_department.setText(employee.getDepartment());
        tv_employee_comment.setText(employee.getComment());
    }
}
