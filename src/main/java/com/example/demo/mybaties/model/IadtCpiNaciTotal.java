package com.example.demo.mybaties.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IadtCpiNaciTotal {
    private Integer id;

    private String iadtcpiadtyp;

    private String iadtcpiadver;

    private String totalKey;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIadtcpiadtyp() {
        return iadtcpiadtyp;
    }

    public void setIadtcpiadtyp(String iadtcpiadtyp) {
        this.iadtcpiadtyp = iadtcpiadtyp == null ? null : iadtcpiadtyp.trim();
    }

    public String getIadtcpiadver() {
        return iadtcpiadver;
    }

    public void setIadtcpiadver(String iadtcpiadver) {
        this.iadtcpiadver = iadtcpiadver == null ? null : iadtcpiadver.trim();
    }

    public String getTotalKey() {
        return totalKey;
    }

    public void setTotalKey(String totalKey) {
        this.totalKey = totalKey == null ? null : totalKey.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}