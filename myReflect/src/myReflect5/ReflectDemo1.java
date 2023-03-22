package myReflect5;

import java.lang.reflect.Method;

public class ReflectDemo1 {
    /*

     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // method1();
        // method2();
        // method3();
        // method4();
        // method5();
    }

    private static void method5() throws ClassNotFoundException, NoSuchMethodException {
        // Method getDeclaredMethod (String name, Class<?>... parameterTypes):
        // 返回单个成员方法对象
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        Method show = clazz.getDeclaredMethod("show");
        System.out.println(show);
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        // Method getMethod (String name, class<?>... parameterTypes) :
        //    返回单个公共成员方法对象
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        Method function2 = clazz.getMethod("function2", String.class);
        System.out.println(function2);
    }

    private static void method3() throws ClassNotFoundException, NoSuchMethodException {
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        Method method = clazz.getMethod("function1");
        System.out.println(method);
    }

    private static void method2() throws ClassNotFoundException {
        // Method[] getDeclaredMethods (): 返回所有成员方法对象的数组，不包括继承的
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void method1() throws ClassNotFoundException {
        // Method[] getMethods ():         返回所有公共成员方法对象的数组，包括继承的
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        // 2.获取成员变量
        Method[] methods = clazz.getMethods();
        // 3.遍历
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
