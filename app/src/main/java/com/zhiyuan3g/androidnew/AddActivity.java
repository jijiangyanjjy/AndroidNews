package com.zhiyuan3g.androidnew;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zhiyuan3g.androidnew.adapter.AddAdapter;
import com.zhiyuan3g.androidnew.adapter.JainAdapter;
import com.zhiyuan3g.androidnew.db.TitleDB;
import com.zhiyuan3g.androidnew.fragment.TopFragment;
import com.zhiyuan3g.androidnew.util.TabTitleDate;

import org.litepal.crud.DataSupport;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddActivity extends AppCompatActivity {

    @BindView(R.id.add_toolBar)
    Toolbar addToolBar;
    @BindView(R.id.add_my_recyclerView)
    RecyclerView addMyRecyclerView;
    @BindView(R.id.add_my_recyclerView_jian)
    RecyclerView addMyRecyclerViewJian;

    private AddAdapter adapters;
    private JainAdapter jainAdapter;
    private List<TitleDB> alls;
    private List<TitleDB> all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        ButterKnife.bind(this);
        //初始化标题
        initToolBar();
        //初始化第一个列表
        initFirstRecyclerView();
        //初始化第二个列表
        initSencedRecyclerView();
    }

    private void initSencedRecyclerView() {
        alls = DataSupport.where("isOk = ?", "1").find(TitleDB.class);
        jainAdapter = new JainAdapter(R.layout.first_item, alls);
        GridLayoutManager manager = new GridLayoutManager(this, 4);
        addMyRecyclerViewJian.setLayoutManager(manager);
        addMyRecyclerViewJian.setAdapter(jainAdapter);

        jainAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                ContentValues cv = new ContentValues();
                cv.put("isOk", 0);
                DataSupport.updateAll("TitleDB", cv, "title = ?", alls.get(position).getTitle());

                //刷新上面的列表
                updateSecond(alls.get(position));
                TabTitleDate.addDate(alls.get(position).getTitle());
                Bundle bundle = new Bundle();
                //每次添加碎片时，传递新的
                bundle.putString("title",alls.get(position).getTitle());
                TopFragment topFragment = new TopFragment();
                topFragment.setArguments(bundle);
                TabTitleDate.addDate(topFragment);
                //移除列表中的集合
                alls.remove(alls.get(position));
                jainAdapter.notifyDataSetChanged();
            }
        });
    }

    private void updateSecond(TitleDB titleDB) {
        all.add(titleDB);
        adapters.notifyDataSetChanged();
    }

    private void initFirstRecyclerView() {
        //所有当前title中包含的
        all = DataSupport.where("isOk = ?", "0").find(TitleDB.class);
        adapters = new AddAdapter(R.layout.first_item, all);
        GridLayoutManager manager = new GridLayoutManager(this, 4);
        addMyRecyclerView.setLayoutManager(manager);
        addMyRecyclerView.setAdapter(adapters);

        adapters.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if(all.size()>4){
                    ContentValues cv = new ContentValues();
                    cv.put("isOk", 1);
                    DataSupport.updateAll("TitleDB", cv, "title = ?", all.get(position).getTitle());
                    //在移除TitleDB对象之前 先添加进下面列表
                    initUpdate(all.get(position));
                    //移除全局的集合
                    TabTitleDate.removeDate(all.get(position).getTitle());
                    TabTitleDate.removeDate(TabTitleDate.list.get(position));
                    //移除列表中的集合
                    all.remove(all.get(position));
                    adapters.notifyDataSetChanged();
                }else{
                    Toast.makeText(AddActivity.this, "最少保留一个标题", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initUpdate(TitleDB titleDB) {
        alls.add(titleDB);
        jainAdapter.notifyDataSetChanged();
    }

    private void initToolBar() {
        setSupportActionBar(addToolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                setResult(0, intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
