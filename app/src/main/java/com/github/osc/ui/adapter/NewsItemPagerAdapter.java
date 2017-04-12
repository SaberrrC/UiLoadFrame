package com.github.osc.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.github.osc.bean.NewsTitleBean;

import java.util.List;

public class NewsItemPagerAdapter extends PagerAdapter {


    private List<NewsTitleBean.ResultBean.ItemsBean> items;

    public NewsItemPagerAdapter(List<NewsTitleBean.ResultBean.ItemsBean> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
