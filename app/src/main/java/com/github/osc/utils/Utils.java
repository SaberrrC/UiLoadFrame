package com.github.osc.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.github.osc.gloab.AppApplication;

import java.io.File;
import java.util.Random;

public class Utils {
    private final static float SCALE    = 0.7f;
    private final static int   DURATION = 500;

    //得到字符串数组信息
    public static String[] getStringArray(int resId) {
        //getResources:R
        return getResources().getStringArray(resId);
    }

    //得到资源管理的类
    public static Resources getResources() {
        return AppApplication.appContext.getResources();
    }

    //在屏幕适配时候使用,让代码中使用dip属性w
    public static int getDimens(int resId) {
        return getResources().getDimensionPixelSize(resId);
    }

    //得到颜色
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    /**
     * 拿到一个随机颜色
     */
    public static int createRandomColor() {
        Random random = new Random();
        return random.nextInt(180);
    }

    // 创建一个随机的颜色
    public static int randomColor() {
        Random random = new Random();
        int red = random.nextInt(180);
        int blue = random.nextInt(180);
        int green = random.nextInt(180);
        return Color.rgb(red, green, blue);
        // return 0;
    }

 /*   public static void startFragment(Class clss, Bundle bundle) {
        Intent intent = new Intent(AppApplication.appContext, ShowActivity.class);
        intent.putExtra(Fiels.DtailActivity.BUNDLE, bundle);
        intent.putExtra(Fiels.DtailActivity.CLASSNAME, clss);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        AppApplication.appContext.startActivity(intent);
    }*/

    public static void setiTemAnim(View view) {
        view.setScaleX(SCALE);
        view.setScaleY(SCALE);
        ViewCompat.animate(view).scaleX(1.0f).scaleY(1.0f).setDuration(DURATION).setInterpolator(new AnticipateOvershootInterpolator()).start();
    }

    public static int getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static void startInstallActivity(File openFile) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(Uri.fromFile(openFile), "application/vnd.android.package-archive");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        AppApplication.appContext.startActivity(intent);
    }

    public static int getScreenWith() {
        WindowManager wm = getWindowManager();
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }

    private static WindowManager getWindowManager() {
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager manager = (WindowManager) AppApplication.appContext.getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(dm);
        return (WindowManager) AppApplication.appContext.getSystemService(Context.WINDOW_SERVICE);
    }

    public static int getScreenHeight() {
        WindowManager wm = getWindowManager();
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }

    public static void loadImage(String path, ImageView imageView) {
        Glide.with(AppApplication.appContext).load(path).into(imageView);
    }

    public static void loadImage(int id, ImageView imageView) {
        Glide.with(AppApplication.appContext).load(id).into(imageView);
    }

    public static View getLayoutView(int id) {
        return LayoutInflater.from(AppApplication.appContext).inflate(id, null, false);
    }

    //获取版本名
    public static String getVersionName(String packageName) {
        String versionName = "未知";
        try {
            //参数一：要查询的应用包信息对应包名,参数二：标记，想获取什么信息，就设置什么标记，（0：基本信息）
            PackageInfo packageInfo = AppApplication.appContext.getPackageManager().getPackageInfo(packageName, 0);
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

    //获取版本号
    public static int getVersionCode(String packageName) {
        int versionCode = 1;
        try {
            PackageInfo packageInfo = AppApplication.appContext.getPackageManager().getPackageInfo(packageName, 0);
            versionCode = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 设置沉浸式状态栏
     *
     * @param activity
     */
    public static void showColoredBars(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        // 这个属性4.4算是全透明（有的机子是过渡形式的透明），5.0就是半透明了 我的模拟器、真机都是半透明，
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {// 4.4 全透明状态栏
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {// 5.0 全透明实现
            Window window = activity.getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);// calculateStatusColor(Color.WHITE, (int) alphaValue)
        }
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(float dpValue) {
        final float scale = AppApplication.appContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(float pxValue) {
        final float scale = AppApplication.appContext.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
