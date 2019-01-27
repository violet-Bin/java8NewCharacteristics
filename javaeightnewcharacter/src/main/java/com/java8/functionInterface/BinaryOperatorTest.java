package com.java8.functionInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 4:15 2019/1/28
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest bot = new BinaryOperatorTest();
        System.out.println(bot.compute(2, 3, (value1, value2) -> value1 + value2));
        System.out.println(bot.compute(2, 3, (value1, value2) -> value1 - value2));
        System.out.println(bot.compute(2, 3, (value1, value2) -> value1 * value2));
        System.out.println(bot.compute(2, 3, (value1, value2) -> value1 / value2));

        System.out.println(bot.getShort("afsad", "gwr", (a, b) -> a.length() - b.length()));
        System.out.println(bot.getShort("afsad", "gwr", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }


}
