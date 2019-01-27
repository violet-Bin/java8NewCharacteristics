package com.java8.functionInterface;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 3:33 2019/1/27
 */
public class Test3 {

    public static void main(String[] args) {
        MyInterface2 myInterface2 = () -> {
        };
        System.out.println(myInterface2.getClass().getInterfaces()[0]);
        MyInterface3 myInterface3 = () -> {
        };
        System.out.println(myInterface3.getClass().getInterfaces()[0]);
        //() -> {}; // 这个表达式的类型需要由上下文推断出来,只写这个表达式是无法确定他的类型.

//        new Thread(() -> System.out.println("thread")).start();

        List<String> list = Lists.newArrayList("hello", "world", "hello world");

//        list.forEach(item -> System.out.println(item.toUpperCase()));

        List<String> list1 = Lists.newArrayList(); // 菱形语法 推断

//        list.forEach(item->list1.add(item.toUpperCase()));
//        list1.forEach(System.out::println);
//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
//        list.stream().map(String::toUpperCase).forEach(System.out::println);

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

    }

}

@FunctionalInterface
interface MyInterface2 {
    void myMethod2();
}

@FunctionalInterface
interface MyInterface3 {
    void myMethod3();
}