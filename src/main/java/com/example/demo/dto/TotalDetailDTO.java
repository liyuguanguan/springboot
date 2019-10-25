package com.example.demo.dto;

import com.example.demo.mybaties.model.IadtCpiNaciDetail;
import org.springframework.format.annotation.DateTimeFormat;

import javax.naming.Name;
import java.util.Date;

public class TotalDetailDTO extends IadtCpiNaciDetail {

    private Integer ttid;

    private String iadtcpiadtyp;

    private String iadtcpiadver;

    private String totalKey;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public String getIadtcpiadtyp() {
        return iadtcpiadtyp;
    }

    public void setIadtcpiadtyp(String iadtcpiadtyp) {
        this.iadtcpiadtyp = iadtcpiadtyp;
    }

    public String getIadtcpiadver() {
        return iadtcpiadver;
    }

    public void setIadtcpiadver(String iadtcpiadver) {
        this.iadtcpiadver = iadtcpiadver;
    }

    public String getTotalKey() {
        return totalKey;
    }

    public void setTotalKey(String totalKey) {
        this.totalKey = totalKey;
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
