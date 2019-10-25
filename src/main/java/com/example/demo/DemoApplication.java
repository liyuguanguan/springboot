package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@ServletComponentScan
@SpringBootApplication
@PropertySource("classpath:env.properties")
@ImportResource(locations = {"classpath:kaptcha.xml"})
@MapperScan("com.example.demo.mybaties.mapper")
@EnableCaching
//@EnableAspectJAutoProxy
public class DemoApplication {

    public static void main(String[] args) {
//        ThreadPoolExecutor a = new ThreadPoolExecutor();
        SpringApplication.run(DemoApplication.class, args);
    }

}
