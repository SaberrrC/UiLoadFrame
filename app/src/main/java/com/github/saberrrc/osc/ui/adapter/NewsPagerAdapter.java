package com.github.saberrrc.osc.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.github.saberrrc.osc.bean.FragmentInfo;

import java.util.ArrayList;
import java.util.List;

public class NewsPagerAdapter extends FragmentPagerAdapter {

    private List<FragmentInfo> mShowItems = new ArrayList<>();

    public NewsPagerAdapter(FragmentManager fm, List<FragmentInfo> showItems) {
        super(fm);
        mShowItems = showItems;
    }

    @Override
    public Fragment getItem(int position) {
        return mShowItems.get(position).mFragment;
    }

    @Override
    public int getCount() {
        return mShowItems.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mShowItems.get(position).mTitle;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }
}
