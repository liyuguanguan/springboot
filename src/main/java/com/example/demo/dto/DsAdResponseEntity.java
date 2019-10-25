package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

public class DsAdResponseEntity implements Serializable {

    private static final long serialVersionUID = -1991229098192515216L;

    private int code;

    private String msg;

    private List<DsAdResponseData> data;
//    private List<TryData> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DsAdResponseData> getData() {
        return data;
    }

    public void setData(List<DsAdResponseData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DsAdResponseEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
