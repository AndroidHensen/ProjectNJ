package com.handsome.projectnz.View.Home;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseActivity;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/13.
 */

public class RegisterUnitActivity extends BaseActivity {

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
        et_belong_company = (EditText)findViewById(R.id.et_belong_company);
        et_write_credit = (EditText)findViewById(R.id.et_write_credit);
        ib_register_credit01 = (ImageButton)findViewById(R.id.ib_register_credit01);
        ib_register_credit02 = (ImageButton)findViewById(R.id.ib_register_credit02);
        bt_open_licence = (Button)findViewById(R.id.bt_open_licence);
        ib_allow_pic_01 = (ImageButton)findViewById(R.id.ib_allow_pic_01);
        ib_allow_pic_02 = (ImageButton)findViewById(R.id.ib_allow_pic_02);
        ib_allow_pic_03 = (ImageButton)findViewById(R.id.ib_allow_pic_03);
        ib_allow_pic_04 = (ImageButton)findViewById(R.id.ib_allow_pic_04);
        bt_credit_certification = (Button)findViewById(R.id.bt_credit_certification);
        ib_certification01 = (ImageButton)findViewById(R.id.ib_certification01);
        ib_certification02 = (ImageButton)findViewById(R.id.ib_certification02);
        ib_certification03 = (ImageButton)findViewById(R.id.ib_certification03);
        ib_certification04 = (ImageButton)findViewById(R.id.ib_certification04);
        bt_tax = (Button)findViewById(R.id.bt_tax);
        ib_tax_credit01 = (ImageButton)findViewById(R.id.ib_tax_credit01);
        ib_tax_credit02 = (ImageButton)findViewById(R.id.ib_tax_credit02);
        et_opening_bank = (EditText)findViewById(R.id.et_opening_bank);
        et_opening_bank = (EditText)findViewById(R.id.et_account);
        et_adress = (EditText)findViewById(R.id.et_adress);
        bt_certificate_pic = (Button)findViewById(R.id.bt_certificate_pic);
        ib_certificate_pic01 = (ImageButton)findViewById(R.id.ib_certificate_pic01);
        ib_certificate_pic02 = (ImageButton)findViewById(R.id.ib_certificate_pic02);
        ib_certificate_pic03 = (ImageButton)findViewById(R.id.ib_certificate_pic03);
        ib_certificate_pic04 = (ImageButton)findViewById(R.id.ib_certificate_pic04);
        et_phone = (EditText)findViewById(R.id.et_phone);
        et_official_website = (EditText)findViewById(R.id.et_official_website);
        et_email = (EditText)findViewById(R.id.et_email);
        et_area = (EditText)findViewById(R.id.et_area);
        et_item_classification = (EditText)findViewById(R.id.et_item_classification);
        bt_Submit = (Button)findViewById(R.id.bt_Submit);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        setTitle("注册");
        setTitleCanBack();
    }

    @Override
    public void processClick(View v) {

    }
}
