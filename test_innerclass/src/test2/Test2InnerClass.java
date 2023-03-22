package test2;

public class Test2InnerClass {
    public static void main(String[] args) {
        // 私有化内部类 不能直接调用
        // Outer.Inner oi = new Outer().new Inner;
        Outer o = new Outer();
        o.method();
    }
}

class Outer {
    private class Inner {
        public void show() {
            System.out.println("inner___show");
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }
}