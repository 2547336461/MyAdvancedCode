package com.itheima.myEquals;

public class test {
    /*
    public String toString()
    返回对象的字符串表示形式。建议所有子类重写该方法,自动生成
    public boolean equals(另一个对象)
    比较对象是否相等。默认比较地址,重写可以比较内容,自动生成
     */
    public static void main(String[] args) {
        Student s1 = new Student("张三", 24);
        Student s2 = new Student("张三", 24);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
