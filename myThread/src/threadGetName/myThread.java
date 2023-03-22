package threadGetName;

public class myThread extends Thread{
    // 重写Thread类中的run方法，开启线程
    @Override
    public void run() {
        // 获取线程名称
        /*String name = getName();
        System.out.println(name);
        System.out.println("======");*/
        Thread thread = Thread.currentThread();
        String name1 = thread.getName();
        System.out.println(name1);
    }
}
