package com.java8.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @Author: jiangjiabin
 * @Description: 流无法重复使用或消费
 * 中间操作都会返回一个Stream对象, 终止操作不会返回Stream类型, 可能不返回值, 也可能返回其他类型的单个值
 * @Date: Create in 14:59 2019/2/8
 */
public class StreamTest6 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        Stream<String> stream2 = Stream.empty();
        stream.findFirst().ifPresent(System.out::println);
        stream2.findFirst().ifPresent(System.out::println);  //避免空指针

        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
        Stream<Integer> stream3 = Stream.iterate(1, item -> item + 2).limit(6);
//        System.out.println(stream3.filter(item -> item > 2).mapToInt(item -> item *2).skip(2).limit(2).sum());
//        stream3.filter(item -> item > 200).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);

//        System.out.println("-----------------------");

//        IntSummaryStatistics intSummaryStatistics =
//                stream3
//                        .filter(item -> item > 2)
//                        .mapToInt(item -> item * 2)
//                        .skip(2)
//                        .limit(2)
//                        .summaryStatistics();
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getCount());

//        System.out.println(stream3);
//        System.out.println(stream3.filter(item -> item > 2));
//        System.out.println(stream.distinct());  //java.lang.IllegalStateException: stream has already been operated upon or closed

        Stream<Integer> filterStream = stream3.filter(item -> item > 2);
        System.out.println(filterStream);
        Stream<Integer> distinctStream = filterStream.distinct();
        System.out.println(distinctStream);


    }

}
