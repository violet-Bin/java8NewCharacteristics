package com.java8.defaultmethod;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:16 2019/1/30
 */
public class MyClass implements MyInterface1, MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }

    //必须要重写
    @Override
    public void myMethod() {
//        System.out.println("MyClass.myMethod");
        MyInterface2.super.myMethod();
    }
}
