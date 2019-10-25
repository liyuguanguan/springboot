package com.example.demo.dto;

import java.io.Serializable;

public class DsAdResponseData implements Serializable {

    private static final long serialVersionUID = 4368733927997263318L;
    private int adid;
    private int price;
    private String imgurl;
    private String clickurl;
    private String getImpression_url;
    private String getClk_url;

    private String postImpression_url;
    private String postImpression_Param;
    private String psotClk_url;
    private String postClk_url_Param;
    private String title;
    private String description;
    private int adwidth;
    private int adheigh;

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getClickurl() {
        return clickurl;
    }

    public void setClickurl(String clickurl) {
        this.clickurl = clickurl;
    }

    public String getGetImpression_url() {
        return getImpression_url;
    }

    public void setGetImpression_url(String getImpression_url) {
        this.getImpression_url = getImpression_url;
    }

    public String getGetClk_url() {
        return getClk_url;
    }

    public void setGetClk_url(String getClk_url) {
        this.getClk_url = getClk_url;
    }

    public String getPostImpression_url() {
        return postImpression_url;
    }

    public void setPostImpression_url(String postImpression_url) {
        this.postImpression_url = postImpression_url;
    }

    public String getPostImpression_Param() {
        return postImpression_Param;
    }

    public void setPostImpression_Param(String postImpression_Param) {
        this.postImpression_Param = postImpression_Param;
    }

    public String getPsotClk_url() {
        return psotClk_url;
    }

    public void setPsotClk_url(String psotClk_url) {
        this.psotClk_url = psotClk_url;
    }

    public String getPostClk_url_Param() {
        return postClk_url_Param;
    }

    public void setPostClk_url_Param(String postClk_url_Param) {
        this.postClk_url_Param = postClk_url_Param;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAdwidth() {
        return adwidth;
    }

    public void setAdwidth(int adwidth) {
        this.adwidth = adwidth;
    }

    public int getAdheigh() {
        return adheigh;
    }

    public void setAdheigh(int adheigh) {
        this.adheigh = adheigh;
    }

    @Override
    public String toString() {
        return "DsAdResponseData{" +
                "adid=" + adid +
                ", price=" + price +
                ", imgurl='" + imgurl + '\'' +
                ", clickurl='" + clickurl + '\'' +
                ", getImpression_url='" + getImpression_url + '\'' +
                ", getClk_url='" + getClk_url + '\'' +
                ", postImpression_url='" + postImpression_url + '\'' +
                ", postImpression_Param='" + postImpression_Param + '\'' +
                ", psotClk_url='" + psotClk_url + '\'' +
                ", postClk_url_Param='" + postClk_url_Param + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", adwidth=" + adwidth +
                ", adheigh=" + adheigh +
                '}';
    }
}
