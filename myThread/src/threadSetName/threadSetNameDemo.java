package threadSetName;

public class threadSetNameDemo {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.setName("我的线程");
        mt.start();
        new myThread("父类给我起的名字").start();
    }
}
