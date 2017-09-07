package com.zhiyuan3g.androidnew.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kkkkk on 2017/9/7.
 */

public class TitleDB extends DataSupport {
    private int id;
    private String title;
    private int isOk;

    public int getIsOk() {
        return isOk;
    }

    public void setIsOk(int isOk) {
        this.isOk = isOk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
