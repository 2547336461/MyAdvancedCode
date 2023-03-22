package threadGetName;

public class threadGetNameDemo {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        myThread mt = new myThread();
        mt.start();
        new myThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
