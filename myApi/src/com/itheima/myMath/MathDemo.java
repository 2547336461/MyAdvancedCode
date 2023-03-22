package com.itheima.myMath;

public class MathDemo {
    /*
        pub1ic static int abs(int a)                    返回参数的绝对值
        pub1ic static double ceil (double a)            向上取整
        public static double floor (double a)           向下取整
        pub1ic static int round(float a)                四舍五入
        pub1ic static int max(int a, int b)             返口两个int值中的较大值
        public static int min(int a, int b)             返回两个int值中的较小值
        public static double pow(double a, double b)    返回a的b次幂的值
        pub1ic static double random()                   返回值为double的正值，[0.0, 1.0)
     */
    public static void main(String[] args) {
        int abs = Math.abs(-10);
        System.out.println(-10+"的绝对值为："+abs);
        double ceil = Math.ceil(12.339);
        System.out.println("12.339向上取整为："+ceil);
        double floor = Math.floor(238.398);
        System.out.println("238.398向下取整为："+floor);
        long round = Math.round(12.34);
        System.out.println("12.34四舍五入为："+round);
        int max = Math.max(12, 32);
        System.out.println("较大值为：" + max);
        double min = Math.min(123.34, 34.5);
        System.out.println("较小值为：" + min);
        double pow = Math.pow(2, 10);
        System.out.println("2的10次幂的值为："+pow);
        for (int i = 0;i<10 ;i++) {
            double random = Math.random();
            System.out.println(random+"\t\t\t范围为[0.0, 1.0)");
        }
    }
}
