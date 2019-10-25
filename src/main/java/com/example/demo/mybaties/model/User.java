package com.example.demo.mybaties.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String name;

    private String password;

    private Date createTime;

    private Integer type;

    private Integer sysTem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSysTem() {
        return sysTem;
    }

    public void setSysTem(Integer sysTem) {
        this.sysTem = sysTem;
    }
}