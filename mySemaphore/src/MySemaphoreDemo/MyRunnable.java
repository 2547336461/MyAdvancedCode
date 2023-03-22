package MySemaphoreDemo;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {
    // 1.获得管理员对象
    Semaphore semaphore = new Semaphore(5);

    @Override
    public void run() {
        // 2.获得通行证
        try {
            semaphore.acquire();
            // 3.开始行驶
            System.out.println("获得了通行证开始通行");
            Thread.sleep(100);
            // 4.归还行驶证
            System.out.println("归还通行证");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
