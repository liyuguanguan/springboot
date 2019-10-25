package com.example.demo.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/29 4:14 PM
 */
@Controller
public class zhuanfaController {


    @RequestMapping("zhuanfa")

    public ModelAndView zhuanfa(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("zhuanfa.html").forward(httpServletRequest,httpServletResponse);
//        httpServletResponse.setH
        ModelAndView modelAndView = new ModelAndView();
        Map<String,String> map = new HashMap();
        for (String o : map.keySet()) {

        }map.keySet();
//        map.put("header",)
//        modelAndView.addObject()
        return modelAndView;
    }



}
