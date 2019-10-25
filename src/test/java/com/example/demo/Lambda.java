package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/5 下午8:11
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("saaaaaaaa");
            }
        }).start();

        new Thread( () -> System.out.println()).start();
        new Thread(() -> System.out.println("sa")).start();


        testLambda();
        List aaaa = new ArrayList();
        BigDecimal adPrice1 = new BigDecimal(5);
        BigDecimal adPrice2 = new BigDecimal(4);
        BigDecimal adPrice3 = new BigDecimal(8);
        BigDecimal adPrice4 = new BigDecimal(2);
        BigDecimal adPrice5 = new BigDecimal(3);
        Integer a = 5;
        int b = 4;
        int c = 8;
        int d = 2;
        int e = 3;
        aaaa.add(a);
        aaaa.add(b);
        aaaa.add(c);
        aaaa.add(d);
        aaaa.add(e);
        Collections.sort(aaaa, (o1, o2) ->a);

        BigDecimal aa = adPrice1.subtract(adPrice2);
        if (aa.compareTo(new BigDecimal(0))==1){
            System.out.println(-1);
        } else{
            System.out.println(1);
        }

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String zxc, String bdsads) -> zxc.compareTo(bdsads));

        String one = "dsaaa";
        String two = "dsaa";
        System.out.println("长度"+Integer.compare(one.length(), two.length()));
        System.out.println("长度"+Integer.compare(one.length(), two.length()));
    }
    public static void  testLambda(){
        //普通写法
        func(new IambdaInterface() {
            @Override
            public void aa(int a) {
                System.out.println(123);
            }
        });
        //x代表参数
        func((x) -> System.out.println());
    }

    private static  void func (IambdaInterface iambdaInterface){
        int x = 1;
        iambdaInterface.aa(x);
    }
}
