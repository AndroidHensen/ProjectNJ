package com.handsome.projectnz.Fragment.Home.Register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/15.
 */

public class RegisterUnitFragment extends BaseLazyFragment {

    private EditText et_unit_name;//单位名称
    private EditText et_belong_company;//所属上级公司
    private EditText et_write_credit;//社会统一信用号
    private ImageButton ib_register_credit01;//社会统一信用号 正本
    private ImageButton ib_register_credit02;//社会统一信用号 副本
    private Button bt_open_licence;//开户许可证上传图片按钮
    private ImageButton ib_allow_pic_01;//上传开户许可证图片一
    private ImageButton ib_allow_pic_02;//上传开户许可证图片二
    private ImageButton ib_allow_pic_03;//上传开户许可证图片三
    private ImageButton ib_allow_pic_04;//上床开户许可证图片四
    private Button bt_credit_certification;//资信证明按上传图片钮
    private ImageButton ib_certification01;//上传资信证明图片一
    private ImageButton ib_certification02;//上传资信证明图片二
    private ImageButton ib_certification03;//上传资信证明图片三
    private ImageButton ib_certification04;//上传资信证明图片四
    private Button bt_tax;//上传完税证明按钮
    private ImageButton ib_tax_credit01;//上传完税证明照片一
    private ImageButton ib_tax_credit02;//上传完税证明照片二
    private EditText et_opening_bank;//开户行
    private EditText et_account;//账号
    private EditText et_adress;//地址
    private Button bt_certificate_pic;//资质证书照按钮
    private ImageButton ib_certificate_pic01;//上传证书照一
    private ImageButton ib_certificate_pic02;//上传证书照二
    private ImageButton ib_certificate_pic03;//上传证书照三
    private ImageButton ib_certificate_pic04;//上传证书照四
    private EditText et_official_website;//公司官网
    private EditText et_phone;//联系电话
    private EditText et_email;//eamil
    private EditText et_area;//经营区域
    private EditText et_item_classification;//可参与项目类型
    private Button bt_Submit;//提交
    @Override
    public int getLayoutId() {
        return R.layout.activity_register_unit;
    }

    @Override
    public void initViews() {
        et_unit_name = findView(R.id.et_unit_name);
        et_belong_company = findView(R.id.et_belong_company);
        et_write_credit = findView(R.id.et_write_credit);
        ib_register_credit01 = findView(R.id.ib_register_credit01);
        ib_register_credit02 = findView(R.id.ib_register_credit02);
        bt_open_licence = findView(R.id.bt_open_licence);
        ib_allow_pic_01 = findView(R.id.ib_allow_pic_01);
        ib_allow_pic_02 = findView(R.id.ib_allow_pic_02);
        ib_allow_pic_03 = findView(R.id.ib_allow_pic_03);
        ib_allow_pic_04 = findView(R.id.ib_allow_pic_04);
        bt_credit_certification = findView(R.id.bt_credit_certification);
        ib_certification01 =findView(R.id.ib_certification01);
        ib_certification02 = findView(R.id.ib_certification02);
        ib_certification03 = findView(R.id.ib_certification03);
        ib_certification04 = findView(R.id.ib_certification04);
        bt_tax = findView(R.id.bt_tax);
        ib_tax_credit01 = findView(R.id.ib_tax_credit01);
        ib_tax_credit02 = findView(R.id.ib_tax_credit02);
        et_opening_bank = findView(R.id.et_opening_bank);
        et_opening_bank = findView(R.id.et_account);
        et_adress = findView(R.id.et_adress);
        bt_certificate_pic = findView(R.id.bt_certificate_pic);
        ib_certificate_pic01 = findView(R.id.ib_certificate_pic01);
        ib_certificate_pic02 = findView(R.id.ib_certificate_pic02);
        ib_certificate_pic03 = findView(R.id.ib_certificate_pic03);
        ib_certificate_pic04 = findView(R.id.ib_certificate_pic04);
        et_phone = findView(R.id.et_phone);
        et_official_website = findView(R.id.et_official_website);
        et_email = findView(R.id.et_email);
        et_area = findView(R.id.et_area);
        et_item_classification = findView(R.id.et_item_classification);
        bt_Submit = findView(R.id.bt_Submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void processClick(View v) {

    }
}
