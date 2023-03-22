package mydate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String str = "2022-09-17 19:53:08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(str);
        System.out.println(parse);

    }
}
