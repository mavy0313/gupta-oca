package chapter4.calendardata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, 12, 27);
        LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);

        System.out.println(date1);
        System.out.println(date2);

        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");
        System.out.println(shreyaBday.isAfter(paulBday));
        System.out.println(shreyaBday.isBefore(paulBday));
        System.out.println(shreyaBday.isBefore(shreyaBday));

        LocalDate bday = LocalDate.of(2052,03,10);
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));

        LocalDate launchCompany = LocalDate.of(2016,02,29);
        System.out.println(launchCompany.plusDays(1));
        System.out.println(launchCompany.plusMonths(1));
        System.out.println(launchCompany.plusWeeks(7));
        System.out.println(launchCompany.plusYears(1));

        LocalDate firstSex = LocalDate.of(2036,02,28);
        System.out.println(firstSex.withDayOfMonth(1));
        System.out.println(firstSex.withDayOfYear(1));
        System.out.println(firstSex.withMonth(7));
        System.out.println(firstSex.withYear(1));

        System.out.println();

        LocalDate interviewDate = LocalDate.of(2016,02,28);
        System.out.println(interviewDate.atTime(16, 30));
        System.out.println(interviewDate.atTime(16, 30, 20));
        System.out.println(interviewDate.atTime(16, 30, 20, 300));
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));

        System.out.println();

        LocalDate launchBook = LocalDate.of(2016,2,8);
        LocalDate aDate = LocalDate.of(1970,1,8);
        System.out.println(launchBook.toEpochDay());
        System.out.println(aDate.toEpochDay());

        System.out.println();

        LocalTime timeHrsMin = LocalTime.of(12, 12);
        LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
        LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);

        LocalTime date3 = LocalTime.now();
        LocalTime time = LocalTime.parse("15:08:23");

        LocalTime time2 = LocalTime.of(16, 20, 12, 98547);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
        System.out.println(time2.getNano());

        LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
        LocalTime paulFinishTime = LocalTime.parse("17:09:12");
        if(shreyaFinishTime.isBefore(paulFinishTime))
            System.out.println("Shreya wins");
        else
            System.out.println("Paul wins");

        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println("Start by " + shreyaStartTime + " from office");

        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");

        LocalTime startTime = LocalTime.of(5, 7, 9);
        if (startTime.getMinute() < 30)
            startTime = startTime.withMinute(0);
        System.out.println(startTime);

        LocalTime time4 = LocalTime.of(14, 10, 0);
        LocalDate date4 = LocalDate.of(2016,02,28);
        LocalDateTime dateTime = time4.atDate(date4);
        System.out.println(dateTime);
    }
}
