package myVolatile;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        while(Money.money == 100000){

        }
        System.out.println("共享数据已经不是100000了");
    }
}
