package myCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatchDemo {
    public static void main(String[] args) {
        // 1.创建countDownLatch对象
        CountDownLatch countDownLatch = new CountDownLatch(3);
        // 2.创建4个线程并启动
        MotherThread mt = new MotherThread(countDownLatch);
        mt.start();
        ChildrenThread1 t1 = new ChildrenThread1(countDownLatch);
        t1.setName("小明");
        ChildrenThread2 t2 = new ChildrenThread2(countDownLatch);
        t2.setName("小红");
        ChildrenThread3 t3 = new ChildrenThread3(countDownLatch);
        t3.setName("小刚");
        t1.start();
        t2.start();
        t3.start();

    }
}
