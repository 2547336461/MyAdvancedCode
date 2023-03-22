package binarySearchForIndex;

public class Test1Innerclass {
    public static void main(String[] args) {
        // 创建内部类对象格式：
        Outer.Inner i = new Outer().new Inner();
        i.show();
    }
}

class Outer {
    private int a = 10;

    class Inner {
        int num = 10;

        public void show() {
            System.out.println("inner___show");
            // 内部类访问外部类成员，可以直接访问，包括私有类
            System.out.println(a);
        }
    }
}
