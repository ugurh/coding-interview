package data_structures;

import java.util.EnumMap;
import java.time.DayOfWeek;

public class EnumMapDemo {

    public static void main(String args[]) {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);

        // Putting records in EnumMap
        enumMap.put(DayOfWeek.MONDAY, 5);
        enumMap.put(DayOfWeek.WEDNESDAY, 15);

        // Fetching the value from MONDAY
        System.out.println(enumMap.get(DayOfWeek.MONDAY));

        // Removing WEDNESDAY from the Map
        enumMap.remove(DayOfWeek.WEDNESDAY);
    }
}