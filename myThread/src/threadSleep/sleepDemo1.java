package threadSleep;

public class sleepDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i < 61; i++) {
            System.out.println(i);
            try {
                // 使当前正在执行的线程以指定的毫秒数暂停(暂时停止执行)，结束之后回复执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
