package mydate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        // 当前时间的Date对象
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
        String format1 = sdf1.format(date);
        String format2 = sdf2.format(date);
        String format3 = sdf3.format(date);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
}
