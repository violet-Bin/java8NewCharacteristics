package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:41 2019/2/8
 */
public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayListWithCapacity(5000000);

        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");

        long startTime = System.nanoTime();

//        list.stream().sorted().count();
        list.parallelStream().sorted().count();  //并发流

        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时: " + millis);


    }
}
