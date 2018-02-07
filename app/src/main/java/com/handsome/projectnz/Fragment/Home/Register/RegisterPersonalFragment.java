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

public class RegisterPersonalFragment extends BaseLazyFragment {
    private EditText et_name;//姓名
    private EditText et_id_card;//身份证
    private ImageButton ib_id_card01;//身份证之正本
    private ImageButton ib_id_card02;//身份证之副本
    private EditText et_personl_phone;//手机号码
    private EditText et_personl_email;//邮箱
    private EditText et_personl_util_name;//单位全程
    private Button bt_department;//部门
    private Button bt_position;//职位
    private EditText et_job_number;//工号
    private Button bt_personal_photo;//上传资质照片按钮
    private ImageButton ib_personal_photo01;//上传图片一
    private ImageButton ib_personal_photo02;//上传图片二
    private ImageButton ib_personal_photo03;//上传图片三
    private ImageButton ib_personal_photo04;//上传图片四
    private Button bt_personal_Submit;//提交审核
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
