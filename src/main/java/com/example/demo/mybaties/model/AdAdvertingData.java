package com.example.demo.mybaties.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdAdvertingData {
    private Long id;

    private String datestr;

    private Byte platform;

    private Boolean haha;

    private Integer positionId;

    private String thirdAdId;

    private Short showType;

    private Long advertId;

    private Integer adType;

    private Integer adPropertyType;

    private Integer adPurpose;

    private Integer advertiserId;

    private Long adId;

    private Integer adShow;

    private Integer adClick;

    private BigDecimal price;

    private String channelRules;

    private Integer channelRulesId;

    private Integer locationRulesId;

    private String locationRulesName;

    private Byte advertType;

    private String adName;

    private Float adClickRate;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Boolean getHaha() {
        return haha;
    }

    public void setHaha(Boolean haha) {
        this.haha = haha;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getThirdAdId() {
        return thirdAdId;
    }

    public void setThirdAdId(String thirdAdId) {
        this.thirdAdId = thirdAdId == null ? null : thirdAdId.trim();
    }

    public Short getShowType() {
        return showType;
    }

    public void setShowType(Short showType) {
        this.showType = showType;
    }

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public Integer getAdPropertyType() {
        return adPropertyType;
    }

    public void setAdPropertyType(Integer adPropertyType) {
        this.adPropertyType = adPropertyType;
    }

    public Integer getAdPurpose() {
        return adPurpose;
    }

    public void setAdPurpose(Integer adPurpose) {
        this.adPurpose = adPurpose;
    }

    public Integer getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public Integer getAdShow() {
        return adShow;
    }

    public void setAdShow(Integer adShow) {
        this.adShow = adShow;
    }

    public Integer getAdClick() {
        return adClick;
    }

    public void setAdClick(Integer adClick) {
        this.adClick = adClick;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getChannelRules() {
        return channelRules;
    }

    public void setChannelRules(String channelRules) {
        this.channelRules = channelRules == null ? null : channelRules.trim();
    }

    public Integer getChannelRulesId() {
        return channelRulesId;
    }

    public void setChannelRulesId(Integer channelRulesId) {
        this.channelRulesId = channelRulesId;
    }

    public Integer getLocationRulesId() {
        return locationRulesId;
    }

    public void setLocationRulesId(Integer locationRulesId) {
        this.locationRulesId = locationRulesId;
    }

    public String getLocationRulesName() {
        return locationRulesName;
    }

    public void setLocationRulesName(String locationRulesName) {
        this.locationRulesName = locationRulesName == null ? null : locationRulesName.trim();
    }

    public Byte getAdvertType() {
        return advertType;
    }

    public void setAdvertType(Byte advertType) {
        this.advertType = advertType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public Float getAdClickRate() {
        return adClickRate;
    }

    public void setAdClickRate(Float adClickRate) {
        this.adClickRate = adClickRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}