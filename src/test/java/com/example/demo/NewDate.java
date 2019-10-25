package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/11 下午3:28
 */
public class NewDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(new Date());
        System.out.println(LocalDate.of(2012, Month.DECEMBER, 12));
    }
}
