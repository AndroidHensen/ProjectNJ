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
 * 对应界面为：主界面-消息-办公信息
 */
public class MessageOfficeFragment extends BaseLazyFragment {
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
        Message message = new Message("工作申请", true, "申请标题：android开发工程师\n" +
                "内容概要：工作问题，工作问题\n" +
                "截至时间：2018年12月11日", "2017年11月10日", "查看详情");
        lists.add(message);
        Message message1 = new Message("工作申请", false, "申请标题：android开发工程师\n" +
                "内容概要：工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题，工作问题\n" +
                "截至时间：2018年12月11日", "2017年11月10日", "查看详情");
        lists.add(message1);
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
