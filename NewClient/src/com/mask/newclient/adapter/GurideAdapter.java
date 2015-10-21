package com.mask.newclient.adapter;

import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2015/9/23.
 */
public class GurideAdapter extends PagerAdapter{

    private List<View> viewList;
    private Context context;
    public GurideAdapter(List<View> viewList, Context context) {
        this.viewList = viewList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ((ViewPager)container).addView(viewList.get(position));

        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView(viewList.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

}
