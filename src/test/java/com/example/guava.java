package com.example;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/29 5:19 PM
 */
public class guava {


    private  void AA() throws IOException {
        Map<String, String> map = Maps.newHashMap();
        List<String> list = Lists.newArrayList();
        Set<String> set = Sets.newHashSet();

        //list 添加元素 这样比较麻烦
        List<String> lista = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //list这样添加代码比较省力
        ImmutableList<String> listof = ImmutableList.of("a","b","c","d");
        //map也一样
        ImmutableMap<String, String> mapof2 = ImmutableMap.of("key1", "value1", "key2", "value2");
        //读取文件的内容
        File file = new File(getClass().getResource("/application.yml").getFile());
        List<String> lines = null;
        lines = Files.readLines(file, Charsets.UTF_8);
        System.out.println(lines);
    }
    public static void main(String[] args) throws IOException {
        new guava().AA();
    }


}
