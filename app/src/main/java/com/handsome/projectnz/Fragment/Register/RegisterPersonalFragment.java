package com.handsome.projectnz.Fragment.Register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.R;

/**
 * Created by jie on 2018/1/15.
 */

public class RegisterPersonalFragment extends BaseLazyFragment {
    private EditText et_name;
    private EditText et_id_card;
    private ImageButton ib_id_card01;
    private ImageButton ib_id_card02;
    private EditText et_personl_phone;
    private EditText et_personl_email;
    private EditText et_personl_util_name;
    private Button bt_department;
    private Button bt_position;
    private EditText et_job_number;
    private Button bt_personal_photo;
    private ImageButton ib_personal_photo01;
    private ImageButton ib_personal_photo02;
    private ImageButton ib_personal_photo03;
    private ImageButton ib_personal_photo04;
    private Button bt_personal_Submit;
    @Override
    public int getLayoutId() {
        return R.layout.activity_register_personal;
    }

    @Override
    public void initViews() {
        et_name=  findView(R.id.et_name);
        et_id_card=  findView(R.id.et_id_card);
        ib_id_card01=  findView(R.id.ib_id_card01);
        ib_id_card02=  findView(R.id.ib_id_card02);
        et_personl_phone=  findView(R.id.et_personl_phone);
        et_personl_email= findView(R.id.et_personl_email);
        et_personl_util_name=  findView(R.id.et_personl_util_name);
        bt_department=  findView(R.id.bt_department);
        bt_position= findView(R.id.bt_position);
        et_job_number=  findView(R.id.et_job_number);
        bt_personal_photo=  findView(R.id.bt_personal_photo);
        ib_personal_photo01=  findView(R.id.ib_personal_photo01);
        ib_personal_photo02= findView(R.id.ib_personal_photo02);
        ib_personal_photo03=  findView(R.id.ib_personal_photo03);
        ib_personal_photo04=  findView(R.id.ib_personal_photo04);
        bt_personal_Submit= findView(R.id.bt_personal_Submit);
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
