package threadDemo17;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        // 创建一个阻塞队列 容量为1
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(list);
        Foodie f = new Foodie(list);
        c.start();
        f.start();
    }
}
