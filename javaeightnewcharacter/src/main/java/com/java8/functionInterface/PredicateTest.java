package com.java8.functionInterface;

import java.util.function.Predicate;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:15 2019/1/28
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = (t) -> t.length() > 5;
        System.out.println(predicate.test("hello1"));
    }

}
