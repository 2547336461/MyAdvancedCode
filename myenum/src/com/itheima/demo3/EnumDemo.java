package com.itheima.demo3;

public class EnumDemo {
    public static void main(String[] args) {
        /*
        String name()       获取枚举项的名称
        int ordinal()       返回枚举项在枚举类中的索引值
        int compareTo(E o)  比较两个枚举项，返回的是索引值的差值
        String toString()   返回枚举常量的名称
        static <T> T valueOf(Class<T> type,string name )
                            获取指定枚举类中的指定名称的枚举值
        values()            获得所有的枚举项
        */
        // String name()       获取枚举项的名称
        String name = Season.SPRING.name();
        System.out.println(name);

        int ordinal = Season.AUTUMN.ordinal();
        System.out.println(ordinal);

        int i = Season.WINTER.compareTo(Season.SUMMER);
        System.out.println(i);
        int n = Season.SUMMER.compareTo(Season.WINTER);
        System.out.println(n);

        String s = Season.SPRING.toString();
        System.out.println(s);

        Season spring = Enum.valueOf(Season.class, "SPRING");
        System.out.println(spring);
        System.out.println(Season.SPRING == spring);

        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
    }
}
