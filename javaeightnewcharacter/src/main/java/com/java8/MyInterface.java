package com.java8;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 2:39 2019/1/27
 */
@FunctionalInterface
public interface MyInterface {

    void test();

//    void test1();

    /**
     * 重写了Object类的public方法,接口的抽象方法数不会加一
     * @return
     */
    String toString();

    /**
     * 默认方法有一个实现, 不是抽象的(见@FunctionalInterface的注释)
     */
    default void t1() {
        System.out.println("t1");
    }

    default void t2() {
        System.out.println("t2");
    }

    static void t3() {
        System.out.println("t3");
    }

}
