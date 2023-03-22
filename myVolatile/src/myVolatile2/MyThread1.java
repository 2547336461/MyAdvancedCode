package myVolatile2;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized(Money.lock){
                if (Money.money != 100000){
                    break;
                }
            }
        }
    }
}
