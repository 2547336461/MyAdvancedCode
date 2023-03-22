package ColletionDemo1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    /*
        boolean add(E element)      添加元素
        boolean remove (object o)   从集合中移除指定的元素
        boolean removeIf (object o) 根据条件进行删除
        void clear()                清空集合
        boolean contains(Object o)  判断集合虫是否存在指定的元素
        boolean i sEmpty()          判断集合是否为空
        int size()                  集合的长度，也就是集合中元素的个数

     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("abc");
        collection.add("def");
        collection.add("ghi");
        collection.add("dddd");
        System.out.println(collection);
        // method1(collection);
        // method2(collection);
        // method3(collection);
        // method4(collection);
        // method5(collection);
        // method6(collection);
    }

    private static void method6(Collection<String> collection) {
        // 返回集合长度
        int size = collection.size();
        System.out.println(size);
    }

    private static void method5(Collection<String> collection) {
        // 判断集合是否为空
        boolean isEmpty1 = collection.isEmpty();
        System.out.println(isEmpty1);
        collection.clear();
        boolean isEmpty2 = collection.isEmpty();
        System.out.println(isEmpty2);
    }

    private static void method4(Collection<String> collection) {
        // 判断集合中是否存在指定元素
        boolean contains1 = collection.contains("aaa");
        boolean contains2 = collection.contains("abc");
        System.out.println(contains1);
        System.out.println(contains2);
    }

    private static void method3(Collection<String> collection) {
        // 将集合中的元素全部清除
        collection.clear();
        System.out.println(collection);
    }

    private static void method2(Collection<String> collection) {
        /*
         lambda表达式，根据条件删除.
         removeIf底层会遍历集合，得到集合中的每一个元素,s表示每一个元素,
         把每一个元素都到lambda表达式中判断一下，返回true则删除，false则不删除
         */
        collection.removeIf(
                (String s) -> {
                    return s.length() == 3;
                }
        );
        System.out.println(collection);
    }

    private static void method1(Collection<String> collection) {
        // 该方法有返回值，删除成功返回true，反之返回fault。
        boolean result1 = collection.remove("abc");
        boolean result2 = collection.remove("aaa");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(collection);
    }
}
