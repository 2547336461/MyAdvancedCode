package threadDemo14;

public class Desk {
    /*
        定义一个标记
        true表示桌子上有汉堡，允许foodie执行
        false表示桌子上没有汉堡，允许cook执行
    */
    public static boolean flag = false;

    // 汉堡总数
    public static int count = 10;

    // 锁对象
    public static final Object lock = new Object();
}
