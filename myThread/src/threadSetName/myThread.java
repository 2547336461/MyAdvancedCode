package threadSetName;

public class myThread extends Thread {
    // 重写构造方法
    public myThread() {
    }

    // 重写构造方法，将参数传递给父类，使用父类的有参构造，给子类设置线程名称
    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(myThread.currentThread().getName());
    }
}
