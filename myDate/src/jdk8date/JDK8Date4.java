package jdk8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JDK8Date4 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 12, 12, 12, 12, 12);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }
}
