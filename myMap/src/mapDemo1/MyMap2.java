package mapDemo1;

import java.util.HashMap;
import java.util.Map;

public class MyMap2 {
    /*
    V put(K key,V value )               添加元素
    V remove(object key)                根据键删除键值对元素
    void clear( )                       移除所有的键值对元素
    boolean containsKey(Object key)     判断集合是否包含指定的键
    boolean containsValue(Object value) 判断集合是否包含指定的值
    boolean isEmpty()                   判断集合是否为空
    int size( )                         集合的长度，也就是集合中键值对的个数
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "张三");
        map.put("002", "李四");
        map.put("003", "王二");
        // putMethod(map);
        // removeMethod(map);
        // clearMethod(map);
        // containKayMethod(map);
        // containsValueMethod(map);
        // isEmptyMethod(map);
        // sizeMethod(map);
    }

    private static void sizeMethod(Map<String, String> map) {
        // 获取键值对的个数
        int size = map.size();
        System.out.println(size);
    }

    private static void isEmptyMethod(Map<String, String> map) {
        boolean empty = map.isEmpty();
        System.out.println(empty);
        map.clear();
        boolean empty1 = map.isEmpty();
        System.out.println(empty1);
    }

    private static void containsValueMethod(Map<String, String> map) {
        boolean result1 = map.containsValue("张三");
        boolean result2 = map.containsValue("001");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(map);
    }

    private static void containKayMethod(Map<String, String> map) {
        boolean b = map.containsKey("001");
        boolean b1 = map.containsKey("007");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(map);
    }

    private static void clearMethod(Map<String, String> map) {
        map.clear();
        System.out.println(map);
    }

    private static void removeMethod(Map<String, String> map) {
        String remove = map.remove("001");
        System.out.println(remove);
        System.out.println(map);
    }

    private static void putMethod(Map<String, String> map) {
        System.out.println(map);
        // 如果要添加的键不存在，则会把键值对添加到集合中
        // 如果要添加的键已经存在，将添加的值会覆盖原来值，并将原来的值返回
        String s = map.put("001", "麻子");
        System.out.println(s);
        System.out.println(map);
    }
}
