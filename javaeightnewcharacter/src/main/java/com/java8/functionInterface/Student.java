package com.java8.functionInterface;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 4:02 2019/1/28
 */
public class Student {

    private String name = "zhangsan";
    private int age = 20;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
