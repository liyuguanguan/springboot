package com.example.demo.mybaties.model;

import java.util.Date;

public class IadtCpiNaciDetail {
    private Integer id;

    private String iadtcpiadurl;

    private String iadtcpiadclk;

    private Date createTime;

    private Date updateTime;

    private Integer totalId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIadtcpiadurl() {
        return iadtcpiadurl;
    }

    public void setIadtcpiadurl(String iadtcpiadurl) {
        this.iadtcpiadurl = iadtcpiadurl == null ? null : iadtcpiadurl.trim();
    }

    public String getIadtcpiadclk() {
        return iadtcpiadclk;
    }

    public void setIadtcpiadclk(String iadtcpiadclk) {
        this.iadtcpiadclk = iadtcpiadclk == null ? null : iadtcpiadclk.trim();
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

    public Integer getTotalId() {
        return totalId;
    }

    public void setTotalId(Integer totalId) {
        this.totalId = totalId;
    }
}