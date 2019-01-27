package com.java8.functionInterface;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:34 2019/1/28
 */
public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        PredicateTest2 predicateTest2 = new PredicateTest2();
        predicateTest2.conditionFilter(list, item -> item > 5);
        System.out.println(" ");
        predicateTest2.conditionFilter(list, item -> item % 2 == 0);
        System.out.println(" ");
        predicateTest2.conditionFilter(list, item -> true);
        System.out.println(" ");
        predicateTest2.conditionFilter(list, item -> false);
        System.out.println(" ");
        predicateTest2.conditionFilter2(list, item -> item > 3, item -> item < 7);
        System.out.println(" -");
        System.out.println(predicateTest2.isEqual("test").test("test"));
        System.out.println(predicateTest2.isEqual("").test("test"));//不会报NullException
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.print(integer + " ");
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate1.and(predicate2).negate().test(integer)) {
                System.out.print(integer + " ");
            }
        }
    }

    public Predicate<String> isEqual(Object o) {
        return Predicate.isEqual(o);
    }

}
