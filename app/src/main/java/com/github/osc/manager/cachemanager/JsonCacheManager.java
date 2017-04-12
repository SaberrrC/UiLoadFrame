package com.github.osc.manager.cachemanager;

import android.text.TextUtils;

import com.github.osc.utils.GsonTools;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;

public class JsonCacheManager {
    private static JsonCacheManager sJsonCacheManager = new JsonCacheManager();

    private JsonCacheManager() {
    }

    public static synchronized JsonCacheManager getInstance() {
        return sJsonCacheManager;
    }

    public String requestCacheGetString(String url, Map<String, String> headMap, RequestBody body) {
        String cacheData = CacheManager.getInstance().requestCacheGetString(url, headMap, body);
        if (TextUtils.isEmpty(cacheData)) {
            return null;
        } else {
            return cacheData;
        }
    }

    public <T> T requestCacheBean(String url, Class<T> bean) {
        String json = CacheManager.getInstance().requestCacheGetString(url, null, null);
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return GsonTools.changeGsonToBean(json, bean);
        }
    }

    public <T> List<T> requestCacheList(String url, Class<T> t) {
        String json = CacheManager.getInstance().requestCacheGetString(url, null, null);
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return GsonTools.changeGsonToList(json, t);
        }
    }

    public <T> List<T> requestList(String url, Map<String, String> headMap, RequestBody body, Class<T> t) {
        String json = NetManager.getInstance().requestPostString(url, headMap, body);
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return GsonTools.changeGsonToList(json, t);
        }
    }

    public <T> T requestBean(String url, Map<String, String> headMap, RequestBody body, Class<T> bean) {
        String json = NetManager.getInstance().requestPostString(url, headMap, body);
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return GsonTools.changeGsonToBean(json, bean);
        }
    }

}
