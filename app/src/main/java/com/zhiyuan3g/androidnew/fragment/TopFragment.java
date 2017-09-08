package com.zhiyuan3g.androidnew.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.zhiyuan3g.androidnew.R;
import com.zhiyuan3g.androidnew.adapter.NewsAdapter;
import com.zhiyuan3g.androidnew.adapter.NewsAdapterTest;
import com.zhiyuan3g.androidnew.base.MyApp;
import com.zhiyuan3g.androidnew.entity.ADF;
import com.zhiyuan3g.androidnew.entity.NewsEntity;
import com.zhiyuan3g.androidnew.util.OkHttpUrlUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by kkkkk on 2017/9/6.
 */

public class TopFragment extends Fragment {

    @BindView(R.id.top_recyclerView)
    RecyclerView topRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        //获取从主界面传递的参数
        ButterKnife.bind(this, view);
        initGetIntent();
        return view;
    }

    private void initGetIntent() {
        String title = getArguments().getString("title");
        if (title.equals("头条")) {
            initHttp("top");
        } else if (title.equals("社会")) {
            initHttp("shehui");
        } else if (title.equals("国内")) {
            initHttp("guonei");
        } else if (title.equals("国际")) {
            initHttp("guoji");
        } else if (title.equals("娱乐")) {
            initHttp("yule");
        } else if (title.equals("体育")) {
            initHttp("tiyu");
        } else if (title.equals("军事")) {
            initHttp("junshi");
        } else if (title.equals("科技")) {
            initHttp("keji");
        } else if (title.equals("财经")) {
            initHttp("caijing");
        } else {
            initHttp("shishang");
        }
    }

    private void initHttp(String str) {
        OkHttpUtils
                .post()
                .url(OkHttpUrlUtil.URL)
                .addParams("key", OkHttpUrlUtil.KEY)
                .addParams("type", str)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Gson gson = new Gson();
                        NewsEntity newsEntity = gson.fromJson(response, NewsEntity.class);
                        List<NewsEntity.ResultBean.DataBean> data = newsEntity.getResult().getData();
                        for(NewsEntity.ResultBean.DataBean dataBean : data){
                            if(dataBean.getThumbnail_pic_s03()!=null){
                                dataBean.setItemType(3);
                            }else if(dataBean.getThumbnail_pic_s02() !=null &&dataBean.getThumbnail_pic_s03()==null){
                                dataBean.setItemType(2);
                            }else{
                                dataBean.setItemType(1);
                            }
                        }

                        NewsAdapter adapter = new NewsAdapter(newsEntity.getResult().getData());
                        LinearLayoutManager manager = new LinearLayoutManager(MyApp.getContext());
                        topRecyclerView.setLayoutManager(manager);
                        topRecyclerView.setAdapter(adapter);



//                        NewsAdapterTest adapter = new NewsAdapterTest(R.layout.fragment_one,newsEntity.getResult().getData());
//                        NewsAdapter adapter = new NewsAdapter(newsEntity.getResult().getData());
//                        LinearLayoutManager manager = new LinearLayoutManager(MyApp.getContext());
//                        topRecyclerView.setLayoutManager(manager);
//                        topRecyclerView.setAdapter(adapter);
                    }
                });
    }
}
