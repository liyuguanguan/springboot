package com.example.demo;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Aspect
@EnableAspectJAutoProxy
public class DemoApplicationTests {
//
//    @Before
//    public void before(){
//        System.out.println("before");
//    }


    @Test
    @Pointcut("execution(* com.example.demo.DemoApplicationTests.contextLoads(..))")
    public void contextLoads() {
        System.out.println("就是执行他");
    }
    @Around("contextLoads()")
    public void around(){
        System.out.println("around");
    }
//    @After
//    public void after(){
//        System.out.println("after");
//    }


}
