package myReflect4;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        /*
        void set (Object obj,object value): 给obj对 象的成员变量赋值为value
        object get (object obj)返回由该Field表示的字段在指定对象上的值。
         */
        // method1();
        method2();
    }

    private static void method2() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        // 2.获取成员变量Field的对象
        Field field = clazz.getDeclaredField("money");
        // 3.取消访问检查
        field.setAccessible(true);
        // 4.1 创建对象
        Student student = (Student) clazz.newInstance();
        Object o = field.get(student);
        System.out.println(o);
    }

    private static void method1() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        // 2.获取field这个对象
        Field field = clazz.getField("name");
        // 3.利用set方法进行赋值
        // 3.1 创建一个Student对象

        Student student = (Student) clazz.newInstance();
        // 3.2 对对象赋值
        field.set(student,"zhangSan");
        System.out.println(student);
    }
}
