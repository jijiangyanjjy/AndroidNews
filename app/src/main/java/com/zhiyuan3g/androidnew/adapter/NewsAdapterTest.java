package com.zhiyuan3g.androidnew.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhiyuan3g.androidnew.R;
import com.zhiyuan3g.androidnew.entity.NewsEntity;

import java.util.List;

/**
 * Created by kkkkk on 2017/9/8.
 */

public class NewsAdapterTest extends BaseQuickAdapter<NewsEntity.ResultBean.DataBean, BaseViewHolder> {


    public NewsAdapterTest(@LayoutRes int layoutResId, @Nullable List<NewsEntity.ResultBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsEntity.ResultBean.DataBean item) {
        helper.setText(R.id.one_tv_title,item.getTitle()+"");
    }
}
