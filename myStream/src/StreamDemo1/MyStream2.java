package StreamDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;

public class MyStream2 {
    public static void main(String[] args) {
        // ListMethod();
        // mapMethod();
        // arrayMethod();
        // method4();

    }

    private static void method4() {
        // 同种数据类型的多个数据
        Stream.of(1, 2, 3, 4, 4, 5, 7, 8).forEach(s -> System.out.println(s));
    }

    private static void arrayMethod() {
        // 数组
        int[] array = {1, 2, 3, 4, 5, 6};
        Arrays.stream(array).forEach(s -> System.out.println(s));
    }

    private static void mapMethod() {
        // 双列集合
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("lisa1", 12);
        hm.put("lisa2", 12);
        hm.put("lisa3", 12);
        hm.put("lisa4", 12);
        hm.put("lisa5", 12);
        hm.put("lisa6", 12);
        // 双列集合不能直接获得stream流
        // keySet() 先获取到所有的键，再把Set集合中所有的键放到steam流中
        // hm.keySet().stream().forEach(s -> System.out.println(s));

        // entrySet
        // 先获取到所有的键值对对象
        // 再把Set集合中所有键值对对象放到steam流中
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }

    private static void ListMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa" );
        list.add("bbb" );
        list.add("ccc" );
        // Stream<String> stream = list.stream();
        // stream.forEach(s -> System.out.println(s));
        list.stream().forEach(s -> System.out.println(s));
    }
}
