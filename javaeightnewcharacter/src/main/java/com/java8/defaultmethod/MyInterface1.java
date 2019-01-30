package com.java8.defaultmethod;

/**
 * @Author: jiangjiabin
 * @Description:
 * 为什么会引入默认方法
 * @Date: Create in 18:14 2019/1/30
 */
public interface MyInterface1 {

    default void myMethod() {
        System.out.println("MyInterface1.myMethod");
    }

}
