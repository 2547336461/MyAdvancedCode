package threadDemo16;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        // 阻塞队列基本用法
        // 创建阻塞队列对象，容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        // 储存元素
        arrayBlockingQueue.put("汉堡包1");
        // 取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
    }
}
