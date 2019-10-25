package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.mybaties.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/dologin",method = RequestMethod.GET)
    @ResponseBody
    public ResponseDTO hello(HttpServletRequest request, User user,String code) {
        ResponseDTO responseDTO = new ResponseDTO();
        if (!CodeUtil.checkVerifyCode(request,code)) {
            responseDTO.setCode(201);
            responseDTO.setMessage("验证码有误");
            return responseDTO;
        } else {
            List<User> users = userService.get(user);
            if (users!=null || users.size()>0){
                responseDTO.setCode(200);
                responseDTO.setMessage("登录成功");
                request.getSession().setAttribute("user",users.get(0));
            } else {
                responseDTO.setCode(202);
                responseDTO.setMessage("用户名密码错误");
            }
            return responseDTO;
        }
    }



    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO hello1(HttpServletRequest request, User user,String code) {
        ResponseDTO responseDTO = new ResponseDTO();
        if (!CodeUtil.checkVerifyCode(request,code)) {
            responseDTO.setCode(201);
            responseDTO.setMessage("验证码有误");
            return responseDTO;
        } else {
            List<User> users = userService.get(user);
            if (users!=null || users.size()>0){
                responseDTO.setCode(200);
                responseDTO.setMessage("登录成功");
                request.getSession().setAttribute("user",users.get(0));
            } else {
                responseDTO.setCode(202);
                responseDTO.setMessage("用户名密码错误");
            }
            return responseDTO;
        }
    }

    @RequestMapping("login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }


}
