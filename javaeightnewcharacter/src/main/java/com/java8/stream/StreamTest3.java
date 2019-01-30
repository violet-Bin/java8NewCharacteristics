package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 19:49 2019/1/30
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(2, 3, 4, 5);
        System.out.println(list.stream().map(i -> 2 * i).reduce(0, (param1, param2) -> param1 + param2));
        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));//Integer里有sum方法,刚好是param1 + param2;所以可以使用方法引用
    }

}
