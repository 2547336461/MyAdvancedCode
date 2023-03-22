package threadDemo;

public class myThread extends Thread{
    @Override
    public void run() {
        // 代码就是进程开启后执行的代码
        // run方法是用来封装被线程执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开始了"+i);
        }
    }
}
