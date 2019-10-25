package com.example;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/30 3:38 PM
 */
public class HashMap<K,V> {

    //槽的默认长度
    public int size = 16;

    //空的数组
    static final Entry<?,?>[] EMPTY_TABLE = {};

    public Entry<K,V>[] entry =  (Entry<K,V>[])EMPTY_TABLE;

    public float yinzi = 0.75f;

    //调整之后的槽的长度
    public int threshold;





    public static class Entry<K,V>{
        public K key;

        public V value;

        public int hashcode;
        //链表下一个指引
        public Entry next;

        public Entry(K key, V value, int hashcode, Entry next) {
            this.key = key;
            this.value = value;
            this.hashcode = hashcode;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(46&15);
        for (int i = 0; i <1 ; i++) {
            
        }
    }
}
