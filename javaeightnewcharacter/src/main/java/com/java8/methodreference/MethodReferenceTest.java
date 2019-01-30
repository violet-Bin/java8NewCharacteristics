package com.java8.methodreference;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:42 2019/1/30
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }


    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);

        List<Student> students = Lists.newArrayList(student1, student2, student3, student4);

//        students.sort((studentParam1, studentParam2) ->
//                Student.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));

//        System.out.println("-------");
//
        //1.类名::静态方法名
//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort((studentParam1, studentParam2) ->
//                Student.compareStudentByName(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getName()));

//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

        StudentComparator studentComparator = new StudentComparator();

        //2.引用名::实例方法名
//        students.sort((studentParam1, studentParam2) ->
//                studentComparator.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort(studentComparator::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort((studentParam1, studentParam2) ->
//                studentComparator.compareStudentByName(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getName()));

//        students.sort(studentComparator::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

        //类名::实例方法名
        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));

        students.sort(Student::compareByName);
        students.forEach(student -> System.out.println(student.getName()));


//        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");

//        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
//        cities.forEach(city -> System.out.println(city));

//        Collections.sort(cities, String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        //构造方法引用: 类名::new
        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));
        System.out.println(methodReferenceTest.getString2("hello", String::new));

    }

}
