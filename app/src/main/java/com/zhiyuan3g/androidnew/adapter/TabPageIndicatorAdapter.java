package com.zhiyuan3g.androidnew.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.zhiyuan3g.androidnew.util.TabTitleDate;

/**
 * Created by kkkkk on 2017/9/6.
 */
//如果使用FragmentStatePagerAdapter的话，适用场景：碎片多的情况下。
//如果使用FragmentPagerAdapter的话，适用场景：碎片少的情况下。
public class TabPageIndicatorAdapter extends FragmentStatePagerAdapter {

    public TabPageIndicatorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabTitleDate.list.get(position);
    }

    @Override
    public int getCount() {
        return TabTitleDate.TAB_TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TabTitleDate.TAB_TITLE[position];
    }
}
