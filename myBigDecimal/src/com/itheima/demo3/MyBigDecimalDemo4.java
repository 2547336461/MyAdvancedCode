package com.itheima.demo3;

import java.math.BigDecimal;

public class MyBigDecimalDemo4 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("1");
        BigDecimal bd2 = new BigDecimal("0.3");
        // 由于是精确运算 除不尽会报错
        // System.out.println(bd1.divide(bd2));

        /*
        参数一:表示参数运算的另一个对象
        参数二:表示小数点后精确到多少位
        参数三:舍入模式
        进一法: BigDecimal.ROUND_UP
        去尾法: BigDecimal.ROUND_FLOOR
        四舍五入 BigDecimal.ROUND_HALF_UP

         */
        BigDecimal divide = bd1.divide(bd2, 2, BigDecimal.ROUND_UP);
        System.out.println("进一法：" + divide);
        BigDecimal divide2 = bd1.divide(bd2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println("去尾法：" + divide2);
        BigDecimal divide3 = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("四舍五入发：" + divide3);
    }
}
