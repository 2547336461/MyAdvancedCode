package threadAtom;

public class MyAtomThread implements Runnable {
    private volatile int count = 0; // 送冰淇凌的数量

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("冰淇凌送了" + count + "个了");
            System.out.println(Thread.currentThread().getName());
        }

    }
}
