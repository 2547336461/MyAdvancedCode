package myTreeSet;

import java.util.TreeSet;

public class myTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("lisa", 12);
        Student st2 = new Student("tom", 33);
        Student st3 = new Student("Jerry", 23);
        Student st4 = new Student("lili", 23);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        // 使用treeSet必须指定排序规则
        System.out.println(treeSet);
     }
}
