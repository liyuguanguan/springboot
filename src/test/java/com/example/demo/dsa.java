package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.ListTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/7 下午5:42
 */
public class dsa {

    public void aa() {
        System.out.println(1 << 4);
    }

    public static void main(String[] args) {
        List<ListTest> listTestLIST = new ArrayList<>();
        ListTest listTest = new ListTest();
        listTest.setId(1);
        listTest.setHaha("haha");
        listTest.setName("name");
        listTestLIST.add(listTest);
        String string = "{\"id\":\"1\",\"name\":\"name\"}";
        ListTest aa = JSON.parseObject(string, ListTest.class);
        System.out.println(aa.toString());
        System.out.println(JSON.toJSONString(listTest));
        System.out.println(1 << 4);
    }
}
