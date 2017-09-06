package com.zhiyuan3g.androidnew.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zhiyuan3g.androidnew.util.TabTitleDate;

/**
 * Created by kkkkk on 2017/9/6.
 */

public class TabPageIndicatorAdapter extends FragmentPagerAdapter {

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
