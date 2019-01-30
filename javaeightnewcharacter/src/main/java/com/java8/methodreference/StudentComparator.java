package com.java8.methodreference;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:44 2019/1/30
 */
public class StudentComparator {

    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }


}
