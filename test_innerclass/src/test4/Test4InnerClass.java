package test4;

public class Test4InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}

class Outer {
    public void method() {
        // 局部内部类，只能在方法中，创建对象并访问
        class Inner {
            public void show() {
                System.out.println("show...");
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
