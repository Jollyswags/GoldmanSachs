package com.example.java.java8.dateandtime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class datetime {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        System.out.println(ld);

        LocalDate ld1= LocalDate.of(2015, 02, 20);
        System.out.println(ld1);


        LocalDate ld2= LocalDate.parse("2015-02-20");
        System.out.println(ld2);

        LocalDate ld3= LocalDate.now().plusDays(1);
        System.out.println(ld3);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println(sunday);

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println(twelve);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);

        LocalTime sixthirty1 = LocalTime.of(6, 30);
        System.out.println(sixthirty1);


        int six = LocalTime.parse("06:30").getHour();
        System.out.println(six);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        allZoneIds.forEach(System.out::println);

        ZonedDateTime lt= ZonedDateTime.of(2020, 12, 3, 12, 20, 59, 90000, ZoneId.systemDefault());
        System.out.println(lt);











    }
}
