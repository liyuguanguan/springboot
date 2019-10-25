package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.DsAdResponseData;
import com.example.demo.dto.DsAdResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/1 下午5:13
 */

@RestController()
public class ADXController {

    @RequestMapping("getadx")
    public  String get(){

        DsAdResponseData dsAdResponseData = new DsAdResponseData();
        dsAdResponseData.setAdheigh(1920);
        dsAdResponseData.setAdwidth(1080);
        dsAdResponseData.setAdid(123);
        dsAdResponseData.setClickurl("http://www.baidu.com");
        dsAdResponseData.setDescription("描述");
        dsAdResponseData.setTitle("标题");
        dsAdResponseData.setImgurl("http://www.imgurl.com");
        dsAdResponseData.setPrice(100);
        dsAdResponseData.setGetImpression_url("http://www.Impression.com");
        dsAdResponseData.setGetClk_url("http://www.GetClk.com");

        DsAdResponseEntity dsAdResponseEntity = new DsAdResponseEntity();
        dsAdResponseEntity.setCode(200);
        dsAdResponseEntity.setMsg("返回成功");

        List<DsAdResponseData> haha = new ArrayList<>();
        haha.add(dsAdResponseData);
         dsAdResponseEntity.setData(haha);
         int a = 1/0;
        return JSON.toJSONString(dsAdResponseEntity);
    }



}
