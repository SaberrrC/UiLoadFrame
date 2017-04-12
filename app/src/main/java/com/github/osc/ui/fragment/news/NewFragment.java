package com.github.osc.ui.fragment.news;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.osc.R;
import com.github.osc.bean.NewsItemBean;
import com.github.osc.bean.NewsTitleBean;
import com.github.osc.manager.cachemanager.JsonCacheManager;
import com.github.osc.ui.adapter.FinalPagerAdapter;
import com.github.osc.ui.adapter.LoadMutiItemRecyclerViewAdapter;
import com.github.osc.ui.fragment.BaseFragment;
import com.github.osc.ui.view.indicator.CirclePagerIndicator;
import com.github.osc.utils.StringUtils;
import com.github.osc.utils.ThreadUtils;
import com.github.osc.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewFragment extends BaseFragment implements LoadMutiItemRecyclerViewAdapter.FinalRecycleAdapter.OnViewAttachListener, SwipeRefreshLayout.OnRefreshListener, LoadMutiItemRecyclerViewAdapter.OnLoadListener {
    public static final String URL_NEWS_TITLE = "http://www.oschina.net/action/apiv2/banner?catalog=1";
    public static final String URL_NEWS_ITEMS = "http://www.oschina.net/action/apiv2/news?pageToken=";
    @BindView(R.id.rv)
    RecyclerView       mRv;
    @BindView(R.id.sr)
    SwipeRefreshLayout mSr;
    private List<Object> mShowItems = new ArrayList<>();
    private LoadMutiItemRecyclerViewAdapter.FinalRecycleAdapter mFinalRecycleAdapter;
    private NewsTitleBean                                       mNewsTitleBean;
    private NewsItemBean                                        mNewsItemBean;
    private NewsTitleBean                                       mNetNewsTitleBean;
    private NewsItemBean                                        mNetNewsItemBean;
    private Timer                                               mTimer;
    private int dp_18 = Utils.dip2px(18);
    private int dp_16 = Utils.dip2px(16);

    @Override
    public View createView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_new, null, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        mSr.setOnRefreshListener(this);
        mSr.setColorSchemeColors(Utils.getColor(R.color.colorAccent));
        mRv.setLayoutManager(new LinearLayoutManager(getContext()));

        Map<Class, Integer> map = LoadMutiItemRecyclerViewAdapter.getMap();
        map.put(NewsTitleBean.class, R.layout.item_list_news_header);
        map.put(NewsItemBean.ResultBean.ItemsBean.class, R.layout.item_list_news);

        mFinalRecycleAdapter = new LoadMutiItemRecyclerViewAdapter.FinalRecycleAdapter(mShowItems, map, this);
        LoadMutiItemRecyclerViewAdapter loadMutiItemRecyclerViewAdapter = new LoadMutiItemRecyclerViewAdapter(mFinalRecycleAdapter);
        loadMutiItemRecyclerViewAdapter.setOnLoadListener(this);
        mRv.setAdapter(loadMutiItemRecyclerViewAdapter);
    }

    @Override
    public Object getCacheDataOnSub() {
        mNewsTitleBean = JsonCacheManager.getInstance().requestCacheBean(URL_NEWS_TITLE, NewsTitleBean.class);
        mNewsItemBean = JsonCacheManager.getInstance().requestCacheBean(URL_NEWS_ITEMS, NewsItemBean.class);
        return mNewsTitleBean;
    }

    @Override
    public Object getNewDataOnSub() {
        mSr.setRefreshing(true);
        mNetNewsTitleBean = JsonCacheManager.getInstance().requestBean(URL_NEWS_TITLE, null, null, NewsTitleBean.class);
        mNetNewsItemBean = JsonCacheManager.getInstance().requestBean(URL_NEWS_ITEMS, null, null, NewsItemBean.class);
        return mNetNewsTitleBean;
    }

    @Override
    public void showViewOnMain(Object cacheObject, Object newObject) {
        mSr.setRefreshing(false);
        if (cacheObject != null) {
            mShowItems.add(mNewsTitleBean);
            if (mNewsItemBean != null) {
                List<NewsItemBean.ResultBean.ItemsBean> items = mNewsItemBean.getResult().getItems();
                mShowItems.addAll(items);
            }
            mFinalRecycleAdapter.notifyDataSetChanged();
        }
        if (newObject != null) {
            mShowItems.clear();
            mShowItems.add(mNetNewsTitleBean);
            if (mNetNewsItemBean != null) {
                List<NewsItemBean.ResultBean.ItemsBean> items = mNetNewsItemBean.getResult().getItems();
                mShowItems.addAll(items);
            }
            mFinalRecycleAdapter.notifyDataSetChanged();
        }
    }

    private int pagerIndex = 0;

    @Override
    public void onBindViewHolder(LoadMutiItemRecyclerViewAdapter.ViewHolder holder, int position, Object itemData) {
        if (itemData instanceof NewsTitleBean) {
            NewsTitleBean newsTitleBean = (NewsTitleBean) itemData;
            final ViewPager vpNews = (ViewPager) holder.getViewById(R.id.vp_news);
            final TextView tvNewsTitle = (TextView) holder.getViewById(R.id.tv_news_title);
            CirclePagerIndicator indicator = (CirclePagerIndicator) holder.getViewById(R.id.indicator);
            final List<NewsTitleBean.ResultBean.ItemsBean> items = newsTitleBean.getResult().getItems();
            FinalPagerAdapter<NewsTitleBean.ResultBean.ItemsBean> pagerAdapter = new FinalPagerAdapter<>(items, new FinalPagerAdapter.OnPagerCreateListener() {
                @Override
                public View OnPagerCreate(ViewGroup container, int position) {
                    ImageView imageView = new ImageView(container.getContext());
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);//全屏
                    //图片展示
                    Glide.with(container.getContext()).load(items.get(position).getImg()).into(imageView);
                    return imageView;
                }
            });
            vpNews.setAdapter(pagerAdapter);
            indicator.bindViewPager(vpNews);
            vpNews.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    tvNewsTitle.setText(items.get(position).getName());
                    pagerIndex = position;
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            if (mTimer == null) {
                mTimer = new Timer();
            }
            mTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    ThreadUtils.runMain(new Runnable() {
                        @Override
                        public void run() {
                            vpNews.setCurrentItem(pagerIndex++ % items.size());
                        }
                    });
                }
            }, 2000, 2000);
        }
        if (itemData instanceof NewsItemBean.ResultBean.ItemsBean) {
            NewsItemBean.ResultBean.ItemsBean itemsBean = (NewsItemBean.ResultBean.ItemsBean) itemData;
            LinearLayout llTitle = (LinearLayout) holder.getViewById(R.id.ll_title);
            TextView tvTitle = (TextView) holder.getViewById(R.id.tv_title);
            TextView tvDescription = (TextView) holder.getViewById(R.id.tv_description);
            TextView tvTime = (TextView) holder.getViewById(R.id.tv_time);
            ImageView ivInfoComment = (ImageView) holder.getViewById(R.id.iv_info_comment);
            TextView tvCommentCount = (TextView) holder.getViewById(R.id.tv_comment_count);
            tvDescription.setText(itemsBean.getBody());
            tvTime.setText(StringUtils.friendly_time(itemsBean.getPubDate()));
            tvCommentCount.setText(itemsBean.getCommentCount() + "");
            if (StringUtils.isToday(itemsBean.getPubDate())) {
                String title = "[today] " + itemsBean.getTitle();
                SpannableString spannableString = new SpannableString(title);

                Drawable drawable = getResources().getDrawable(R.mipmap.ic_label_today);
                drawable.setBounds(0, 0, dp_16, dp_18);
                ImageSpan imageSpan = new ImageSpan(drawable);
                spannableString.setSpan(imageSpan, 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                tvTitle.setText(spannableString);
            } else {
                tvTitle.setText(itemsBean.getTitle());
            }
        }
    }


    /**
     * 下拉刷新
     */
    @Override
    public void onRefresh() {


    }

    /**
     * LoadMutiItemRecyclerViewAdapter监听
     */
    @Override
    public void onRetry() {

    }

    @Override
    public void onLoadMore() {

    }
}
