package myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class myTreeSet3 {
    public static void main(String[] args) {
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            // o1表示将要存入集合的元素，o2表示已经存入集合的元素
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        Teacher t1 = new Teacher("aaa", 12);
        Teacher t2 = new Teacher("bbb", 22);
        Teacher t3 = new Teacher("ccc", 32);
        Teacher t4 = new Teacher("ddd", 42);

        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);
        treeSet.add(t4);
        System.out.println(treeSet);
    }
}
