package com.zhiyuan3g.androidnew.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhiyuan3g.androidnew.R;
import com.zhiyuan3g.androidnew.db.TitleDB;

import java.util.List;

/**
 * Created by kkkkk on 2017/9/7.
 */

public class JainAdapter extends BaseQuickAdapter<TitleDB,BaseViewHolder> {
    public JainAdapter(@LayoutRes int layoutResId, @Nullable List<TitleDB> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TitleDB item) {
        helper.setText(R.id.btn_aaa,item.getTitle())
        .addOnClickListener(R.id.btn_aaa);
    }
}
