package threadDemo4;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomThread implements Runnable {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        /*
            for (int i = 0; i < 100; i++) {
                System.out.println("冰淇凌送了" + count.incrementAndGet() + "个了");
                System.out.println(Thread.currentThread().getName());
            }
        */
        for (int i = 0; i < 100; i++) {
            int i1 = count.incrementAndGet();
            System.out.println("冰淇凌送了"+i1+"个了");
        }

    }
}
