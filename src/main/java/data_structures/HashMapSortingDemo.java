package data_structures;

import java.util.*;

/**
 * Using a TreeMap
 * Using an ArrayList
 * Using lambdas and streams
 */
public class HashMapSortingDemo {

    public static void main(String args[]) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Alex");
        employeeMap.put(342, "Ryan");
        employeeMap.put(143, "Joe");
        employeeMap.put(234, "Allen");
        employeeMap.put(432, "Roy");

        System.out.println("Unsorted map " + employeeMap);

        // Using TreeMap
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(employeeMap);
        System.out.println("Sorted map " + sortedMap);

        // Using ArrayList
        List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
        Collections.sort(keyList);
        System.out.println(keyList);

        List<String> valuesList = new ArrayList<>(employeeMap.values());
        Collections.sort(valuesList);
        System.out.println(valuesList);

        // Using lambdas and streams
        System.out.println("Sorting by key");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting by value");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
