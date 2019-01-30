package com.java8.defaultmethod;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:17 2019/1/30
 */
public interface MyInterface2 {

    default void myMethod() {
        System.out.println("MyInterface2.myMethod");
    }
}
