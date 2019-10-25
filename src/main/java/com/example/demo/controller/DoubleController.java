package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/13 上午11:43
 */
@RestController
public class DoubleController {

    @RequestMapping("doubel")
    public String adas(Double dsa){
        System.out.println(dsa);
        return dsa.toString();
    }
}
