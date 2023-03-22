package threadDeadLock;

public class Demo1 {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (objA) {
                    System.out.println("进入线程1");
                    synchronized (objB) {
                        System.out.println("尔康正在走路");
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (objB) {
                    System.out.println("进入线程2");
                    synchronized (objA) {
                        System.out.println("紫薇正在走路");
                    }
                }
            }
        }).start();
    }
}
