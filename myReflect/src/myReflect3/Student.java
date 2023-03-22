package myReflect3;

public class Student {
    private String name;
    private int age;

    //私有的有参构造方法
    private Student(String name) {
        System.out.println("name的值为:" + name);
        System.out.println("private.. . student...有参构造方法");
    }

    //公共的无参构造方法
    public Student() {
        System.out.println("public...student...无参构造方法");
    }

    //公共的有参构造方法
    public Student(String name, int age) {
        System.out.println("name的值为:" + name +
                "age的值为:" + age);
        System.out.println(" public... student...有参构造方法");
    }

}
