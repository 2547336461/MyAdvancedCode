package mySet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class mySet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

        // Set集合没有索引，不能通过索引获取元素
        // for (int i = 0; i < set.size(); i++){}
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
