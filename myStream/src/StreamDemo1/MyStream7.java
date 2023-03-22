package StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyStream7 {
    //    Stream流的收集方法
    //    练习:
    //    定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
    //    将集合中的奇数删除，只保留偶数。
    //    遍历集合得到2, 4，6，8，10。
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i + 1);
        }
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        /*
        filter负责过滤
        collect负责收集过滤后的数据
        Collections.toList()会在底层建立一个list集合 ，并把数据全部添加进去
         */
        List<Integer> list = list1.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = list1.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);

    }
}
