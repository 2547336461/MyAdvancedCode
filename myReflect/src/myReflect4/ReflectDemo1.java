package myReflect4;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        /*
        Field[] getFields (): 返回所有公共成员变量对象的数组
        Field[] getDeclaredFields (): 返回所有成员变量对象的数组
        Field getField (String name): 返回单个公共成员变量对象
        Field getDeclaredField (String name):返回单个成员变量对象

         */
        // 返回所有公共成员变量对象的数组
        // method1();
        // method2();
        // method3();
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        Field money = clazz.getDeclaredField("money");
        System.out.println(money);
    }

    private static void method3() throws ClassNotFoundException, NoSuchFieldException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        // 获取的成员变量必须是真是存在的
        // 并且是public修饰
        Field f = clazz.getField("name");
        System.out.println(f);
    }

    private static void method2() throws ClassNotFoundException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        // 2.获取Field对象
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void method1() throws ClassNotFoundException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect4.Student");
        // 2.获取Field对象
        Field[] fields = clazz.getFields();
        // 3.遍历
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
