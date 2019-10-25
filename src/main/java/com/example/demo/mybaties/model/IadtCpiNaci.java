package com.example.demo.mybaties.model;

import java.io.Serializable;
import java.util.Date;

public class IadtCpiNaci implements Serializable {
    private Integer id;

    private String cpinavi;

    private String naciType;

    private String naciKey;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpinavi() {
        return cpinavi;
    }

    public void setCpinavi(String cpinavi) {
        this.cpinavi = cpinavi == null ? null : cpinavi.trim();
    }

    public String getNaciType() {
        return naciType;
    }

    public void setNaciType(String naciType) {
        this.naciType = naciType == null ? null : naciType.trim();
    }

    public String getNaciKey() {
        return naciKey;
    }

    public void setNaciKey(String naciKey) {
        this.naciKey = naciKey == null ? null : naciKey.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}