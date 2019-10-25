package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/28 12:08 PM
 */
public class equala {

    public String a;

    public String b;

    public equala(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        equala equala = (equala) o;
        return Objects.equals(a, equala.a) &&
                Objects.equals(b, equala.b);
    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(a, b);
//    }

    public static void main(String[] args) {
//        equala equala = new equala("1","2");
//        equala equalb = new equala("1","2");
//        System.out.println(equala);
//        System.out.println(equalb);
//        System.out.println(equalb == equala);
//        System.out.println(equala.equals(equalb));


        Map<String, equala> aa = new HashMap<>();
        String s1 = new String("key");
        String s2 = new String("key");
        equala equala = new equala("1", "2");
        aa.put(s1, equala);
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        System.out.println("map1.get(s1):" + aa.get(s1));
        System.out.println("map1.get(s2):" + aa.get(s2));

        Map<Key, equala> map2 = new HashMap<Key, equala>();
        Key k1 = new Key("A");
        Key k2 = new Key("A");
        map2.put(k1, equala);
        System.out.println("k1.equals(k2):" + s1.equals(s2));
        System.out.println("map2.get(k1):" + map2.get(k1));
        System.out.println("map2.get(k2):" + map2.get(k2));
    }

    static class Key {
        private String k;

        public Key(String key) {
            this.k = key;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return k.equals(key.k);
            }
            return false;
        }

        @Override
        public int hashCode() {

            return Objects.hash(k);
        }
    }
}
