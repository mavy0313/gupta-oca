package chapter4.calendardata;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExamples {
    public static void main(String[] args) {
        Period period1 = Period.of(1, 2, 7);
        Period period2 = Period.ofYears(2);
        Period period3 = Period.ofMonths(5);
        Period period4 = Period.ofWeeks(10);
        Period period5 = Period.ofDays(15);
        Period period6 = Period.ofDays(-15);

        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");
        System.out.println(p5Yrs1 + ":" + p5Yrs2);

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");

        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
        Period periodBetween = Period.between(carnivalStart, carnivalEnd);
        System.out.println(periodBetween);

        Period period = Period.of(2,4,40);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        Period days5 = Period.of(0,0,5);
        System.out.println(days5.isZero());
        Period daysMinus5 = Period.of(0,0,-5);
        System.out.println(daysMinus5.isNegative());

        System.out.println();

        Period period10Days = Period.of(0, 0, 10);
        Period period1Month = Period.of(0, 1, 0);
        System.out.println(period10Days.minus(period1Month));
        System.out.println(period10Days.minusDays(5));
        System.out.println(period10Days.minusMonths(5));
        System.out.println(period10Days.minusYears(5));

        System.out.println();

        Period year1Month9Day20 = Period.of(1, 9, 20);
        System.out.println(year1Month9Day20.multipliedBy(2));
        System.out.println(year1Month9Day20.multipliedBy(-2));

        System.out.println();

        Period period5Month = Period.of(0, 5, 0);
        Period period10Month = Period.of(0, 10, 0);
        Period period10Days_2 = Period.of(0, 0, 10);
        System.out.println(period5Month.plus(period10Month));
        System.out.println(period10Days_2.plusDays(35));
        System.out.println(period10Days_2.plusMonths(5));
        System.out.println(period10Days_2.plusYears(5));

        System.out.println(Period.of(10,5,40).toTotalMonths());
    }
}
