package com.handsome.projectnz.Fragment.Main;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.CustomView.WorkbenchContent;
import com.handsome.projectnz.Module.DailyCheck;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.DailyCheck.DailyCheckActivity;
import com.handsome.projectnz.View.Home.Login.LoginActivity;
import com.handsome.projectnz.View.Home.MaterialHandling.MaterialOutputRecordActivity;
import com.handsome.projectnz.View.Home.MaterialHandling.StockKeepActivity;
import com.handsome.projectnz.View.Home.PlanProgress.PlanProgressActivity;
import com.handsome.projectnz.View.Home.QualityCheck.QualityCheckActivity;
import com.handsome.projectnz.View.Home.Register.RegisterActivity;
import com.handsome.projectnz.View.Home.SecurityCheck.SecurityCheckActivity;
import com.handsome.projectnz.View.Home.Statistics.AssignmentStatisticsActivity;
import com.handsome.projectnz.View.Home.Statistics.InfoStatisticsActivity;
import com.handsome.projectnz.View.Home.Statistics.MaterialStatisticsActivity;

/**
 * Created by handsome on 2016/4/7.
 */
public class HomeFragment extends BaseLazyFragment {
    private WorkbenchContent iv_company_announcements;//公司公告
    private WorkbenchContent iv_working_task;//工作任务
    private WorkbenchContent iv_work_report;//工作汇报
    private WorkbenchContent iv_general_settings;//通用申请
    private ImageView iv_detailed_list;//清单
    private ImageView iv_progress_plan;//进度计划
    private ImageView tv_security_check;//安全检查
    private ImageView iv_quality_inspection;//质量检查
    private ImageView iv_record_workpoints;//签到记工
    private ImageView iv_completion_test;//完工验收
    private ImageView iv_materials;//物资
    private ImageView iv_statistics_task;//任务统计
    private ImageView iv_hard_statistics;//用工统计
    private ImageView iv_material_statistics;//物资统计
    private ImageView iv_data_statistics;//资料统计
    private ImageView iv_daily_check;//资料统计
    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initViews() {
        iv_company_announcements = findView(R.id.iv_company_announcements);
        iv_daily_check = findView(R.id.iv_daily_check);
        iv_working_task = findView(R.id.iv_working_task);
        iv_work_report = findView(R.id.iv_work_report);
        iv_general_settings = findView(R.id.iv_general_settings);
        iv_detailed_list = findView(R.id.iv_detailed_list);
        iv_progress_plan = findView(R.id.iv_progress_plan);
        tv_security_check = findView(R.id.tv_security_check);
        iv_record_workpoints = findView(R.id.iv_record_workpoints);
        iv_quality_inspection = findView(R.id.iv_quality_inspection);
        iv_completion_test = findView(R.id.iv_completion_test);
        iv_materials = findView(R.id.iv_materials);
        iv_statistics_task = findView(R.id.iv_statistics_task);
        iv_hard_statistics = findView(R.id.iv_hard_statistics);
        iv_material_statistics = findView(R.id.iv_material_statistics);
        iv_data_statistics = findView(R.id.iv_data_statistics);

    }

    @Override
    public void initListener() {
        iv_daily_check.setOnClickListener(this);
        iv_data_statistics.setOnClickListener(this);
        iv_material_statistics.setOnClickListener(this);
        iv_hard_statistics.setOnClickListener(this);
        iv_statistics_task.setOnClickListener(this);
        iv_completion_test.setOnClickListener(this);
        iv_quality_inspection.setOnClickListener(this);
        tv_security_check.setOnClickListener(this);
        iv_progress_plan.setOnClickListener(this);
    }

    @Override
    public void initData() {
        setTitle("工作台");
        setEdit("登陆");
        setEdit2("注册");
    }

    @Override
    public void processClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.tv_edit://登陆
                i=new Intent(getActivity(), LoginActivity.class);
                startActivity(i);
                break;
            case R.id.tv_edit2://注册
                i=new Intent(getActivity(), RegisterActivity.class);
                startActivity(i);
                break;
            case R.id.iv_data_statistics:
                i=new Intent(getActivity(), InfoStatisticsActivity.class);
                startActivity(i);
                break;
            case R.id.iv_material_statistics:
                i=new Intent(getActivity(), MaterialStatisticsActivity.class);
                startActivity(i);
                break;
            case R.id.iv_hard_statistics:
                i=new Intent(getActivity(), StockKeepActivity.class);
                startActivity(i);
                break;
            case R.id.iv_statistics_task:
                i=new Intent(getActivity(), AssignmentStatisticsActivity.class);
                startActivity(i);
                break;
            case R.id.iv_completion_test:
                i=new Intent(getActivity(), MaterialOutputRecordActivity.class);
                startActivity(i);
                break;
            case R.id.iv_daily_check:
                i=new Intent(getActivity(), DailyCheckActivity.class);
                startActivity(i);
                break;
            case R.id.iv_quality_inspection:
                i=new Intent(getActivity(), QualityCheckActivity.class);
                startActivity(i);
                break;
            case R.id.tv_security_check:
                i=new Intent(getActivity(), SecurityCheckActivity.class);
                startActivity(i);
                break;
            case R.id.iv_progress_plan:
                i=new Intent(getActivity(),PlanProgressActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
