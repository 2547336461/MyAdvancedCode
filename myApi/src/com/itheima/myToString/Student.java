package com.itheima.myToString;

public class Student {
    private int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    // 我们一般会对toString方法进行重写
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
