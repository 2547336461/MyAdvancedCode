package threadAtom3;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntegerDemo2 {
    //int get():获取值
    //int getAndIncrement():    以原子方式将当前值加1，注意，这里返回的是自增前的值。
    //int incrementAndGet():    以原子方式将当前值加1，注意，这里返回的是自增后的值。
    //int addAndGet(int data):  以原子方式将参数与对象中的值相加，并返回结果。
    //int getAndSet(int value): 以原子方式设置为newValue的值，并返回旧值。

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(10);
        System.out.println(ai.get());
        System.out.println("---");

        int andIncrement = ai.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(ai.get());
        System.out.println("---");

        int i = ai.incrementAndGet();
        System.out.println(i);
        System.out.println(ai.get());
        System.out.println("---");

        int i1 = ai.addAndGet(10);
        System.out.println(i1);
        System.out.println(ai.get());
        System.out.println("---");

        int andSet = ai.getAndSet(30);
        System.out.println(andSet);
        System.out.println(ai.get());
        System.out.println("---");
    }
}
