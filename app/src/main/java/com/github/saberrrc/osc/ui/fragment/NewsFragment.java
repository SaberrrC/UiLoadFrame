package com.github.saberrrc.osc.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.github.saberrrc.osc.R;
import com.github.saberrrc.osc.bean.FragmentInfo;
import com.github.saberrrc.osc.ui.adapter.NewsPagerAdapter;
import com.github.saberrrc.osc.ui.fragment.news.NewFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsFragment extends BaseFragment {
    @BindView(R.id.tl)
    TabLayout mTl;
    @BindView(R.id.vp)
    ViewPager mVp;
    private Fragment[]         mFragments = {new NewFragment(), new NewFragment(), new NewFragment(), new NewFragment()};
    private List<FragmentInfo> mShowItems = new ArrayList<>();
    private String[]           titles     = com.github.saberrrc.osc.utils.Utils.getStringArray(R.array.general_viewpage_arrays);

    @Override
    public View createView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_news, null, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        mTl.setupWithViewPager(mVp, false);
        mTl.setTabMode(TabLayout.MODE_FIXED);
        for (int i = 0; i < mFragments.length; i++) {
            Log.d("titles", "titles: =======" + titles[i]);
            mShowItems.add(new FragmentInfo(mFragments[i], titles[i]));
        }
        NewsPagerAdapter adapter = new NewsPagerAdapter(getChildFragmentManager(), mShowItems);
        mVp.setAdapter(adapter);

    }

    @Override
    public Object getCacheDataOnSub() {
        return "";
    }

    @Override
    public Object getNewDataOnSub() {
        return null;
    }

    @Override
    public void showViewOnMain(Object cacheObject, Object newObject) {

    }
}
