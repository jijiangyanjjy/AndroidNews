package com.zhiyuan3g.androidnew.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhiyuan3g.androidnew.R;
import com.zhiyuan3g.androidnew.base.MyApp;
import com.zhiyuan3g.androidnew.entity.ADF;
import com.zhiyuan3g.androidnew.entity.NewsEntity;

import java.util.List;

/**
 * Created by kkkkk on 2017/9/8.
 */

public class NewsAdapter extends BaseMultiItemQuickAdapter<NewsEntity.ResultBean.DataBean,BaseViewHolder> {


    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */


    public NewsAdapter(List<NewsEntity.ResultBean.DataBean> data) {
        super(data);
        addItemType(NewsEntity.ResultBean.DataBean.ONE,R.layout.fragment_one);
        addItemType(NewsEntity.ResultBean.DataBean.TWO,R.layout.fragment_two);
        addItemType(NewsEntity.ResultBean.DataBean.THREE,R.layout.fragment_three);

    }

    @Override
    protected void convert(BaseViewHolder helper, NewsEntity.ResultBean.DataBean item) {
        switch (helper.getItemViewType()) {
            case NewsEntity.ResultBean.DataBean.ONE:
                helper.setText(R.id.one_tv_title,item.getTitle())
                        .setText(R.id.one_tv_auther,item.getAuthor_name())
                        .setText(R.id.one_tv_time,item.getDate());
                Glide.with(MyApp.getContext()).load(item.getThumbnail_pic_s()).into((ImageView) helper.getView(R.id.one_img_one));
                break;
            case NewsEntity.ResultBean.DataBean.TWO:
                helper.setText(R.id.two_tv_title,item.getTitle())
                        .setText(R.id.two_tv_auther,item.getAuthor_name())
                        .setText(R.id.two_tv_time,item.getDate());
                Glide.with(MyApp.getContext()).load(item.getThumbnail_pic_s()).into((ImageView) helper.getView(R.id.two_img));
                break;
            case NewsEntity.ResultBean.DataBean.THREE:
                helper.setText(R.id.three_tv_title,item.getTitle())
                        .setText(R.id.three_tv_auther,item.getAuthor_name())
                        .setText(R.id.three_tv_time,item.getDate());
                Glide.with(MyApp.getContext()).load(item.getThumbnail_pic_s()).into((ImageView) helper.getView(R.id.three_img_one));
                Glide.with(MyApp.getContext()).load(item.getThumbnail_pic_s02()).into((ImageView) helper.getView(R.id.three_img_two));
                Glide.with(MyApp.getContext()).load(item.getThumbnail_pic_s03()).into((ImageView) helper.getView(R.id.three_img_three));
                break;
        }
    }
}
