package com.java8.optional;

import java.util.Optional;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 4:44 2019/1/28
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional optional = Optional.of("Hello");
        Optional optional2 = Optional.empty();
        Optional optional3 = Optional.ofNullable("d");//可能null可能不null
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }

        optional.ifPresent(item -> System.out.println(item));  //推荐的optional使用方式
        System.out.println("----------");

        System.out.println(optional2.orElse("orElse"));
        System.out.println("----------");

        System.out.println(optional2.orElseGet(() -> "你好"));


    }

}
