package com.handsome.projectnz.Fragment;

import android.view.View;
import android.widget.ListView;

import com.handsome.module_engine.E.BaseTemplate.BaseLazyFragment;
import com.handsome.projectnz.Adapter.MessageAdapter;
import com.handsome.projectnz.Module.Message;
import com.handsome.projectnz.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Diko(柯东煜) on 2018/1/14.
 * 对应界面为：主界面-消息-任务信息
 */
public class MessageAssignmentFragment extends BaseLazyFragment {
    private ListView lv;
    private MessageAdapter mAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_message_content;
    }

    @Override
    public void initViews() {
        lv = findView(R.id.message_notice_lv);

        List<Message> lists = new ArrayList<>();
        Message message = new Message("你有一个新任务", true, "项目名称：1028工程\n任务名称：android开发\n截至时间：2018年12月11日", "2017年11月10日", "编制计划");
        lists.add(message);
        Message message1 = new Message("你有一个新任务", false, "项目名称：1028工程\n" +
                "任务名称：android开发\n" +
                "主要工作：\n" +
                "1.完成所有界面开发\n" +
                "2.完成所有模块开发\n" +
                "3.测试所有功能\n" +
                "截至时间：2018年12月11日", "2017年11月10日", "编制计划");
        lists.add(message1);
        Message message2 = new Message("你有一个新任务", true, "项目名称：1028工程\n任务名称：android开发\n截至时间：2018年12月11日", "2017年11月10日", "编制计划");
        lists.add(message2);
        Message message3 = new Message("你有一个新任务", false, "项目名称：1028工程\n任务名称：android开发\n截至时间：2018年12月11日", "2017年11月10日", "编制计划");
        lists.add(message3);
        mAdapter = new MessageAdapter(getActivity(), lists);
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
