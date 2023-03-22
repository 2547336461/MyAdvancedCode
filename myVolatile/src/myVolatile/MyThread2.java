package myVolatile;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Money.money = 90000;
    }
}
