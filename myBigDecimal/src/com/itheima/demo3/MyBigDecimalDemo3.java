package com.itheima.demo3;

import java.math.BigDecimal;

public class MyBigDecimalDemo3 {
    /*
    public BigDecimal add (另一个BigDecimal对象)          加法
    public BigDecimal subtract (另一个BigDecimal对象)    减法
    public BigDecimal multiply (另一个BigDecimal对象)    乘法
    public BigDecimal divide (另一个BigDecimal对象)      除法
     */
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.2);
        BigDecimal add = bd1.add(bd2);
        // 如果要精确运算需要使用字符串构造方法
        System.out.println(add);
        System.out.println(0.1 + 0.2);
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        BigDecimal add1 = bd3.add(bd4);
        System.out.println("和为：" + add1);

        BigDecimal subtract = bd3.subtract(bd4);
        System.out.println("差为：" + subtract);

        System.out.println(bd3.multiply(bd4));

        System.out.println(bd3.divide(bd4));
    }
}
