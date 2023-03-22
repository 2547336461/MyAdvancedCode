package test4;

public class Zi extends Fu {
    int a = 20;

    public void method() {
        int a = 30;
        System.out.println(a);
        // 在控制台打印本类成员变量时
        System.out.println(this.a);
        // 在控制台打印父类成员变量时 使用super关键字区分父类成员变量
        System.out.println(super.a);
    }
}
