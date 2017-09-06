package com.zhiyuan3g.androidnew.base;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by kkkkk on 2017/9/6.
 */

public class MyApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        //获取全局Context
        context = getApplicationContext();
        //初始化litepal
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
