package com.project.stephencao.commonbaseadapter.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.project.stephencao.commonbaseadapter.R;

import java.util.List;

public abstract class CommonAdapter<T> extends BaseAdapter {
    protected List<T> mData;
    protected LayoutInflater mInflater;
    protected Context mContext;
    protected int mLayoutId;

    public CommonAdapter(Context context, List<T> mData,int mLayoutId) {
        this.mData = mData;
        this.mContext = context;
        this.mLayoutId = mLayoutId;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder = ViewHolder.get(mContext,
                convertView, position, mLayoutId, parent);
        convert(viewHolder,getItem(position));
        return viewHolder.getConvertView();
    }
    public abstract void convert(ViewHolder viewHolder,T t);
}
