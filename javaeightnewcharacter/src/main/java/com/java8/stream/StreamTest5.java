package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 14:44 2019/2/8
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("hello", "world", "test");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------------");

        List<Integer> list2 = Lists.newArrayList(1, 2, 3, 4, 5);
        list2.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------");

        Stream<List<Integer>> stream =
                Stream.of(Lists.newArrayList(2, 3),
                        Lists.newArrayList(4, 5, 6));

        stream.flatMap(Collection::stream).map(item -> item * item).forEach(System.out::println);


    }
}
