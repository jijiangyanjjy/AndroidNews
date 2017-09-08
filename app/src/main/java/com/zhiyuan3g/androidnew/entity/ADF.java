package com.zhiyuan3g.androidnew.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by kkkkk on 2017/9/8.
 */

public class ADF implements MultiItemEntity {

    public static final int ONE = 1;
    public static final int TWO = 2;

    private int itemType;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ADF(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
