package com.itheima.myObjects;

import java.util.Objects;

public class test {
    /*
        public static String toString(对象)
        返回参数中对象的字符串表示形式。
        public static String toString(对象默认字符串)
        返回对象的字符串表示形式。
        public static Boolean isNull(对象)
        判断对象是否为空
        public static Boolean nonNul(对象)
        判断对象是否不为空

     */
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        String sr1 = Objects.toString(s1);
        System.out.println(sr1);
        Student s2 = new Student("老王", 28);
        Student s3 = null;
        String sr3 = Objects.toString(s3, "为空");
        System.out.println(sr3);
        boolean result1 = Objects.isNull(s2);
        System.out.println(result1);
        boolean result2 = Objects.isNull(s3);
        System.out.println(result2);
        boolean result3 = Objects.nonNull(s2);
        System.out.println(result1);
        boolean result4 = Objects.nonNull(s3);
        System.out.println(result2);
    }
}
