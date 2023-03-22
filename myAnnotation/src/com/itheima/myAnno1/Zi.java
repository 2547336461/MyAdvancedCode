package com.itheima.myAnno1;

public class Zi extends Fu{
    @Override
    // 告诉编译器这是重写了父类的方法
    public void show() {
        System.out.println("子类的方法");
    }

    @Deprecated
    // 表示这是过时的方法
    public void method(){
        System.out.println("method.....");
    }

    @SuppressWarnings(value = "all")
    // 表示压制所有警告
    public void func(){
        int a;
        int b;
    }
}
