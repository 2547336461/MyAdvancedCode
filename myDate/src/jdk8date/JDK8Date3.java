package jdk8date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class JDK8Date3 {
    /*
        public int getYear()            获取年
        public int getMonthValue()      获取月份( 1-12 )
        public int getDayOfMonth()      获取月份中的第几天( 1-31 )
        public int getDayOfYear()       获取一年中的第几天( 1-366 )
        public DayOfWeek getDayOfWeek() 获取星期
        public int getMinute()          获取分钟
        public int getHour()            获取小时

     */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11,11);
        int year = localDateTime.getYear();
        System.out.println("年份为：" + year);
        int localDateTimeMonthValue = localDateTime.getMonthValue();
        System.out.println("月份为：" + localDateTimeMonthValue);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("日份为："+dayOfMonth);
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("一年中的第"+dayOfYear+"天");
        // DayOfWeek （枚举类型）
        DayOfWeek localDateTimeDayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(localDateTimeDayOfWeek);
        int hour = localDateTime.getHour();
        System.out.println("小时" + hour);
        int minute = localDateTime.getMinute();
        System.out.println("分钟"+minute);
        int second = localDateTime.getSecond();
        System.out.println("秒"+second);
    }
}
