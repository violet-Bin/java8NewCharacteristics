package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:04 2019/2/8
 */
public class StreamTest11 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList(
                "hello welcome",
                "hello world",
                "hello hello welcome",
                "hello world hello");

        List<String> result = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        result.forEach(System.out::println);
    }


}
