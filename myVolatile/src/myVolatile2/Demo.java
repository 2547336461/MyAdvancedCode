package myVolatile2;

public class Demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("小路同学");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("小张同学");
        t2.start();
    }
}
