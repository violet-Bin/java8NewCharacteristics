package com.java8.functionInterface;

import java.util.function.Supplier;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 3:56 2019/1/28
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }

}
