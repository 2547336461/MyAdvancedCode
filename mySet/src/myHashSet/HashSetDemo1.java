package myHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        // 不能保存储存和取出的顺序一致
        // 没有带索引的方法
        // 由于时Set集合 所以元素唯一
        list.add("Hello");
        list.add("Word");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

}
