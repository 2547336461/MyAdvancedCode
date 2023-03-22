package myHashSet;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        Student st1 = new Student("张三", 12);
        Student st2 = new Student("张三", 12);
        Student st3 = new Student("李四", 23);

        // 如果没有重写hashCode方法，那么根据对象的地址值计算出来的哈希值
        // 同一个对象多次调用hashCode()方法返回的哈希值是相同的
        // 不同对象的哈希值是不一样的。

//        System.out.println(st1.hashCode()); // 189568618
//        System.out.println(st1.hashCode()); // 189568618
//        System.out.println(st2.hashCode()); // 793589513
//        System.out.println(st3.hashCode()); // 1313922862

        // 如果重写了hashCode方法,一般都是通过对象的属性值计算出哈希值。
        // 如果不同的对象属性值是一样的 ,那么计算出来的哈希值也是一样的。

        System.out.println(st1.hashCode()); // 24022532
        System.out.println(st1.hashCode()); // 24022532
        System.out.println(st2.hashCode()); // 24022532
        System.out.println(st3.hashCode()); // 26104875
    }
}
