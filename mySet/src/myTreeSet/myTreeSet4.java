package myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class myTreeSet4 {
    public static void main(String[] args) {
        /*
        默认是使用自然排序，但当自然排序不满足需求时，使用比较器排序
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });
        */

        // lambda表达式方法
        TreeSet<String> treeSet = new TreeSet<>(
                (String o1, String o2) -> {
                    int result = o1.length() - o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
        );

        treeSet.add("aaa");
        treeSet.add("a");
        treeSet.add("aa");
        treeSet.add("bbb");
        treeSet.add("bb");
        treeSet.add("b");
        treeSet.add("ccc");
        treeSet.add("cc");
        treeSet.add("c");
        treeSet.add("AAA");
        treeSet.add("AA");
        treeSet.add("A");
        System.out.println(treeSet);
    }
}
