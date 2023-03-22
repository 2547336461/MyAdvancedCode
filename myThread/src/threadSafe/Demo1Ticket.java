package threadSafe;

public class Demo1Ticket {
    public static void main(String[] args) {
        // 开启三个线程对共享的票 同时出售
        RunnableImp ri = new RunnableImp();
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);
        t1.start();
        t2.start();
        t3.start();
    }
}
