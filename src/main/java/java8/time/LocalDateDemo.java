package java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

    public static void main(String[] args) {
        // now() method will return the current date.
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // of(int year, int month, int dayOfMonth)
        date = LocalDate.of(2019, 05, 03);
        System.out.println(date);

        // of(int year, Month month, int dayOfMonth)
        date = LocalDate.of(2019, Month.AUGUST, 03);
        System.out.println(date);

        // parse(CharSequence text)
        date = LocalDate.parse("2015-02-12");
        System.out.println(date);

        // parse(CharSequence text, DateTimeFormatter formatter)
        date = LocalDate.parse("12/02/2012", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date);

        // Adding 4 days to the given date.
        date = LocalDate.parse("2015-02-12").plusDays(4);
        System.out.println(date);

        // Adding 4 months to the given date.
        date = LocalDate.parse("2015-02-12").plus(4, ChronoUnit.MONTHS);
        System.out.println(date);

        DayOfWeek dayOfWeek = LocalDate.parse("2017-04-06").getDayOfWeek();

        System.out.println(dayOfWeek);

        // Using isBefore() to check if the date is before a given date.
        boolean isBefore = LocalDate.parse("2020-03-12")
                .isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);

        // Using isAfter() to check if the date is after a given date.
        boolean isAfter = LocalDate.parse("2020-03-12")
                .isAfter(LocalDate.parse("2018-06-14"));
        System.out.println(isAfter);
    }
}
