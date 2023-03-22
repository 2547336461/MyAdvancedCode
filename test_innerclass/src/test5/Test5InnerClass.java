package test5;

public class Test5InnerClass {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();

        // 匿名内部类的理解：
        // 继承\实现，方法重写，创建对象，放在一步进行
        // 实现了Inter接口的，一个实现类对象
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类中的show方法");
            }
        }.show();

        Inter2 i = new Inter2() {

            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
        i.show1();
        i.show2();
    }
}

interface Inter {
    void show();
}

interface Inter2 {
    void show1();

    void show2();
}

class InterImpl implements Inter {
    @Override
    public void show() {
        System.out.println("InterImpl---重写方法");
    }
}