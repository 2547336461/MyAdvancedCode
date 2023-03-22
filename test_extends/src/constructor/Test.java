package constructor;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三", 23, 100);
        System.out.println(stu.getName() + "---" + stu.getAge() + "---" + stu.getScore());
    }
    /*
    继承中构造方法的访问特点：
        子类中所有的构造方法，默认都会通过super()访问父类中无参的构造方法
        每一个子类构造方法的第一条语句默认都是：super()
        this(...)super(...)必须放在构造方法的第一行有效语句，并且二者不能共存
    */
}
