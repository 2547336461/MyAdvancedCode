package Synchronized2;

public class Demo1Ticket {
    public static void main(String[] args) {
        // 开启三个线程对共享的票 同时出售
        // 创建Runnable接口的实现类对象
        RunnableImp ri = new RunnableImp();
        System.out.println("run:" + ri);
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);
        t1.start();
        t2.start();
        t3.start();
    }
}
