package test4;

public class Test4Polymorpic {
    public static void main(String[] args) {
        // 向上转型:父类引用子类对象
        Fu f = new Zi();
        f.show();

        // 向下转型:从父类类型转换回子类类型
        Zi z = (Zi) f;
        z.method();
    }
}

class Fu {
    public void show() {
        System.out.println("Fu...show");
    }
}

class Zi extends Fu {
    public void show() {
        System.out.println("zi...show");
    }
    public void method(){
        System.out.println("我是子类特有方法");
    }
}