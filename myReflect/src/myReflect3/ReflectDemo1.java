package myReflect3;

import java.lang.reflect.Constructor;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Constructor<?>[] getConstructors ()
        // 返回所有公共构造方法对象的数组
        // Constructor<?>[] getDeclaredConstructors ():
        // 返回所有构造方法对象的数组
        // Constructor<T> getConstructor (Class<?>... parameterTypes):
        // 返回单个公共构造方法对象
        // Constructor<T> getDeclaredConstructor (Class<?>... parameterTypes):
        // 返回单个构造方法对象

        Class clazz = Class.forName("myReflect3.Student");
        // method1(clazz);
        // method2(clazz);
        // method3(clazz);
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
    }

    private static void method3(Class clazz) throws NoSuchMethodException {
        Constructor constructor1 = clazz.getConstructor();
        System.out.println(constructor1);
        // 小括号中写跟构造方法中的形参一致,否则报错
        Constructor constructor2 = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor2);
    }

    private static void method2(Class clazz) {
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void method1(Class clazz) {
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
