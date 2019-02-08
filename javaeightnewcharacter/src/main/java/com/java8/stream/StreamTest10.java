package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:53 2019/2/8
 */
public class StreamTest10 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("hello", "world", "hello world");

//        list.stream()
//                .mapToInt(item -> item.length())
//                .filter(length -> length == 5)
//                .findFirst()
//                .ifPresent(System.out::println);

        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);


    }

}
