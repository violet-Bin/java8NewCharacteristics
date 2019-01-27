package com.java8.functionInterface;

import java.util.function.Supplier;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 4:03 2019/1/28
 */
public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        System.out.println("----------------------");

        Supplier<Student> supplier2 = Student::new;  //构造方法引用   Supplier不接收参数, 同时返回一个结果
        System.out.println(supplier2.get().getName());




    }

}
