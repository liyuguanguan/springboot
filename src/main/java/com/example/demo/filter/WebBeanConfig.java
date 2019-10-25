package com.example.demo.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebBeanConfig {




    /**
     * 日志拦截器
     */
    @Autowired
    private MyInterceptor logInterceptor;

    /**
     * 实例化WebMvcConfigurer接口
     *
     * @return
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            /**
             * 添加拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(logInterceptor).addPathPatterns("/**").excludePathPatterns("/resource/static/**","/login","/favicon.ico","/js/**","/kaptcha","/get","/moji/**","/dologin","/excel/**","/**");
            }
        };
    }





}
