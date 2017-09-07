package com.zhiyuan3g.androidnew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.viewpagerindicator.TabPageIndicator;
import com.zhiyuan3g.androidnew.adapter.TabPageIndicatorAdapter;
import com.zhiyuan3g.androidnew.db.TitleDB;
import com.zhiyuan3g.androidnew.fragment.TopFragment;
import com.zhiyuan3g.androidnew.util.SharedPrefrenceUtil;
import com.zhiyuan3g.androidnew.util.TabTitleDate;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.main_tabPageIndicator)
    TabPageIndicator mainTabPageIndicator;
    @BindView(R.id.main_viewPager)
    ViewPager mainViewPager;
    private FragmentManager fragmentManager;
    private TabPageIndicatorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LitePal.getDatabase();
        //初始化ToolBar
        initToolBar();
        //绑定tab和viewPager
        initTabPager();
    }

    private void initTabPager() {
        boolean news = SharedPrefrenceUtil.initStart(this, "news", MODE_PRIVATE);
        //如果为true则从数据库读取标题
        if(news){
            //第一次以后进入，默认给10个标题
            TabTitleDate.title.clear();
            TabTitleDate.list.clear();
            List<TitleDB> all = DataSupport.where("isOk = ?","0").find(TitleDB.class);
            for(TitleDB titleDB : all){
                TabTitleDate.addDate(titleDB.getTitle());
                TabTitleDate.addDate(new TopFragment());
            }
        }else{
            //显示全部的头和内容
            for (int i = 0; i < TabTitleDate.TAB_TITLE.length; i++) {
                TabTitleDate.addDate(TabTitleDate.TAB_TITLE[i]);
                TabTitleDate.addDate(new TopFragment());
                TitleDB titleDB = new TitleDB();
                titleDB.setTitle(TabTitleDate.TAB_TITLE[i]);
                titleDB.setIsOk(0);
                titleDB.save();
            }

            SharedPrefrenceUtil.saveFirst(this,"news",MODE_PRIVATE);
        }
        //创建适配器
        adapter = new TabPageIndicatorAdapter(fragmentManager);
        //给ViewPager设置适配器
        mainViewPager.setAdapter(adapter);
        //关联tabPager和ViewPager
        mainTabPageIndicator.setViewPager(mainViewPager);
    }

    private void initToolBar() {
        setSupportActionBar(mainToolbar);
        //初始话碎片管理器
        fragmentManager = getSupportFragmentManager();
    }

    @OnClick(R.id.main_add)
    public void onViewClicked() {
        Intent intent = new Intent(this,AddActivity.class);
        //回调函数
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 0:
                mainTabPageIndicator.notifyDataSetChanged();
                adapter.notifyDataSetChanged();
                break;
        }
    }
}
