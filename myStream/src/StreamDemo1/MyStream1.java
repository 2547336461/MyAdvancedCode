package StreamDemo1;

import java.util.ArrayList;
import java.util.List;

public class MyStream1 {
    public static void main(String[] args) {
        // 集合中批量加入元素
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤" ));
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("张" )) {
                list2.add(s);
            }
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-" );
        // stream流
        list1.stream().filter(s -> s.startsWith("张" ))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
