package TreeSetTest;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        Student st1 = new Student("s1",80,80,80);
        Student st2 = new Student("s1",90,90,90);
        Student st3 = new Student("s1",100,100,100);
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
