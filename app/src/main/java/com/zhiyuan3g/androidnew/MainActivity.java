package com.zhiyuan3g.androidnew;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.viewpagerindicator.TabPageIndicator;
import com.zhiyuan3g.androidnew.adapter.TabPageIndicatorAdapter;
import com.zhiyuan3g.androidnew.fragment.TopFragment;
import com.zhiyuan3g.androidnew.util.TabTitleDate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.main_tabPageIndicator)
    TabPageIndicator mainTabPageIndicator;
    @BindView(R.id.main_viewPager)
    ViewPager mainViewPager;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //初始化ToolBar
        initToolBar();
        //绑定tab和viewPager
        initTabPager();
    }

    private void initTabPager() {
        //现在集合是空的
        for (int i = 0; i < TabTitleDate.TAB_TITLE.length; i++) {
            TabTitleDate.add(new TopFragment());
        }

        TabPageIndicatorAdapter adapter = new TabPageIndicatorAdapter(fragmentManager);
        mainViewPager.setAdapter(adapter);
        mainTabPageIndicator.setViewPager(mainViewPager);
    }

    private void initToolBar() {
        setSupportActionBar(mainToolbar);
        //初始话碎片管理器
        fragmentManager = getSupportFragmentManager();
    }
}
