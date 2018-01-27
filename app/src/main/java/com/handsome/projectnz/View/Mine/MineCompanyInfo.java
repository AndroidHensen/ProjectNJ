package com.handsome.projectnz.View.Mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

public class MineCompanyInfo extends BaseActivity {
    private TextView tv_company_name;//单位名称
    private TextView tv_company_up;//所属上级公司
    private TextView tv_company_id;//社会统一信用号
    private TextView tv_company_id_one;//营业执照正本
    private TextView tv_company_id_two;//营业执照副本
    private ImageView iv_company_admit_1;//许可证1
    private ImageView iv_company_admit_2;//许可证2
    private ImageView iv_company_admit_3;//许可证3
    private ImageView iv_company_admit_4;//许可证4
    private ImageView iv_company_aptitude_1;//资质证明照片1
    private ImageView iv_company_aptitude_2;//资质证明照片2
    private ImageView iv_company_aptitude_3;//资质证明照片3
    private ImageView iv_company_aptitude_4;//资质证明照片4
    private ImageView iv_company_tax_1;//上一年度完税证明照片1
    private ImageView iv_company_tax_2;//上一年度完税证明照片2
    private TextView tv_company_bank;//公司开户行
    private TextView tv_company_bank_num;//公司账号
    private TextView tv_company_address;//公司地址
    private ImageView iv_company_certification_1;//资质证书照片1
    private ImageView iv_company_certification_2;//资质证书照片2
    private ImageView iv_company_certification_3;//资质证书照片3
    private ImageView iv_company_certification_4;//资质证书照片4
    private TextView tv_company_web;//公司网站
    private TextView tv_company_cell;//公司联系电话
    private TextView tv_company_email;//公司邮箱
    private TextView tv_company_type;//公司可参与工程类型

    private TextView tv_company_employee;//人员库
    private TextView tv_company_cars;//车辆库
    private TextView tv_company_tools;//器械库

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_company_info;
    }

    @Override
    public void initViews() {
        tv_company_name = findView(R.id.company_name);
        tv_company_up = findView(R.id.company_up);
        tv_company_id = findView(R.id.company_id);
        tv_company_id_one = findView(R.id.company_id_one);
        tv_company_id_two = findView(R.id.company_id_two);
        iv_company_admit_1 =findView(R.id.company_admit_picture_1);
        iv_company_admit_2 =findView(R.id.company_admit_picture_2);
        iv_company_admit_3 =findView(R.id.company_admit_picture_3);
        iv_company_admit_4 =findView(R.id.company_admit_picture_4);
        iv_company_aptitude_1=findView(R.id.company_qualification_picture_1);
        iv_company_aptitude_2=findView(R.id.company_qualification_picture_2);
        iv_company_aptitude_3=findView(R.id.company_qualification_picture_3);
        iv_company_aptitude_4=findView(R.id.company_qualification_picture_4);
        iv_company_tax_1=findView(R.id.company_tax_1);
        iv_company_tax_2=findView(R.id.company_tax_2);
        tv_company_bank=findView(R.id.company_bank);
        tv_company_bank_num=findView(R.id.company_bank_num);
        tv_company_address=findView(R.id.company_address);
        iv_company_certification_1=findView(R.id.company_qualification_1);
        iv_company_certification_2=findView(R.id.company_qualification_2);
        iv_company_certification_3=findView(R.id.company_qualification_3);
        iv_company_certification_4=findView(R.id.company_qualification_4);
        tv_company_web=findView(R.id.company_web);
        tv_company_cell=findView(R.id.company_cell);
        tv_company_email=findView(R.id.company_email);
        tv_company_type=findView(R.id.company_type);
        tv_company_employee=findView(R.id.company_employee);
        tv_company_cars=findView(R.id.company_cars);
        tv_company_tools=findView(R.id.company_tools);

    }

    @Override
    public void initListener() {
        setOnClick(tv_company_employee);
    }

    @Override
    public void initData() {
        setTitle("公司资料");
        setEdit2("修改");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {
        Intent i=new Intent();
        switch (v.getId()){
            case R.id.company_employee:
                i.setClass(this,MineCompanyInfoEmployee.class);
                startActivity(i);
                break;
            case R.id.tv_edit2:
                i.setClass(this,MineCompanyInfoCorrect.class);
                startActivity(i);
                break;
        }
    }
}
