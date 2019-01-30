package com.java8.defaultmethod;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:26 2019/1/30
 */
public class MyClass2 extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        myClass2.myMethod();
    }
}
