package com.github.saberrrc.osc.manager.cachemanager;

import android.os.Environment;

import com.github.saberrrc.osc.gloab.AppApplication;
import com.github.saberrrc.osc.utils.MD5Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import okhttp3.RequestBody;

public class CacheManager {
    private static CacheManager sCacheManager = new CacheManager();
    private final String mPath;

    private CacheManager() {
        mPath = Environment.getExternalStorageDirectory().getPath() + File.separator + AppApplication.appContext.getPackageName();
        File pathDir = new File(mPath);
        if (!pathDir.exists()) {
            pathDir.mkdirs();
        }
    }

    public static synchronized CacheManager getInstance() {
        return sCacheManager;
    }

    public void saveCacheData(String url, String json) {
        File file = new File(mPath, getFileName(url));
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write(json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getFileName(String url) {
        return MD5Utils.getMd5(url);
    }

    public String requestCacheGetString(String url, Map<String, String> headMap, RequestBody body) {
        StringBuilder sb = new StringBuilder();
        FileInputStream is = null;
        try {
            File file = new File(mPath, getFileName(url));
            is = new FileInputStream(file);
            int len = -1;
            byte[] buffer = new byte[1024 << 4];
            while ((len = is.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, len));
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}