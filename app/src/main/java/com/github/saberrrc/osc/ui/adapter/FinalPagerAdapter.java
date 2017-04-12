package com.github.saberrrc.osc.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FinalPagerAdapter<T> extends PagerAdapter {

    private List<T> mShowItems = new ArrayList<>();
    private OnPagerCreateListener mOnPagerCreateListener;

    public FinalPagerAdapter(List<T> showItems, OnPagerCreateListener onPagerCreateListener) {
        mShowItems = showItems;
        mOnPagerCreateListener = onPagerCreateListener;
    }

    public interface OnPagerCreateListener {
        View OnPagerCreate(ViewGroup container, int position);
    }

    @Override
    public int getCount() {
        return mShowItems.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = mOnPagerCreateListener.OnPagerCreate(container, position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
