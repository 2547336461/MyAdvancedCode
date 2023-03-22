package threadAtom3;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntegerDemo1 {
    // public AtomicInteger():  初始化一个默认值为0的原子型Integer
    // public AtomicInteger(int initialValue):初始化一个指定值的原子型Integer

    public static void main(String[] args) {
        AtomicInteger ai1 = new AtomicInteger();
        System.out.println(ai1);
        AtomicInteger ai2 = new AtomicInteger(10);
        System.out.println(ai2);
    }
}
