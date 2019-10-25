package com.example.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/15 9:47 AM
 */
public class ListTest {

    private int id;

    private  String name;

    private String haha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JSONField(serialize=false)
    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }
}
