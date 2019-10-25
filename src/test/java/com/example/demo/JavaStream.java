package com.example.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: liyu.guan
 * @Date: 2019/3/11 上午10:22
 */
public class JavaStream {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("dsadasdsadsadasdsadas");
        strings.add("dsadasdsadsadasdsadas");
        // 并行
        Long a  = strings.parallelStream().filter(s -> s.length() > 12).count();

        System.out.println(a);

        // 数组转换成Stream
        Stream dsa = Stream.of("1","2");
        System.out.println(dsa.count());

        // 创建一个空的Stream
        Stream empty = Stream.empty();
        System.out.println(Stream.generate(Math::random).findFirst());
        // 创建一个无限序列
        Stream.iterate(BigInteger.ZERO, bigInteger -> bigInteger.add(BigInteger.ONE));

//        Stream worlds = dsa.map(String::toLowerCase);
    }
}
