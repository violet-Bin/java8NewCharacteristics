package com.java8.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: jiangjiabin
 * @Description: 流：
 * 流
 * .不存储值,通过管道的方式获取值
 * .本质是函数式的,对流的操作会生成一个结果,不过并不会修改底层的数据源,集合可以作为流的底层数据源
 * .延迟查找,很多流操作(过滤、映射、排序等),都可以延迟实现.
 * @Date: Create in 22:23 2019/1/30
 */
public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("qwe", "rty", "uio");

//        String[] strings = stream.toArray(length -> new String[length]);
//        String[] strings = stream.toArray(String[]::new);
//        Arrays.asList(strings).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(
//                () -> new ArrayList<>(),
//                (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
//        List<String> list = stream.collect(
//                ArrayList::new,
//                ArrayList::add,
//                ArrayList::addAll);
//        list.forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new)); //TreeSet
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);

        String str = stream.collect(Collectors.joining());
        System.out.println(str);



    }

}
