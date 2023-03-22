package threadDemo;

public class Demo {
    public static void main(String[] args) {
        // 创建一个线程对象
        myThread mt1 = new myThread();
        // 创建另一个线程对象
        myThread mt2 = new myThread();
        // 开启一条线程
        // mt1.start();  // 开启线程，相当于用jvm调用此线程的run方法
        // 开启另一条线程
        // mt2.start();
        mt1.run(); // 相当于普通的调用，并没有开启线程
        mt2.run();

    }
}
