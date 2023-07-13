package com.example.demo.mybaties.model;

import java.util.Date;

public class VehicleCheckData {
    private Long id;

    private String vin;

    private String vinId;

    private String parkCode;

    private String parkName;

    private String cabinCode;

    private String cabinName;

    private Integer todayCheckNumber;

    private Date lastCheckTime;

    private Integer lastCheckSuccessNumber;

    private Integer lastCheckFailedNumber;

    private String checker;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getVinId() {
        return vinId;
    }

    public void setVinId(String vinId) {
        this.vinId = vinId == null ? null : vinId.trim();
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode == null ? null : parkCode.trim();
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getCabinCode() {
        return cabinCode;
    }

    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode == null ? null : cabinCode.trim();
    }

    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName == null ? null : cabinName.trim();
    }

    public Integer getTodayCheckNumber() {
        return todayCheckNumber;
    }

    public void setTodayCheckNumber(Integer todayCheckNumber) {
        this.todayCheckNumber = todayCheckNumber;
    }

    public Date getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(Date lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    public Integer getLastCheckSuccessNumber() {
        return lastCheckSuccessNumber;
    }

    public void setLastCheckSuccessNumber(Integer lastCheckSuccessNumber) {
        this.lastCheckSuccessNumber = lastCheckSuccessNumber;
    }

    public Integer getLastCheckFailedNumber() {
        return lastCheckFailedNumber;
    }

    public void setLastCheckFailedNumber(Integer lastCheckFailedNumber) {
        this.lastCheckFailedNumber = lastCheckFailedNumber;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
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