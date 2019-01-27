package com.java8.functionInterface;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 2:44 2019/1/27
 */
public class Test2 {

    public void myTest(MyInterface1 myInterface1) {
        System.out.println(1);
        myInterface1.test();
        System.out.println(1);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        test2.myTest(() -> {
            System.out.println("myTest.");
            System.out.println("myTest..");
        });

        //在Java中, Lambda表达式是对象！！！他们必须依附于一类特别的对象类型--函数式接口
        MyInterface1 myInterface1 = () -> System.out.println("test");  //就是一个 MyInterface1 的实现类的对象
        System.out.println(myInterface1.getClass());
        System.out.println(myInterface1.getClass().getSuperclass());
        System.out.println(myInterface1.getClass().getInterfaces().length);
        System.out.println(myInterface1.getClass().getInterfaces()[0]);    // MyInterface1
//        test2.myTest(new MyInterface1() {
//            @Override
//            public void test() {
//                System.out.println("test()");
//            }
//        });
    }
}

@FunctionalInterface
interface MyInterface1 {

    void test();

    /**
     * 重写了Object类的public方法,接口的抽象方法数不会加一
     *
     * @return
     */
    String toString();

}

