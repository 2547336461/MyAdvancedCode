package jdk8date;

import java.time.Duration;
import java.time.LocalDateTime;

public class JDK8Date10 {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 11, 13, 14, 15, 16);
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration);
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
