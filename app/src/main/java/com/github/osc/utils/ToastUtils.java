package com.github.osc.utils;

import android.widget.Toast;

import com.github.osc.gloab.AppApplication;

public class ToastUtils {

    private static Toast toast;

    public static void showToast(final String text) {
        ThreadUtils.runMain(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(AppApplication.appContext, text, Toast.LENGTH_SHORT);
                } else {
                    toast.setText(text);
                }
                toast.show();
            }
        });
    }
}
