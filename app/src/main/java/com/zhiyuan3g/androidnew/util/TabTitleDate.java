package com.zhiyuan3g.androidnew.util;

import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkkkk on 2017/9/6.
 */

public class TabTitleDate {

    public static List<Fragment> list = new ArrayList<>();

    public static String[] TAB_TITLE = new String[]{"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","时尚"};

    public static List<String> title = new ArrayList<>();

    public static List<String> addDate(String string){
        title.add(string);
        return title;
    }

    public static List<String> removeDate(String string){
        title.remove(string);
        return title;
    }

    public static List<Fragment> addDate(Fragment fragment){
        list.add(fragment);
        return list;
    }

    public static List<Fragment> removeDate(Fragment fragment){
        list.remove(fragment);
        return list;
    }
}
