package com.handsome.projectnz.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.projectnz.Module.ProjectDataFile;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 柯东煜 on 2018/1/25.
 */

public class ProjectDataFileView extends LinearLayout {
    private Context context;
    private View view;
    private LinearLayout ll_list;//上传的文件list
    private TextView tv_list_name;//文件清单名
    private TextView tv_select_file;//选择文件按钮
    private TextView tv_file_name;//选择的文件名
    private Button bn_upload;//上传

    private String listName;//文件清单名
    private List<ProjectDataFile> lists;

    public ProjectDataFileView(Context context) {
        this(context, null);
    }

    public ProjectDataFileView(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public ProjectDataFileView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_project_data_list, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
        lists=new ArrayList<ProjectDataFile>();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.ProjectDataFileView, def, 0);
        listName = ta.getString(R.styleable.ProjectDataFileView_list_name);

    }

    public void initViews() {
        tv_list_name = (TextView) findViewById(R.id.list_name);
        bn_upload = (Button) findViewById(R.id.upload);
        tv_select_file = (TextView) findViewById(R.id.select_file);
        tv_file_name=(TextView)findViewById(R.id.file_name);
        ll_list=(LinearLayout)findViewById(R.id.list) ;
        tv_list_name.setText(listName);
    }
    public void addFile(final ProjectDataFile pdf){
        lists.add(pdf);
        final LinearLayout childView=(LinearLayout)LayoutInflater.from(context).inflate(R.layout.view_project_data_list_child,null,false);
        TextView tv_delete_file=(TextView)childView.findViewById(R.id.delete_file);
        TextView tv_file_name=(TextView)childView.findViewById(R.id.file_name);
        tv_file_name.setText(pdf.getFileName());
        ll_list.addView(childView );
        tv_delete_file.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_list.removeView(childView);
                lists.remove(pdf);
            }
        });
    }

}
