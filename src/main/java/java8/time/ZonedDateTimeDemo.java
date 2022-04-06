package java8.time;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String args[]) {

        //Fetching the Zoneid for given Zone.
        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println("Zone Id ----> " + zoneId);

        //Fetching a Set of all Zoneids
        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();

        for (String zone : zoneIdList) {
            System.out.println(zone);
        }

        // Fetching the current TimeZone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        // fetching the ZoneId for Canada/Atlantic
        zoneId = ZoneId.of("Canada/Atlantic");

        zonedDateTime =
                ZonedDateTime.of(2020, 10, 15, 23, 45, 59, 1234, zoneId);
        System.out.println(zonedDateTime);


        zonedDateTime = ZonedDateTime.now();

        int year = zonedDateTime.getYear();
        System.out.println("Year is: " + year);

        Month month = zonedDateTime.getMonth();
        System.out.println("Month is: " + year);

        int dayOfMonth = zonedDateTime.getDayOfMonth();
        System.out.println("Day Of Month is: " + dayOfMonth);

        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
        System.out.println("Day of week is: " + dayOfWeek);

        int dayOfYear = zonedDateTime.getDayOfYear();
        System.out.println("Day of year is: " + dayOfYear);

        int hour = zonedDateTime.getHour();
        System.out.println("Hour is: " + hour);

        int minute = zonedDateTime.getMinute();
        System.out.println("Minute is: " + minute);

        int second = zonedDateTime.getSecond();
        System.out.println("Second is: " + second);

        int nano = zonedDateTime.getNano();
        System.out.println("Nano is: " + nano);


        zonedDateTime = ZonedDateTime.now();

        System.out.println("Date after adding Year is: " + zonedDateTime.plusYears(1));
        System.out.println("Date after adding Month is: " + zonedDateTime.plusMonths(1));
        System.out.println("Date after adding days is: " + zonedDateTime.plusDays(15));
        System.out.println("Date after adding hours is: " + zonedDateTime.plusHours(15));
        System.out.println("Date after adding minutes is: " + zonedDateTime.plusMinutes(1));
        System.out.println("Date after adding seconds is: " + zonedDateTime.plusSeconds(15));
        System.out.println("Date after adding nanoseconds is: " + zonedDateTime.plusNanos(15));
        System.out.println("Date after subtracting Year is: " + zonedDateTime.minusYears(1));
        System.out.println("Date after subtracting Month is: " + zonedDateTime.minusMonths(1));
        System.out.println("Date after subtracting days is: " + zonedDateTime.minusDays(15));
        System.out.println("Date after subtracting hours is: " + zonedDateTime.minusHours(15));
        System.out.println("Date after subtracting minutes is: " + zonedDateTime.minusMinutes(1));
        System.out.println("Date after subtracting seconds is: " + zonedDateTime.minusSeconds(15));
        System.out.println("Date after subtracting nanoseconds is: " + zonedDateTime.minusNanos(15));

    }

}
