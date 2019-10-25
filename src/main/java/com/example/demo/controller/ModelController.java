package com.example.demo.controller;

import com.example.demo.mybaties.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("login")
public class ModelController {

    @Value("${com.moji}")
    private String aaa;

    @Autowired
    private UserService userService;

    @RequestMapping("/haha")
    public String aa (Model model){
        model.addAttribute("name",aaa);
        return "haha";
    }
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(){
        User user = new User();
        user.setName("小王");
//        user.setUser("xiaowang");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        userService.addUser(user);
        return "ok";
    }
}
