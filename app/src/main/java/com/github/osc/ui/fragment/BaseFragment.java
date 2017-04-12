package com.github.osc.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.osc.manager.uimanager.LoadPager;
import com.github.osc.utils.ThreadUtils;

import java.util.List;

public abstract class BaseFragment extends android.support.v4.app.Fragment {

    public LoadPager mLoadingPager;
    private Object cacheObject = null;
    private Object newObject   = null;
    //    private ShowActivity mParentActivity;

   /* {
        Activity activity = getActivity();
        if (activity instanceof ShowActivity) {
            mParentActivity = (ShowActivity) activity;
        }
    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mLoadingPager != null) {
            return mLoadingPager;
        }
        mLoadingPager = new LoadPager(getContext()) {

            @Override
            public View createSuccessView() {
                return createView();
            }

            @Override
            public Object getDataOnSubThread() {
                return BaseFragment.this.getDataOnSubThread();
            }
        };
        return mLoadingPager;
    }

    //获取数据调用该方法发
    private Object getDataOnSubThread() {
        cacheObject = getCacheDataOnSub();
        if (cacheObject == null) {//没缓存
            //联网获取
            newObject = getNewDataOnSub();
            if (newObject == null) {
                return null;//返回错误界面
            } else {
                if (newObject instanceof List) {
                    List data = (List) newObject;
                    if (data.size() > 0) {
                        ThreadUtils.runMain(new Runnable() {
                            @Override
                            public void run() {
                                showViewOnMain(cacheObject, newObject);
                            }
                        });
                        return newObject;
                    } else {
                        ThreadUtils.runMain(new Runnable() {
                            @Override
                            public void run() {
                                showViewOnMain(cacheObject, newObject);
                            }
                        });
                        return newObject;
                    }
                } else {
                    //不是集合
                    ThreadUtils.runMain(new Runnable() {
                        @Override
                        public void run() {
                            showViewOnMain(cacheObject, newObject);
                        }
                    });
                    return newObject;
                }
            }
        } else {//有缓存
            if (cacheObject instanceof List) {
                List data = (List) cacheObject;
                if (data.size() > 0) {
                    ThreadUtils.runMain(new Runnable() {
                        @Override
                        public void run() {
                            showViewOnMain(cacheObject, newObject);
                        }
                    });
                } else {
                    //不是集合
                    ThreadUtils.runMain(new Runnable() {
                        @Override
                        public void run() {
                            showViewOnMain(cacheObject, newObject);
                        }
                    });
                }
            } else {
                //不是集合
                ThreadUtils.runMain(new Runnable() {
                    @Override
                    public void run() {
                        showViewOnMain(cacheObject, newObject);
                    }
                });
            }
            //联网获取
            newObject = getNewDataOnSub();
            if (newObject == null) {
                return cacheObject;//返回缓存进行判断
            } else {
                if (newObject instanceof List) {
                    List data = (List) newObject;
                    if (data.size() > 0) {
                        ThreadUtils.runMain(new Runnable() {
                            @Override
                            public void run() {
                                showViewOnMain(cacheObject, newObject);
                            }
                        });
                        return cacheObject;
                    } else {
                        ThreadUtils.runMain(new Runnable() {
                            @Override
                            public void run() {
                                showViewOnMain(cacheObject, newObject);
                            }
                        });
                        return cacheObject;
                    }
                } else {
                    //不是集合
                    ThreadUtils.runMain(new Runnable() {
                        @Override
                        public void run() {
                            showViewOnMain(cacheObject, newObject);
                        }
                    });
                    return cacheObject;
                }
            }
        }
    }

    public abstract View createView();

    public abstract Object getCacheDataOnSub();

    public abstract Object getNewDataOnSub();

    public abstract void showViewOnMain(Object cacheObject, Object newObject);

    @Override
    public void onDestroy() {
        super.onDestroy();
        //        mParentActivity = null;
    }
}
