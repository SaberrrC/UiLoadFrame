package com.github.saberrrc.osc.ui.view.indicator;

import android.support.v4.view.ViewPager;

public interface PagerIndicator extends ViewPager.OnPageChangeListener {

    /**
     * bind the viewPager into indicator
     *
     * @param viewPager the ViewPager
     */
    void bindViewPager(ViewPager viewPager);


    /**
     * bind the viewPager into indicator
     *
     * @param viewPager       the ViewPager
     * @param initialPosition initialPosition
     */
    void bindViewPager(ViewPager viewPager, int initialPosition);


    /**
     * the ViewPager Current Item
     *
     * @param currentItem currentItem
     */
    void setCurrentItem(int currentItem);

    /**
     * the ViewPager ChangeListener
     *
     * @param listener listener
     */
    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    /**
     * update the DataSet,invalidate
     */
    void notifyDataSetChanged();
}
