package com.project.stephencao.commonbaseadapter.adapter;

import android.content.Context;
import com.project.stephencao.commonbaseadapter.R;
import com.project.stephencao.commonbaseadapter.bean.Bean;
import com.project.stephencao.commonbaseadapter.util.CommonAdapter;
import com.project.stephencao.commonbaseadapter.util.ViewHolder;

import java.util.List;

public class MyAdvancedBaseAdapter extends CommonAdapter<Bean> {

    public MyAdvancedBaseAdapter(Context context, List<Bean> mData) {
        super(context, mData,R.layout.view_item);
    }

    @Override
    public void convert(ViewHolder viewHolder, Bean bean) {
        viewHolder.setText(R.id.id_title, bean.getTitle())
                .setText(R.id.id_description,bean.getDescription())
                .setText(R.id.id_date,bean.getDate())
                .setText(R.id.id_phone,bean.getPhone());
    }

}
