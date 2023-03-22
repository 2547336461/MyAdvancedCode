package test3;

public class Test3InnerClass {
    public static void main(String[] args) {
        // 静态成员内部类特殊的创建对象格式:
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        // 静态成员内部类静态方法调用方法
        Outer.Inner.method();
    }
}

class Outer {
    static class Inner {
        public void show() {
            System.out.println("inner___show");
        }

        public static void method() {
            System.out.println("method___show");
        }
    }
}