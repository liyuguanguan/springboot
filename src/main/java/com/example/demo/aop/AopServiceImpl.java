package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * @Author: liyu.guan
 * @Date: 2019/9/17 5:18 PM
 */
@Service
@Aspect
public class AopServiceImpl implements AopService {

    /**
     * Pointcut的几个参数
     * 1 execution 代表方法执行的时候出发
     * 2 * 返回任意类型
     * 3 com.example.demo.aop.AopServiceImpl方法所属的类型
     * 4 begin代表某个方法
     * 5 .. 任意参数
     */
    @Pointcut("execution(* com.example.demo.aop.AopServiceImpl.begin*(..))")
    @Override
    public void begin() {
        System.out.println("程序开始了");
    }

    @Override
    public void end() {
        System.out.println("程序结束了");
    }

    @Before(value = "begin()")
    public void before(){
        System.out.println("before:方法之前执行了");
    }

    @After(value = "begin()")
    public void after(){
        System.out.println("after:方法之后执行了");
    }
}
