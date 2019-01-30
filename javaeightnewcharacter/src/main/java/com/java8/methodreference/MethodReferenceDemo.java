package com.java8.methodreference;

import com.google.common.collect.Lists;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * 方法引用实际上是个Lambda表达式的一种语法糖
 *
 * 我们可以将方法引用看作【函数指针】
 *
 * 被调用的方法是已有的,才可以使用方法引用
 *
 * 方法引用共分为4类：
 *      1. 类名::静态方法名
 *      2. 引用名(对象名)::实例方法名
 *      3. 类名::实例方法名
 *      4. 构造方法引用: 类名::new
 * @Date: Create in 16:33 2019/1/30
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("Hello", "world", "Hello world");
//        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);
    }


}
