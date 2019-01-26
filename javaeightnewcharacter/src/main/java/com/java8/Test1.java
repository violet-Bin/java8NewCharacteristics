package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: jiangjiabin
 * @Description:
 *  关于函数式接口：
 *      1. 如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口
 *      2. 如果我们在某个接口上声明了@FunctionalInterface,那么编译器就会按照函数是接口的定义来要求接口
 *      3. 如果某个接口只有一个抽象方法,但并没有给该接口声明@FunctionalInterface，
 *      编译器依旧会将该接口看作是函数式接口。
 * @Date: Create in 2:12 2019/1/27
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        for(int i = 0; i < list.size(); ++i) {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println("----------");
//        //外部迭代
//        for(Integer i : list) {
//            System.out.println(i);
//        }
//
//        System.out.println("----------");
        // 内部迭代
//        list.forEach(new Consumer<Integer>(){
//
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
        //函数式接口可以通过lambda表达式或者方法引用或者构造方法引用来生成对应的实例
        //integer类型推断，所以就不用加参数声明. 如果不能推断出来则必须要声明类型.
        list.forEach(integer -> System.out.println(integer));
        // method reference 创建对象实例本身
        list.forEach(System.out::println);
    }

}
