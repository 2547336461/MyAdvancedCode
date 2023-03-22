package jdk8date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JDK8Date1 {
    public static void main(String[] args) throws ParseException {
        // JDKmMethod();
        String str = "2020年11月11日 00:00:00";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(str, pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
        String format = newLocalDateTime.format(pattern);
        System.out.println(format);
    }

    private static void JDKmMethod() throws ParseException {
        String str = "2020年11月11日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date parseDate1 = sdf.parse(str);
        long time = parseDate1.getTime();
        time += (1000 * 60 * 60 * 24);
        Date newDate = new Date(time);
        String result = sdf.format(newDate);
        System.out.println(result);
    }
}
