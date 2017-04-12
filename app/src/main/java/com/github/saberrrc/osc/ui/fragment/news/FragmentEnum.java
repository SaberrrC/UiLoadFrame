package com.github.saberrrc.osc.ui.fragment.news;

import android.os.Bundle;

import com.github.saberrrc.osc.R;
import com.github.saberrrc.osc.ui.fragment.NewsFragment;

public enum FragmentEnum {

    NewsFragment1(NewsFragment.class, "tag1", "综合", R.drawable.selector_all_bg),
    NewsFragment2(NewsFragment.class, "tag2", "动弹", R.drawable.selector_dongtan_bg),
    NewsFragment3(NewsFragment.class, "tag3", "", R.drawable.selector_add_bg),
    NewsFragment4(NewsFragment.class, "tag4", "发现", R.drawable.selector_find_bg),
    NewsFragment5(NewsFragment.class, "tag5", "我的", R.drawable.selector_mine_bg);

    public String mTag;
    public String mTitle;
    public int    id;
    public Bundle mBundle;
    public Class  mFragment;
    public static int layoutId = R.layout.tab_item_view;

    FragmentEnum(Class fragment, String tag, String title, int id) {
        this.mFragment = fragment;
        this.mTitle = title;
        this.mTag = tag;
        this.id = id;
    }

    public void setBundle(Bundle bundle) {
        mBundle = bundle;
    }
}
