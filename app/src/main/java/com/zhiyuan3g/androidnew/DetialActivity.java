package com.zhiyuan3g.androidnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetialActivity extends AppCompatActivity {

    @BindView(R.id.datial_toolBar)
    Toolbar datialToolBar;
    @BindView(R.id.detial_webView)
    WebView detialWebView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);
        ButterKnife.bind(this);
        //初始化标题
        initToolBar();
        //加载新闻详情页
        initWebView();
    }

    private void initWebView() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        //已经加载网页了。
        detialWebView.loadUrl(url);
        //设置webView
//        WebSettings settings = detialWebView.getSettings();
//        开启JS互调，可以执行网页上的所有操作
//        settings.setJavaScriptEnabled(true);
        //点击网页内的操作不会跳转到外部浏览器
        detialWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //设置WebView加载网址
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        });

        detialWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress < 100) {
                    progressBar.setProgress(newProgress);
                }else{
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

    private void initToolBar() {
        setSupportActionBar(datialToolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.datial_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (detialWebView.canGoBack()) {
                    detialWebView.goBack();
                } else {
                    finish();
                }
                break;
            case R.id.sc_btn:
                Toast.makeText(this, "收藏成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share_btn:
                Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
