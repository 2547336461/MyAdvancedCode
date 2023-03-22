package threadDemo2;

public class Demo {
    public static void main(String[] args) {
        // 创建一个参数对象
        myrRunnable mr = new myrRunnable();
        // 创建线程对象，并把参数传递
        Thread t1 = new Thread(mr);
        t1.start();

        myrRunnable mr2 = new myrRunnable();
        Thread t2 = new Thread(mr2);
        t2.start();
    }
}
