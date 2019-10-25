package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.example.demo.dto.ExcelData;
import com.example.demo.mybaties.model.AdAdvertingData;
import com.example.demo.service.AdAdvertingDataService;
import com.example.demo.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private AdAdvertingDataService adAdvertingDataService;


    @RequestMapping(value = "/export")
    public void excel(HttpServletResponse response) throws Exception {
        long beginTime = System.currentTimeMillis();
        ExcelData data = new ExcelData();
        data.setName("用户信息数据");
        //添加表头
        List<String> titles = new ArrayList();
        //for(String title: excelInfo.getNames())
        titles.add("id");
        titles.add("数据时间");
        titles.add("平台");
        titles.add("开关");
        titles.add("广告位ID");
        titles.add("第三方广告位id");
        titles.add("广告形式ID");
        titles.add("素材id");
        titles.add("广告类型");
        titles.add("推广部门");
        titles.add("投放目的");
        titles.add("第三方广告主ID");
        titles.add("广告投放Id");
        titles.add("广告展示数");
        titles.add("广告点击数");
        titles.add("消费金额,以元为单位");
        titles.add("渠道规则名字");
        titles.add("渠道规则ID");
        titles.add("地域规则ID");
        titles.add("地域规则名称");
        titles.add("投放方式");
        titles.add("投放名称");
        titles.add("ad_click_rate");
        titles.add("创建时间");
        titles.add("消费金额,以元为单位");
        data.setTitles(titles);
        //添加列
        List<List<Object>> rows = new ArrayList();

        List<AdAdvertingData> aa = adAdvertingDataService.get();



        List<Object> row = null;
        for(AdAdvertingData a:aa){
            row=new ArrayList();
            row.add(a.getId());
            row.add(a.getDatestr());
            row.add(a.getPlatform());
            row.add(a.getHaha());
            row.add(a.getPositionId());
            row.add(a.getThirdAdId());
            row.add(a.getShowType());
            row.add(a.getAdvertId());
            row.add(a.getAdType());
            row.add(a.getAdPropertyType());
            row.add(a.getAdPropertyType());
            row.add(a.getAdvertiserId());
            row.add(a.getAdId());
            row.add(a.getAdShow());
            row.add(a.getAdClick());
            row.add(a.getPrice());
            row.add(a.getChannelRules());
            row.add(a.getChannelRulesId());
            row.add(a.getLocationRulesId());
            row.add(a.getLocationRulesName());
            row.add(a.getAdvertType());
            row.add(a.getAdName());
            row.add(a.getAdClickRate());
            row.add(a.getCreateTime());
            rows.add(row);

        }

        data.setRows(rows);

        SimpleDateFormat fdate=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String fileName=fdate.format(new Date())+".xlsx";
        ExcelUtils.exportExcel(response, fileName, data);

        long endTime = System.currentTimeMillis();

        System.out.println(endTime-beginTime);

    }
}