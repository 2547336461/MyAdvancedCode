package test2;

public class Test2Polymorpic {
    /*
        多态的成员访问特点：
            成员变量：
                编译看左边(父类)，运行看左边(父类)
            成员方法：
                编译看左边(父类)，运行看右边(子类)
                由于成员方法有重写覆盖的概念，而成员变量没有。
     */
    public static void main(String[] args) {
        //
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
    }
}

class Fu {
    int num = 10;

    public void method() {
        System.out.println("Fu___method");
    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("Zi___method");
    }
}