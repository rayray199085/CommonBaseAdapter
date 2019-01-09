package com.project.stephencao.commonbaseadapter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import com.project.stephencao.commonbaseadapter.R;
import com.project.stephencao.commonbaseadapter.bean.Bean;
import com.project.stephencao.commonbaseadapter.util.CommonAdapter;
import com.project.stephencao.commonbaseadapter.util.ViewHolder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Bean> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.id_listview);
        initData();
        initEvent();
    }

    private void initEvent() {
        mListView.setAdapter(new CommonAdapter<Bean>(this,mData,R.layout.view_item) {
            @Override
            public void convert(ViewHolder viewHolder, final Bean bean) {
                viewHolder.setText(R.id.id_title, bean.getTitle())
                        .setText(R.id.id_description,bean.getDescription())
                        .setText(R.id.id_date,bean.getDate())
                        .setText(R.id.id_phone,bean.getPhone());
                final CheckBox cb = viewHolder.getView(R.id.id_cb);
                cb.setChecked(bean.isChecked()); // avoid when reusing view making chaos, like two check boxes are checked simultaneously
                cb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bean.setChecked(cb.isChecked());
                    }
                });
            }
        });
    }

    private void initData() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        for (int i = 0; i < 10; i++) {
            long timeMillis = System.currentTimeMillis();
            String format = simpleDateFormat.format(timeMillis);
            Bean bean = new Bean("title" + i, "description" + i, format, "1008" + i);
            mData.add(bean);
        }

    }
}
