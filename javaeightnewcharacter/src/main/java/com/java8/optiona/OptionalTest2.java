package com.java8.optiona;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 5:01 2019/1/28
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");

        Employee employee2 = new Employee();
        employee1.setName("lisi");

        Company company = new Company();
        company.setNam("company1");

        List<Employee> employees = Lists.newArrayList(employee1, employee2);
//        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployees())
                .orElse(Collections.emptyList()));

    }

    //Optional没有实现序列化,不推荐作为方法参数, 也不要在类中声明Optional类型的变量
    //通常只作为方法的返回值, 用来规避空指针异常
//    public void test(Optional optional) {
//
//    }

}
