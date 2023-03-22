package myReflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // method1();
        // method2();
        // method3();
        // 获取一个私有的构造方法并创建对象
        // 1.获取class对象
        Class clazz = Class.forName("myReflect3.Student");
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        // 被private修饰的成员不能直接使用
        // 如果用反射强行获取并使用，需要临时取消访问检查
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance("zhangSan");
        System.out.println(student);
    }

    private static void method3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("myReflect3.Student");
        // 2.获取构造方法对象
        Student student3 = (Student) clazz.newInstance();
        System.out.println(student3);
    }

    private static void method2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 1.获取class对象
        Class clazz = Class.forName("myReflect3.Student");
        // 2.获取构造方法对象
        Constructor constructor = clazz.getConstructor();
        // 3.利用newInstance 创建Student对象
        Student student2 = (Student) constructor.newInstance();
        System.out.println(student2);
    }

    private static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 1.获取class对象
        Class clazz = Class.forName("myReflect3.Student");
        // 2.获取构造方法对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        // 3.利用newInstance 创建Student对象
        Student student1 = (Student) constructor.newInstance("张三", 23);
        System.out.println(student1);
    }
}
