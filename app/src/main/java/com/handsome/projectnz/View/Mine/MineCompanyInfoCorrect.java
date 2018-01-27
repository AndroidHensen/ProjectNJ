package com.handsome.projectnz.View.Mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.CustomView.PictureView;
import com.handsome.projectnz.R;

public class MineCompanyInfoCorrect extends BaseActivity {
    private EditText et_company_name;//单位名称
    private EditText et_company_up;//所属上级公司
    private EditText et_company_id;//社会统一信用号
    private TextView et_company_id_one;//营业执照正本
    private TextView et_company_id_two;//营业执照副本
    private PictureView pv_company_admit_1;//许可证1
    private PictureView pv_company_admit_2;//许可证2
    private PictureView pv_company_admit_3;//许可证3
    private PictureView pv_company_admit_4;//许可证4
    private PictureView pv_company_aptitude_1;//资质证明照片1
    private PictureView pv_company_aptitude_2;//资质证明照片2
    private PictureView pv_company_aptitude_3;//资质证明照片3
    private PictureView pv_company_aptitude_4;//资质证明照片4
    private PictureView pv_company_tax_1;//上一年度完税证明照片1
    private PictureView pv_company_tax_2;//上一年度完税证明照片2
    private EditText et_company_bank;//公司开户行
    private EditText et_company_bank_num;//公司账号
    private EditText et_company_address;//公司地址
    private PictureView pv_company_certification_1;//资质证书照片1
    private PictureView pv_company_certification_2;//资质证书照片2
    private PictureView pv_company_certification_3;//资质证书照片3
    private PictureView pv_company_certification_4;//资质证书照片4
    private EditText et_company_web;//公司网站
    private EditText et_company_cell;//公司联系电话
    private EditText et_company_email;//公司邮箱
    private EditText et_company_type;//公司可参与工程类型
    private Button bn_certian;//提交审核
    private Button bn_company_certification_upload;//上传资质证书照片
    private Button bn_company_tax_upload;//上传完税证明
    private Button bn_company_admit_upload;//上传许可证
    private Button bn_company_aptitude_upload;//上传资质证明



    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_company_info_correct;
    }

    @Override
    public void initViews() {
        et_company_name = findView(R.id.company_name);
        et_company_up = findView(R.id.company_up);
        et_company_id = findView(R.id.company_id);
        et_company_id_one = findView(R.id.company_id_one);
        et_company_id_two = findView(R.id.company_id_two);
        pv_company_admit_1 =findView(R.id.company_admit_picture_1);
        pv_company_admit_2 =findView(R.id.company_admit_picture_2);
        pv_company_admit_3 =findView(R.id.company_admit_picture_3);
        pv_company_admit_4 =findView(R.id.company_admit_picture_4);
        pv_company_aptitude_1=findView(R.id.company_qualification_picture_1);
        pv_company_aptitude_2=findView(R.id.company_qualification_picture_2);
        pv_company_aptitude_3=findView(R.id.company_qualification_picture_3);
        pv_company_aptitude_4=findView(R.id.company_qualification_picture_4);
        pv_company_tax_1=findView(R.id.company_tax_1);
        pv_company_tax_2=findView(R.id.company_tax_2);
        et_company_bank=findView(R.id.company_bank);
        et_company_bank_num=findView(R.id.company_bank_num);
        et_company_address=findView(R.id.company_address);
        pv_company_certification_1=findView(R.id.company_qualification_1);
        pv_company_certification_2=findView(R.id.company_qualification_2);
        pv_company_certification_3=findView(R.id.company_qualification_3);
        pv_company_certification_4=findView(R.id.company_qualification_4);
        et_company_web=findView(R.id.company_web);
        et_company_cell=findView(R.id.company_cell);
        et_company_email=findView(R.id.company_email);
        et_company_type=findView(R.id.company_type);
        bn_certian=findView(R.id.certain);
        bn_company_admit_upload=findView(R.id.company_admit_picture_upload);
        bn_company_tax_upload=findView(R.id.company_tax_upload);
        bn_company_aptitude_upload=findView(R.id.company_qualification_picture_upload);
        bn_company_certification_upload=findView(R.id.company_qualification_upload);

    }

    @Override
    public void initListener() {
        setOnClick(bn_certian);
    }

    @Override
    public void initData() {
        setTitle("修改公司资料");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {
    }
}
