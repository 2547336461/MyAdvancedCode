package threadDemo15;

public class Cook extends Thread {
    private Desk desk;

    public Cook(Desk desk) {
        this.desk = desk;
    }
    /*
        生产者步骤:
        1，判断桌子上是否有汉堡包
        如果有就等待，如果没有才生产。
        2，把汉堡包放在桌子上。
        3，叫醒等待的消费者开吃。
     */

    @Override
    public void run() {
        while (true) {
            // 把锁传递进去
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (!desk.isFlag()) {
                        // 生产
                        System.out.println("厨师正在生产");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    } else {
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
