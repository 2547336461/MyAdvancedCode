package threadDemo14;

public class Foodie extends Thread{
    @Override
    public void run() {
        /*
            1，判断桌子上是否有汉堡包。
            2，如果没有就等待。
            3，如果有就开吃。
            4，吃完之后，桌子上的汉堡包就没有了
            叫醒等待的生产者继续生产
            汉堡包的总数量减一
         */
        while(true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    if (Desk.flag){
                        System.out.println("吃货再吃汉堡包");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else {
                        // 没有就等待
                        // 使用什么对象调用锁，就必须使用这个对象去调用等待和唤醒的方法
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
