package com.example.demo.controller;

import com.example.demo.dto.ListTest;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/19 10:30 AM
 */
@Controller
public class ListController {

    @RequestMapping("listtest")
    @ResponseBody
    public void aha(@RequestBody List<ListTest> test){
        if(!CollectionUtils.isEmpty(test)){
            System.out.println(test);
        }
        System.out.println("aaa");

    }
}
