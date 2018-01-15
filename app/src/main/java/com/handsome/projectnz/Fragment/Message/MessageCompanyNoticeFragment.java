package com.handsome.projectnz.Fragment.Message;

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
 * 对应界面为：主界面-消息-公司公告
 */
public class MessageCompanyNoticeFragment extends BaseLazyFragment {
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
        Message message = new Message("公告标题", false, "内容。。。。", "2017年11月10日", "查看详情");
        lists.add(message);
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
