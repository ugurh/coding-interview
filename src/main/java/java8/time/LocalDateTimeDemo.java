package java8.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

    public static void main(String args[]) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);


        // of(int year, int month, int dayOfMonth, int hour, int minute)
        date = LocalDateTime.of(2019, 05, 03, 12, 34);
        System.out.println(date);

        // of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        date = LocalDateTime.of(2019, Month.AUGUST, 03, 23, 34);
        System.out.println(date);

        // parse(CharSequence text)
        date = LocalDateTime.parse("2020-06-20T07:54:00");
        System.out.println(date);

        // Adding 4 days to given date and time.
        date = LocalDateTime.parse("2020-05-12T08:30:00").plusDays(4);
        System.out.println(date);

        // Adding 4 months to given date and time.
        date = LocalDateTime.parse("2020-05-12T08:30:00").plus(4, ChronoUnit.MONTHS);
        System.out.println(date);

        // Subtracting 4 months from given date and time.
        date = LocalDateTime.parse("2020-05-12T08:30:00").minusMonths(4);
        System.out.println(date);

    }
}
