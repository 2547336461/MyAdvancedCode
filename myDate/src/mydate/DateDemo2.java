package mydate;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
        public 1ong getTime ()          获取时间对象的毫秒值
        public void setTime(1ong time)  设置时间，传递毫秒值
         */
        Date date1 = new Date();
        System.out.println(date1);

        long time1 = date1.getTime();
        System.out.println(time1);
        // 设置时间/修改时间 从时间原点开始
        date1.setTime(3600L * 1000);
        System.out.println(date1);
    }
}
