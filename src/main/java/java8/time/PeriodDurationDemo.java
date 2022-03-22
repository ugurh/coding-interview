package java8.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationDemo {

    public static void main(String[] args) {

        Period period = Period.ofDays(5);  // Period of 5 days.
        System.out.println(period.getDays());

        period = Period.ofMonths(3);  // Period of 3 months.
        System.out.println(period.getMonths());

        period = Period.ofYears(2);  // Period of 2 Years
        System.out.println(period.getYears());


        period = Period.of(2, 5, 12); // Period of 2 Years, 5 Months and 12 Days.
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        period = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
        System.out.println(period);

        period = Period.between(LocalDate.parse("2017-04-17"), LocalDate.parse("2020-05-18"));
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("The difference between two dates is " + years + " Years, " + months + " Months and " + days + " Days");


        Duration duration = Duration.ofDays(1);  // Created a duration of 1 day.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in a day.

        duration = Duration.ofHours(2);  // Created a duration of 2 hours.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 2 hours.

        duration = Duration.ofMinutes(23);  // Created a duration of 23 minutes.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 23 minutes.

        duration = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration.getSeconds() + " seconds");

        duration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));
        System.out.println("The difference is " + duration.getSeconds() + " Seconds");

    }
}
