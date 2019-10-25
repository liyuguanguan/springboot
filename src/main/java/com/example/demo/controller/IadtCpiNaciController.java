package com.example.demo.controller;


import com.example.demo.mybaties.model.IadtCpiNaci;
import com.example.demo.service.IadtCpiNaciDetailService;
import com.example.demo.service.IadtCpiNaciService;
import com.example.demo.service.IadtCpiNaciTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.Date;

@Controller
public class IadtCpiNaciController {

    @Autowired
    private IadtCpiNaciService iadtCpiNaciService;

    @Autowired
    private IadtCpiNaciDetailService iadtCpiNaciDetailService;

    /**
     * 导航页
     * @return
     */
    @RequestMapping("get")
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("index", iadtCpiNaciService.get());
        modelAndView.setViewName("navigation");
        return modelAndView;
    }

    @RequestMapping(value = "moji/{date}/{key}")
    public ModelAndView get(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable() Date date, @PathVariable String key) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("navigation_detail");
        modelAndView.addObject("detail",iadtCpiNaciDetailService.get(date,key));
        return modelAndView;
    }

    /**
     * 增加或者修改
     * @param iadtCpiNaci
     * @return
     */
    @RequestMapping("add")
    public Integer add(IadtCpiNaci iadtCpiNaci){
        return iadtCpiNaciService.insertOrUpdate(iadtCpiNaci);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del")
    public Integer del(int id){
        return iadtCpiNaciService.delete(id);
    }


}
