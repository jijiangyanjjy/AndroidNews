package com.zhiyuan3g.androidnew.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kkkkk on 2017/9/7.
 */

public class SharedPrefrenceUtil {

    public static boolean initStart(Context context,String name,int mode){
        SharedPreferences sharedPreferences = context.getSharedPreferences(name,mode);
        boolean isFirst = sharedPreferences.getBoolean("isFirst", false);
        return isFirst;
    }

    public static void saveFirst(Context context,String name,int mode){
        SharedPreferences sharedPreferences = context.getSharedPreferences(name,mode);
        SharedPreferences.Editor ed = sharedPreferences.edit();
        ed.putBoolean("isFirst",true);
        ed.apply();
    }
}
