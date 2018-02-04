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
import com.handsome.projectnz.Module.Project;
import com.handsome.projectnz.Module.ProjectDataFile;

import java.util.ArrayList;
import java.util.List;
import com.handsome.projectnz.R;

/**
 * Created by 柯东煜 on 2018/1/26.
 */

public class ProjectDataDownloadView extends LinearLayout{
    private Context context;
    private View view;

    private TextView tv_list_name;//文件清单名称
    private Button bn_list_download;//下载
    private Button bn_list_look;//查看按钮
    private LinearLayout ll_files;//子文件列表

    private String listName;//文件清单名
    private Boolean listVisible;//文件清单是否可见
    private List<ProjectDataFile> lists;
    private FileOperation fileOperation=new FileOperation() {
        @Override
        public void download(ProjectDataFile pdf) {

        }

        @Override
        public void look(ProjectDataFile pdf) {

        }
    };//子文件操作

    public ProjectDataDownloadView(Context context) {
        this(context, null);
    }

    public ProjectDataDownloadView(Context context, AttributeSet as) {
        this(context, as, 0);
    }

    public ProjectDataDownloadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        view = LayoutInflater.from(context).inflate(R.layout.view_project_data_download, this, true);
        if (attrs != null)
            initAttrs(context, attrs, defStyleAttr);
        initViews();
        lists=new ArrayList<ProjectDataFile>();
    }

    public void initAttrs(Context context, AttributeSet as, int def) {
        TypedArray ta = context.obtainStyledAttributes(as, R.styleable.ProjectDataDownloadView, def, 0);
        listVisible=ta.getBoolean(R.styleable.ProjectDataDownloadView_files_list_visible,false);
        listName = ta.getString(R.styleable.ProjectDataDownloadView_files_list_name);
    }

    public void initViews() {
        tv_list_name = (TextView) findViewById(R.id.list_name);
        bn_list_download = (Button) findViewById(R.id.list_download);
        bn_list_look=(Button) findViewById(R.id.list_look);
        ll_files=(LinearLayout)findViewById(R.id.list);
        tv_list_name.setText(listName);
        if(listVisible){
            bn_list_look.setText("隐藏");
            ll_files.setVisibility(VISIBLE);
        }
        else{
            ll_files.setVisibility(GONE);
            bn_list_look.setText("查看");
        }
        bn_list_look.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listVisible){
                    listVisible=!listVisible;
                    ll_files.setVisibility(GONE);
                    bn_list_look.setText("查看");
                }
                else{
                    listVisible=!listVisible;
                    bn_list_look.setText("隐藏");
                    ll_files.setVisibility(VISIBLE);
                }
            }
        });
    }
    public void setFlieList(List<ProjectDataFile> lists){
        this.lists=lists;
        for(final ProjectDataFile file:lists){
            final LinearLayout childView=(LinearLayout)LayoutInflater.from(context).inflate(R.layout.view_project_data_download_child,null,false);
            TextView tv_file_name=(TextView)childView.findViewById(R.id.file_name);
            Button bn_file_download=(Button)childView.findViewById(R.id.file_download);
            Button bn_file_look=(Button)childView.findViewById(R.id.file_look);
            tv_file_name.setText(file.getFileName());
            bn_file_download.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    fileOperation.download(file);
                }
            });
            bn_file_look.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    fileOperation.look(file);
                }
            });
            ll_files.addView(childView);
        }

    }
    public void setFileOperation(FileOperation fo){
        this.fileOperation=fo;
    }
    public interface FileOperation{
        public void download(ProjectDataFile pdf);
        public void look(ProjectDataFile pdf);
    }
}
