package com.handsome.projectnz.Adapter.Home.Announcements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handsome.module_engine.E.BaseRecyclerAdapter.BaseRecyclerAdapter;
import com.handsome.module_engine.E.BaseRecyclerAdapter.ViewHolder;
import com.handsome.projectnz.R;

import java.util.List;

/**
 * Created by jie on 2018/1/17.
 */

public class AnnouncementsDetailAdapter extends BaseRecyclerAdapter<Integer> {


    public AnnouncementsDetailAdapter(Context context, List list, int layoutId) {
        super(context, list, layoutId);
        this.context = context;
        this.list=list;
        this.layoutId=layoutId;
    }

    @Override
    public void convert(ViewHolder viewHolder, Integer item) {
        viewHolder.getView(R.id.ib_announcements_photos).setBackgroundResource(item);
    }
}
