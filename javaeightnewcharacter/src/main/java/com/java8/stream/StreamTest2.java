package com.java8.stream;

import java.util.stream.IntStream;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 19:35 2019/1/30
 */
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(5, 6, 7).forEach(System.out::print);
        System.out.println("----------------");

        IntStream.range(3, 9).forEach(System.out::print); //不包含9
        System.out.println("----------------");

        IntStream.rangeClosed(3,9).forEach(System.out::print);//包含9
        System.out.println("----------------");



    }

}
