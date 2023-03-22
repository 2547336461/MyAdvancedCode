package jdk8date;

import java.time.LocalDate;
import java.time.Period;

public class JDK8Date9 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2020, 11, 22);
        LocalDate localDate2 = LocalDate.of(2035, 01, 01);
        Period betweenPeriod = Period.between(localDate1, localDate2);
        System.out.println(betweenPeriod); // P14Y1M10D
        System.out.println(betweenPeriod.getMonths());
        System.out.println(betweenPeriod.getDays());
        System.out.println(betweenPeriod.getYears());
        System.out.println(betweenPeriod.toTotalMonths());
    }
}
