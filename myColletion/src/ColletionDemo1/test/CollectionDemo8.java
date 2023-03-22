package ColletionDemo1.test;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> arrStudent = new ArrayList<>();
        Student st1 = new Student("张三", 12);
        Student st2 = new Student("李四", 12);
        Student st3 = new Student("王五", 12);

        arrStudent.add(st1);
        arrStudent.add(st2);
        arrStudent.add(st3);

        // 迭代器的方式进行遍历
        Iterator<Student> iterator = arrStudent.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }

        System.out.println("-------------------");

        // 增强for遍历
        for (Student student : arrStudent) {
            System.out.println(student);
        }
    }
}
