package Synchronized2;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票
    解决方法2:使用同步方法


*/
public class RunnableImp implements Runnable {
    // 定义一个多线程共享的资源，100张票
    private int ticket = 100;

    // 设置线程任务 卖票
    @Override
    public void run() {
        System.out.println("this:" + this);
        while (true) {
            payTicket();
        }
    }

    /*
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁对象是谁?
        就是实现类对象new RunnableImpl ( )
        也是就是this
    */

    // 定义同步方法
    public synchronized void payTicket() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 判断票是否存在
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}

