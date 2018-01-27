package com.handsome.projectnz.Fragment.Home.MaterialHandling;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialAdapter;
import com.handsome.projectnz.Adapter.MessageAdapter;
import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.Module.Message;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Diko(柯东煜) on 2018/1/14.
 * 对应界面为：主界面-工作台-物资管理-物资出库-初期物资
 */
public class MaterialOutputPrimeFragment extends BaseLazyFragment {
    private ListView lv;
    private MaterialAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_message_content;
    }

    @Override
    public void initViews() {
        lv = findView(R.id.message_notice_lv);
        List<Material> lists = new ArrayList<>();
        Material material=new Material();
        material.setName("电表v1");
        material.setType("IVMS-4323");
        material.setDepartment("台");
        material.setInputCount(80);
        material.setOutputCount(30);
        material.setKeepCount(50);
        lists.add(material);
        Material material1=new Material();
        material1.setName("电表v2");
        material1.setType("IVMS-4323");
        material1.setDepartment("台");
        material1.setInputCount(100);
        material1.setOutputCount(30);
        material1.setKeepCount(70);
        lists.add(material1);

        Material material2=new Material();
        material2.setName("电表v2");
        material2.setType("IVMS-4323");
        material2.setDepartment("台");
        material2.setInputCount(100);
        material2.setOutputCount(30);
        material2.setKeepCount(70);
        lists.add(material2);

        mAdapter = new MaterialAdapter(getActivity(), lists);
        lv.setAdapter(mAdapter);
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
