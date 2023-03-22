package Synchronized;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票
    解决方法：
        使用重复代码块
    格式:
        synchronized(锁对象){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
        }
    注意:
        1.通过代码块中的锁对象,可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象作用:
            把同步代码块锁住,只让一个线程在同步代码块中执行

*/
public class RunnableImp implements Runnable {
    // 定义一个多线程共享的资源，100张票
    private int ticket = 100;
    // 创建一个锁对象
    Object obj = new Object();

    // 设置线程任务 卖票
    @Override
    public void run() {
        while (true) {
            // 创建重复代码块
            synchronized(obj){
                // 判断票是否存在
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }

        }
    }
}
