package jdk8date;

import java.time.LocalDateTime;

public class JDK8Date2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime setTime = LocalDateTime.of(1999, 01, 15, 11, 11, 11);
        System.out.println(setTime);
    }
}
