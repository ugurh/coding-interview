package data_structures;

import java.util.*;

public class HashMapDemo {

    public static void main(String args[]) {
        Map<String, Integer> stockPrice = new HashMap<>();

        // Inserting share price of Oracle in the Map.
        stockPrice.put("Oracle", 56);
        System.out.println(stockPrice);

        // Inserting share price of Oracle again. This will update the value.
        stockPrice.put("Oracle", 60);
        System.out.println(stockPrice);

        // Inserting share price of Oracle again using putIfAbsent() method.
        // This will not update the value.
        stockPrice.putIfAbsent("Oracle", 70);
        System.out.println(stockPrice);

        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        // This will return null.
        System.out.println(stockPrice.get("Google"));

        // Since Google is not present in our Map,
        // this will insert it with default value of 100.
        System.out.println(stockPrice.getOrDefault("Google", 100));

        // This will not replace the value of Oracle because current value is not 70.
        stockPrice.replace("Oracle", 70, 76);
        System.out.println(stockPrice.get("Oracle"));

        // This will replace the value of Oracle because current value is 60.
        stockPrice.replace("Oracle", 60, 76);
        System.out.println(stockPrice.get("Oracle"));

        // This will replace the value of Fiserv as current value does not matter.
        stockPrice.replace("Fiserv", 100);
        System.out.println(stockPrice.get("Fiserv"));

        // Using the replaceAll() method to add 10 to the price of each stock.
        stockPrice.replaceAll((k, v) -> v + 10);
        System.out.println(stockPrice);

        //This will remove Oracle from the Map and return 86.
        System.out.println(stockPrice.remove("Oracle"));

        //This will return null as Google is not present in the Map.
        System.out.println(stockPrice.remove("Google"));

        //This will return false because the value passed does not match the value of BMW in the Map.
        System.out.println(stockPrice.remove("BMW", 45));

        System.out.println("HashMap Keys");
        Set<String> keys = stockPrice.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap Values");
        Collection<Integer> values = stockPrice.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        System.out.println(stockPrice.isEmpty());

        // This will increment the value of Microsoft by 1 as it is present in the Map
        stockPrice.compute("Microsoft", (k, v) -> v == null ? 10 : v + 1);

        // This will insert Oracle in the Map with default value of 10.
        stockPrice.compute("Oracle", (k, v) -> v == null ? 10 : v + 1);

        stockPrice.computeIfAbsent("Meta", k -> k.length());
        stockPrice.computeIfAbsent("Oracle", k -> k.length());

        stockPrice.computeIfPresent("Ebay", (k, v) -> v == null ? 10 : v + 1);
        stockPrice.computeIfPresent("Meta", (k, v) -> v == null ? 10 : v + 1);

        System.out.println(stockPrice);


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jay", 5000);
        map1.put("Rahul", 3000);
        map1.put("Nidhi", 4500);
        map1.put("Amol", 60000);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Jay", 7000);
        map2.put("Rahul", 4500);
        map2.put("Nidhi", 1200);
        map2.put("Saurav", 25000);

        map1.forEach((key, value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));
        System.out.println(map2);


        Employee emp1 = new Employee(123, "Jane");
        Employee emp2 = new Employee(123, "Jane");

        Map<Employee, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);
        employeeMap.put(emp2, 45000);

        for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName);
        }

        emp1.empName = "Alex";

        System.out.println(employeeMap.get(emp1));

        Set<Map.Entry<String, Integer>> entrySet = stockPrice.entrySet();
        // Returns a Set of Entries
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Company:" + entry.getKey() + ", Price:" + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator(); //Getting the iterator

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());

            if (entry.getKey().equals("Oracle")) {
                itr.remove();
            }
        }
        System.out.println(stockPrice);


        stockPrice.forEach((key, value) ->
                System.out.println("Company Name: " + key + " Stock Price: " + value));

        int max = 0;
        String company = "";

        for(Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            if(entry.getValue() > max) {
                company = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println("Company with max stock price is: " + company);
    }
}
