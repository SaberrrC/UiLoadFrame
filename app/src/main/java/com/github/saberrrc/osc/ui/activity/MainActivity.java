package com.github.saberrrc.osc.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.github.saberrrc.osc.R;
import com.github.saberrrc.osc.ui.fragment.news.FragmentEnum;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.github.saberrrc.osc.utils.ToastUtils.showToast;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_add)
    ImageView       mIvAdd;
    @BindView(R.id.tabhost)
    FragmentTabHost mTabhost;
    @BindView(R.id.fl_content_main)
    FrameLayout     mFlContentMain;
    @BindView(R.id.fl_tabhost)
    FrameLayout     mFlTabhost;
    @BindView(R.id.toolbar)
    Toolbar         mToolbar;
    @BindView(R.id.iv_right_bg)
    ImageView       mIvRightBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolbar();
        initTabHost();
    }

    private void initToolbar() {
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        mToolbar.setTitle("综合");
        mIvRightBg.setVisibility(View.VISIBLE);
        mIvRightBg.setImageResource(R.mipmap.btn_search_normal);
    }

    private void initTabHost() {
        FragmentEnum[] values = FragmentEnum.values();
        for (int i = 0; i < values.length; i++) {
            mTabhost.setup(this, getSupportFragmentManager(), R.id.fl_content_main);
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(values[i].mTag);
            View view = LayoutInflater.from(this).inflate(FragmentEnum.layoutId, null, false);
            ImageView imageview = (ImageView) view.findViewById(R.id.imageview);
            TextView textview = (TextView) view.findViewById(R.id.textview);
            if (i == (values.length / 2)) {
                view.setVisibility(View.INVISIBLE);
                view.setEnabled(false);
            }
            imageview.setImageResource(values[i].id);
            textview.setText(values[i].mTitle);
            tabSpec.setIndicator(view);
            mTabhost.addTab(tabSpec, values[i].mFragment, null);
        }
    }

    @OnClick({R.id.iv_right_bg, R.id.iv_add})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_right_bg:
                break;
            case R.id.iv_add:
                showToast("弹一弹");
                break;
        }
    }
}
