package com.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author: jiangjiabin
 * @Description: 流由三部分构成：
 * 1.源
 * 2.零个或多个中间操作
 * 3.终止操作
 * <p>
 * 流操作的分类：
 * 1.惰性求值
 * 2.及早求值
 * @Date: Create in 19:18 2019/1/30
 */
public class StreamTest {

    public static void main(String[] args) {

        //创建流
        Stream stream1 = Stream.of("Hello", "world", "hi");

        String[] myArr = new String[]{"qwe", "asd", "zxc"};
        Stream stream2 = Stream.of(myArr);

        Stream stream3 = Arrays.stream(myArr);
    }

}
