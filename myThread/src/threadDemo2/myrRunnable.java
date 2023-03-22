package threadDemo2;

public class myrRunnable implements Runnable{

    @Override
    public void run() {
        // 线程启动后的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方法实现多线程"+i);
        }
    }
}
