package com.java8.stream;

import java.util.stream.IntStream;

/**
 * @Author: jiangjiabin
 * @Description:
 * 集合关注的是数据与数据存储本身
 * 流关注的则是对数据的计算
 * @Date: Create in 15:47 2019/2/8
 */
public class StreamTest8 {

    public static void main(String[] args) {
        IntStream.iterate(0, item -> (item + 1) % 2)
                .limit(6).distinct().forEach(System.out::println);

    }

}
