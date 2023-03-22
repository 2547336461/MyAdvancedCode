import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class parameterDemo4 {
    /*
    static <E> List<E> of(E...elements)          创建一个具有指定元素的List集合对象
    static <E> Set<E> of(E...elements)           创建一个具有指定元素的Set集合对象
    static <K,V> Map<K, V> of(E...elements)      创建一个具有指定元素的Map集合对象
     */
    public static void main(String[] args) {
        // ListMethod();
        // SetMethod();
        // MapMethod();
        MapOfEntriesMethod();
    }

    private static void MapOfEntriesMethod() {
        // 和of方法一样，只是提高阅读性
        Map<String, String> map = Map.ofEntries(Map.entry("001", "a"),
                Map.entry("002", "b"),
                Map.entry("003", "c"));
        System.out.println(map);
    }

    private static void MapMethod() {
        Map<String, String> map = Map.of("001", "a", "002", "b", "003", "c");
        System.out.println(map);
    }

    private static void SetMethod() {
        // 传递的参数不能重复 否则报错，因为Set.of返回静态集合
        Set<String> a = Set.of("a", "b", "c", "a");
        System.out.println(a);
    }

    private static void ListMethod() {
        // 返回值是静态集合，不能改变
        List<String> a = List.of("a", "b", "c", "d");
        System.out.println(a);
        // a.add("a");
        // a.remove("a");
        // a.set(0,"a");
        // of方法用途 集合批量添加
        // 首先是通过调用List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数。
        // 再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。
        ArrayList<String> list = new ArrayList<>(a);
        System.out.println(list);
        list.add("o");
        System.out.println(list);
    }
}
