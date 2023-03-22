package myCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ChildrenThread1 extends Thread {
    private CountDownLatch countDownLatch;
    public ChildrenThread1(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        // 1.吃饺子
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "正在吃第" + i + "个饺子");
        }
        // 2.吃完说一声
        countDownLatch.countDown();
    }
}
