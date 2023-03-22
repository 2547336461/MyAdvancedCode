package myReflect5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*
        object invoke (object obj, object... args): 运行方法
        参数一:用ob对象调用该方法
        参数二:调用方法的传递的参数(如果没有就不写)
        返回值:方法的返回值(如果没有就不写)
         */
        // 1. 获取class对象
        Class clazz = Class.forName("myReflect5.Student");
        // 2.获取method方法
        Method function4 = clazz.getMethod("function4", String.class);
        // 3.创建一个Student对象，用来调用方法
        Student student = (Student) clazz.newInstance();
        // 4.运行方法
        Object result = function4.invoke(student, "zhangSan");
        System.out.println(result);
    }
}
