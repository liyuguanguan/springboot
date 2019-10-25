package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AOP中的几个概念:通知类型 @Before("")  @After("") @Around("")  @AfterReturning @AfterThrowing
 * 切点（Pointcut）:当这个方式执行时在执行通知。
 * 切面:通知和切点的集合，通知和切点共同定义了切面的全部功能--它是什么，在何时何处完成其功能
 * @Author: liyu.guan
 * @Date: 2019/9/17 5:21 PM
 */
@RestController
@Aspect
public class AOPController {

    @Autowired
    public AopService aopService;

    @RequestMapping("aop")
    public void aop(){
        aopService.begin();
        aopService.end();
        haha();
    }

    @Pointcut("execution(* com.example.demo.aop.AOPController.haha())")
    public void haha(){
        System.out.println("heihei");
    }
    @Before(value = "haha()")
    public void j(JoinPoint joinPoint){
        System.out.println("hahahah");
    }
}
