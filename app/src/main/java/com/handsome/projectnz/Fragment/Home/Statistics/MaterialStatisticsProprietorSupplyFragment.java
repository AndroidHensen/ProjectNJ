package com.handsome.projectnz.Fragment.Home.Statistics;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialKeepAdapter;
import com.handsome.projectnz.Adapter.Home.MaterialHandling.MaterialOutputAdapter;
import com.handsome.projectnz.Module.Material;
import com.handsome.projectnz.R;
import com.handsome.projectnz.View.Home.MaterialHandling.MaterialStreamActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Diko(柯东煜) on 2018/1/14.
 * 对应界面为：主界面-工作台-物资管理-物资库存-甲供材
 */
public class MaterialStatisticsProprietorSupplyFragment extends BaseLazyFragment {
    private ListView lv;
    private MaterialKeepAdapter mAdapter;
    private List<Material> lists;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_message_content;
    }

    @Override
    public void initViews() {
        lv = findView(R.id.message_notice_lv);
        lists = new ArrayList<>();
        Material material=new Material();
        material.setName("水泥v1");
        material.setType("IVMS-4323");
        material.setDepartment("袋");
        material.setInputCount(80);
        material.setOutputCount(30);
        material.setKeepCount(50);
        material.setSource("业主供材");
        lists.add(material);
        Material material1=new Material();
        material1.setName("水泥v2");
        material1.setType("IVMS-4323");
        material1.setDepartment("袋");
        material1.setInputCount(100);
        material1.setOutputCount(30);
        material1.setKeepCount(70);
        material1.setSource("业主供材");
        lists.add(material1);

        Material material2=new Material();
        material2.setName("水泥v3");
        material2.setType("IVMS-4323");
        material2.setDepartment("袋");
        material2.setSource("业主供材");
        material2.setInputCount(100);
        material2.setOutputCount(30);
        material2.setKeepCount(70);
        lists.add(material2);

        mAdapter = new MaterialKeepAdapter(getActivity(), lists);
        lv.setAdapter(mAdapter);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), MaterialStreamActivity.class);
                i.putExtra("material",lists.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void processClick(View v) {

    }
}
