package mydate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo5 {
    /*
        开始时间:2020年11月11日0:0:0
        结束时间:2020年11月11日 0:10:0
        小贾:2020年11月11日0:03:47
        小皮:2020年11月11日0:10:11
     */
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date parseStart = simpleDateFormat.parse(start);
        Date parseEnd = simpleDateFormat.parse(end);
        Date parseJia = simpleDateFormat.parse(jia);
        Date parsePi = simpleDateFormat.parse(pi);

        long timeS = parseStart.getTime();
        long timeE = parseEnd.getTime();
        long timeJ = parseJia.getTime();
        long timeP = parsePi.getTime();
        if (timeS <= timeJ && timeJ <= timeE){
            System.out.println("jia: True");
        }else {
            System.out.println("False");
        }
        if (timeS <= timeP && timeP <= timeE){
            System.out.println("Pi: True");
        }else {
            System.out.println("Pi: False");
        }
    }
}
