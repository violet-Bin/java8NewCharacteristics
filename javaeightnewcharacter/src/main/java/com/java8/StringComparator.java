package com.java8;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 *  Lambda表达式的作用:
 *       传递行为, 而不仅仅是值
 *         (提升抽象层次、API重用性更好、更加灵活)
 * @Date: Create in 5:03 2019/1/27
 */
public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Lists.newArrayList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1); //倒序
//            }
//        });
//
//        System.out.println(names);

        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        System.out.println(names);
    }

}
