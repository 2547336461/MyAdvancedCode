package myHashSetTest;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student st1 = new Student("张三", 12);
        Student st2 = new Student("张三", 12);
        Student st3 = new Student("李四", 22);
        hs.add(st1);
        hs.add(st2);
        hs.add(st3);

        for (Student h : hs) {
            System.out.println(h);
        }
    }
}
