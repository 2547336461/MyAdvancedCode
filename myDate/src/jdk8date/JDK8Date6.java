package jdk8date;

import java.time.LocalDateTime;

public class JDK8Date6 {
    /*
    public LocalDateTime plusYears(long years)          添加或者减去年
    public LocalDateTime plusMonths(long months)        添加或者减去月
    public LocalDateTime plusDays(long days)            添加或者减去日
    public LocalDateTime plusHours(long hours)          添加或者减去时
    public LocalDateTime plusMinutes(long minutes)      添加或者减去分
    public LocalDateTime plusSeconds(long seconds)      添加或者减去秒
    public LocalDateTime plusWeeks(long weeks)          添加或者减去周

    public LocalDateTime minusYears (long years)        减去或者添加年
    public LocalDateTime minusMonths(long months)       减去或者添加月
    public LocalDateTime minusDays(long days)           减去或者添加日
    public LocalDateTime minusHours(long hours)         减去或者添加时
    public LocalDateTime minusMinutes(ong minutes)      减去或者添加分
    public LocalDateTime minusSeconds(long seconds)     减去或者添加秒
    public LocalDateTime minusWeeks(long weeks)         减去或者添加周

    public LocalDateTime withYear(int year)             直接修改年
    public LocalDateTime withMonth(int month)           直接修改月
    public LocalDateTime withDayOfMonth(int dayOfMonth) 直接修改日期(一个月中的第几天)
    public LocalDateTime withDayOfYear(int dayOfYear)   直接修改日期(一年中的第几天)
    public LocalDateTime withHour(int hour)             直接修改小时
    public LocalDateTime withMinute(int minute)         直接修改分钟
    public LocalDateTime withSecond(int second)         直接修改秒

     */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 13, 14, 15, 16);

        LocalDateTime newLocalDateTime = localDateTime.plusYears(1); // 参数可以正数也可以负数
        System.out.println(newLocalDateTime);

        newLocalDateTime = newLocalDateTime.minusYears(2);
        System.out.println(newLocalDateTime);

        newLocalDateTime = newLocalDateTime.withYear(2048); //注意参数范围
        System.out.println(newLocalDateTime);
    }
}
