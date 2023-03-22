package threadAtom2;

public class MyAtomThread implements Runnable {
    private volatile int count = 0; // 送冰淇凌的数量
    Object lock = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (lock) {
                count++;
                System.out.println("冰淇凌送了" + count + "个了");
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
}
