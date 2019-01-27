package com.java8;

import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 5:00 2019/1/28
 */
public class Company {

    private String nam;
    private List<Employee> employees;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
