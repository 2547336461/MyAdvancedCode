package myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class myThreadPoolDemo {
    //static ExecutorService newCachedThreadPool () 创建一个默认的线程池
    //static newFixedThreadPool (int Threads) 创建一个指定最多线程数量的线程池

    public static void main(String[] args) throws InterruptedException {
        // 1.创建一个默认的线程池对象，池子中默认是空的，默认可以容纳类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        // Executor可以帮助我们建立线程池对象
        // ExecutorService可以控制线程
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行");
        });

        // 线程休息10毫秒
        Thread.sleep(10);

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行");
        });
        executorService.shutdown();
    }
}
