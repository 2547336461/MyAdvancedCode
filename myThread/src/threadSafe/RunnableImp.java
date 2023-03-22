package threadSafe;

/*
    实现卖票案例
*/
public class RunnableImp implements Runnable {
    // 定义一个多线程共享的资源，100张票
    private int ticket = 100;

    // 设置线程任务 卖票
    @Override
    public void run() {
        while (true) {
            // 为了演示效果 提高错误概率
            try {
                Thread.sleep(100);
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
}
