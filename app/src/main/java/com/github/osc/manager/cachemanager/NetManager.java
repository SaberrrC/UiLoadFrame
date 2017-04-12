package com.github.osc.manager.cachemanager;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class NetManager {
    private static NetManager sNetManager = new NetManager();

    private NetManager() {
    }

    public static NetManager getInstance() {
        return sNetManager;
    }

    @NonNull
    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(10, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(10, TimeUnit.SECONDS)//设置写的超时时间
                .build();
    }

    /**
     * Post请求获取返回的String
     *
     * @param url
     * @param headMap
     * @param body
     * @return
     */
    public String requestPostString(String url, Map<String, String> headMap, RequestBody body) {
        // 定义okhttp
        OkHttpClient okHttpClient_post_kv = getOkHttpClient();
        // 定义请求体
        // 执行okhttp
        Request.Builder builder = new Request.Builder().url(url);
        if (headMap != null && headMap.size() > 0) {
            for (String key : headMap.keySet()) {
                builder.addHeader(key, headMap.get(key));
            }
        }
        if (body != null) {
            builder.post(body);
        }
        Request request = builder.build();
        Response response = null;
        try {
            response = okHttpClient_post_kv.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取请求体
     *
     * @param url
     * @return
     */
    public ResponseBody requestBody(String url) {
        OkHttpClient okHttpClient = getOkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取 Response
     *
     * @param url
     * @param headMap
     * @param body
     * @return
     */
    public Response requestResponse(String url, Map<String, String> headMap, RequestBody body) {
        OkHttpClient okHttpClient = getOkHttpClient();
        Request.Builder builder = new Request.Builder().url(url);
        if (headMap != null && headMap.size() > 0) {
            for (String key : headMap.keySet()) {
                String value = headMap.get(key);
                builder.addHeader(key, value);
            }
        }
        if (body != null) {
            builder.post(body);
        }
        Request request = builder.build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
