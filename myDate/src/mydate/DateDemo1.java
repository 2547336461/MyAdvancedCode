package mydate;

import java.util.Date;

public class DateDemo1  {
    public static void main(String[] args) {
        // 把当前时间封装成一个Date对象
        Date date = new Date();
        System.out.println(date);

        // 把从时间原点经历了指定0毫秒的时间，封装成date对象，需要考虑时差问题
        Date date1 = new Date(0L);
        System.out.println(date1);

        Date date2 = new Date(3600L * 1000);
        System.out.println(date2);
    }
}
