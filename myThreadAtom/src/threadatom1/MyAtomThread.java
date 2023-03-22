package threadatom1;

public class MyAtomThread implements Runnable {
    private volatile int count = 0; //送冰淇淋的数量
    // volatile 关键字只能保证每次使用共享数据时是最新数据，但不能保证原子性

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //1,从共享数据中读取数据到本线程栈中.
            //2,修改本线程栈中变量副本的值
            //3,会把本线程栈中变量副本的值赋值给共享数据.
            count++;
            System.out.println("已经送了" + count + "个冰淇淋");
        }
    }
}
