package com.itheima.mySystem;

public class SystemDemo {
    /*
        pub1ic static void exit(int status)
        终止当前运行的Jaya 虚拟机，非零表示异常终止
        public static 1ong. currentTimeMli1lis( 返回当前时间(以毫秒为单位)
        arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)数组copy
     */
    public static void main(String[] args) {
        System.out.println(123);
        // System.exit(0);
        System.out.println(456);
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        // arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)数组copy
        int[] a = {1, 2, 3, 4};
        int[] b = new int[9];
        System.arraycopy(a, 0, b, 1, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
