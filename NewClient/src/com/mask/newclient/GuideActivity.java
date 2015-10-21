package com.mask.newclient;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mask.newclient.adapter.GurideAdapter;
import com.mask.newclient.common.UIHelperUtils;


/**
 * 引导页
 * Created by Administrator on 2015/9/21.
 */
public class GuideActivity extends Activity {

    private ViewPager viewPager;

    private List<View> viewList;
    private GurideAdapter adapter;
    private Context context;
    private TextView tv_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initView();
        context =this;
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        LayoutInflater inflater =LayoutInflater.from(this);
        viewList = new ArrayList<View>();
        viewList.add(inflater.inflate(R.layout.activity_guide1,null));
        viewList.add(inflater.inflate(R.layout.activity_guide2,null));
        viewList.add(inflater.inflate(R.layout.activity_guide3,null));
        viewList.add(inflater.inflate(R.layout.activity_guide4, null));
        //前往主页
        tv_login= (TextView) viewList.get(3).findViewById(R.id.tv_login);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelperUtils.toMainActivity(context);
                finish();
            }
        });
        adapter =new GurideAdapter(viewList,this);
        viewPager.setAdapter(adapter);
    }
}
