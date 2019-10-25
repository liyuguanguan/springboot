package com.example.demo;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Author: liyu.guan
 * @Date: 2019/8/23 3:10 PM
 */
public class tong {

    public static void main(String[] args) throws Exception {
        testRateLimiterParallel();
    }
    public static void testRateLimiterParallel() throws Exception {

        Stopwatch started = Stopwatch.createStarted();
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        RateLimiter rateLimiter = RateLimiter.create(10);//创建限流器 每秒只能通过N个请求
        ArrayList<CompletableFuture> objects = Lists.newArrayList();
        IntStream.range(0, 10).forEach(item -> {
            rateLimiter.tryAcquire();
            System.out.println("等待："+rateLimiter.acquire());
            System.out.println("等待结束"+item);
            //多线程模拟请求
            CompletableFuture<Void> cFeature = CompletableFuture.runAsync(() -> {
                try {
                    System.out.println("输出" + item + ": 当前秒数：" + LocalDateTime.now().getSecond());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, executorService);
            objects.add(cFeature);
        });
        CompletableFuture.allOf(objects.toArray(new CompletableFuture[objects.size()])).join();
        System.out.println("执行完毕");
        started.stop();
        long elapsed = started.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("耗时：" + elapsed);

    }

}
