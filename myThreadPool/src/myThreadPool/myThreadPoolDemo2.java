package myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class myThreadPoolDemo2 {
    public static void main(String[] args) {
        // 参数不是初始值，而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "执行了");
        });
        System.out.println(pool.getPoolSize());

        executorService.shutdown();
    }
}
