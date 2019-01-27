package com.java8;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 23:07 2019/1/27
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 13);
        Person person2 = new Person("lisi", 24);
        Person person3 = new Person("wangwu", 35);

        List<Person> personList = Lists.newArrayList(person1, person2, person3);

        PersonTest p = new PersonTest();

//        List<Person> result = p.getPersonByUsername("zhangsan", personList);
//        result.forEach(person -> System.out.println(person.getUsername()));

//        List<Person> personByAge = p.getPersonByAge(20, personList);
//        personByAge.forEach(person -> System.out.println(person.getAge()));

        List<Person> persons1 = p.getPersonByAge2(20, personList,
                (age, pList) -> pList.stream().filter(person -> person.getAge() > age)
                        .collect(Collectors.toList()));
        List<Person> persons2 = p.getPersonByAge2(20, personList,
                (age, pList) -> pList.stream().filter(person -> person.getAge() < age)
                        .collect(Collectors.toList()));
        persons1.forEach(person -> System.out.println("person1: " + person.getAge()));
        persons2.forEach(person -> System.out.println("person2: " + person.getAge()));

    }

    public List<Person> getPersonByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction =    //定义一个BiFunction对象
                (ageOfPerson, persons) -> persons.stream()
                        .filter(person -> person.getAge() > ageOfPerson)
                        .collect(Collectors.toList());
        return biFunction.apply(age, personList);
    }

    public List<Person> getPersonByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, personList);
    }

}
