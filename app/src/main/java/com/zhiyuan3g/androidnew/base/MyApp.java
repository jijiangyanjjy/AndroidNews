package com.zhiyuan3g.androidnew.base;

import android.app.Application;
import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;

import org.litepal.LitePal;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

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
        LitePal.initialize(context);//GreenDao

        //初始化Http
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);
    }


    public static Context getContext(){
        return context;
    }
}
