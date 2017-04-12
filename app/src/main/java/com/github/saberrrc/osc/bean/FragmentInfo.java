package com.github.saberrrc.osc.bean;

import android.support.v4.app.Fragment;

public class FragmentInfo {
    public Fragment mFragment;
    public String   mTitle;

    public FragmentInfo(Fragment fragment, String title) {
        mFragment = fragment;
        mTitle = title;
    }
}
