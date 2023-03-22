package jdk8date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8Date5 {
    public static void main(String[] args) {
        method1();
        String strTime = "2020年11月12日 13时14分15秒";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        LocalDateTime parse = LocalDateTime.parse(strTime, pattern);
        System.out.println(parse);
    }

    private static void method1() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        System.out.println(localDateTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String formatStr = localDateTime.format(pattern);
        System.out.println(formatStr);
    }
}
