package com.java8;

import java.util.function.Function;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 5:21 2019/1/27
 */
public class FunctionTest {

    public static void main(String[] args) {

        FunctionTest f = new FunctionTest();
        System.out.println(f.compute(1, value -> 2 * value));      //传递行为
        System.out.println(f.compute(1, value -> 5 + value));
        System.out.println(f.compute(1, value -> value * value));
        System.out.println(f.convert(1, value -> String.valueOf(value) + "  s"));

        //也可以抽取出来
        Function<Integer, Integer> function = value -> value + 2;
        f.compute(1, function);
    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

    //java8之前, 行为已经确定了, 传递值
    public int method1(int a) {
        return 2 * a;
    }

    public int method2(int a) {
        return 5 + a;
    }

    public int method3(int a) {
        return a * a;
    }

}
