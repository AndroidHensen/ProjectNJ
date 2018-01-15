package com.handsome.projectnz.Fragment;

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

    private EditText et_unit_name;
    private EditText et_belong_company;
    private EditText et_write_credit;
    private ImageButton ib_register_credit01;
    private ImageButton ib_register_credit02;
    private Button bt_open_licence;
    private ImageButton ib_allow_pic_01;
    private ImageButton ib_allow_pic_02;
    private ImageButton ib_allow_pic_03;
    private ImageButton ib_allow_pic_04;
    private Button bt_credit_certification;
    private ImageButton ib_certification01;
    private ImageButton ib_certification02;
    private ImageButton ib_certification03;
    private ImageButton ib_certification04;
    private Button bt_tax;
    private ImageButton ib_tax_credit01;
    private ImageButton ib_tax_credit02;
    private EditText et_opening_bank;
    private EditText et_account;
    private EditText et_adress;
    private Button bt_certificate_pic;
    private ImageButton ib_certificate_pic01;
    private ImageButton ib_certificate_pic02;
    private ImageButton ib_certificate_pic03;
    private ImageButton ib_certificate_pic04;
    private EditText et_official_website;
    private EditText et_phone;
    private EditText et_email;
    private EditText et_area;
    private EditText et_item_classification;
    private Button bt_Submit;
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
