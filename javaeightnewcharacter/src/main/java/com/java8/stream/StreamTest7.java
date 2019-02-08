package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 15:38 2019/2/8
 */
public class StreamTest7 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("hello", "world", "test");

//    list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1))
//                .forEach(System.out::println);

        list.stream().map(item -> {
           String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);  //流没有终止操作, 中间操作是不会执行的, 中间操作是惰性求值. 循环只有一次！




    }

}
