package StreamDemo1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MyStream4 {
    // Stream<T> limit (long maxSize):截取指定参数个数的数据
    // Stream<T> skip (long n):跳过指定参数个数的数据
    // static <T> Stream<T> concat(Stream a, Stream b):合并a和b两个流为一个流
    // Stream<T> distinct ():去除流中重复的元素。依赖(hashCode和equals方法)
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张于涛" );
        list1.add("张无忌" );
        list1.add("张翠山" );
        list1.add("王二麻子" );
        list1.add("张良" );
        list1.add("谢广坤" );
        list1.add("谢广坤" );
        list1.add("谢广坤" );
        list1.add("谢广坤" );
        list1.add("谢广坤" );
        list1.add("谢广坤" );
        // 截取指定参数个数的数据
        // list1.stream().limit(3).forEach(s-> System.out.println(s));

        // 跳过指定参数个数的数据
        // list1.stream().skip(2).forEach(s-> System.out.println(s));

        // 合并a和b两个流为一个流
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("张涛2" );
//        list2.add("张无忌2" );
//        list2.add("张翠山2" );
//        list2.add("王二麻子2" );
//        list2.add("张良2" );
//        list2.add("谢广坤2" );
//        Stream<String> stream1 = list1.stream();
//        Stream<String> stream2 = list2.stream();
//        Stream<String> stream3 = Stream.concat(stream1, stream2);
//        stream3.forEach(s -> System.out.println(s))
        // 简化
//        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));
        // 去除流中重复的元素
        list1.stream().distinct().forEach(s-> System.out.println(s));
    }
}
