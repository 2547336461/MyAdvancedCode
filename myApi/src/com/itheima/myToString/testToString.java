package com.itheima.myToString;

public class testToString {
    public static void main(String[] args) {
        Student s = new Student(12,"张三");
        // Object类是所有类的直接或间接父类
        // 直接打印对象就是打印这个对象的toString方法的返回值
        // Object类的toString方法得到的是对象的地址值
        // 我们一般会对toString方法进行重写
        System.out.println(s);
        System.out.println(s.toString());
    }
}
