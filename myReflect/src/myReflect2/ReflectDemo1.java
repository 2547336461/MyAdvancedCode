package myReflect2;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Class对象的三种方法
        // 1.Class类中的forName("全类名")
        Class clazz = Class.forName("myReflect2.Student");
        System.out.println(clazz);
        // 2.通过class属性获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);
        // 3.利用对象的getClass()方法获取
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

    }
}
