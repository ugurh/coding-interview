package data_structures;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedHashMapDemo {

    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 123);
        map.put("BMW", 54);
        map.put("Google", 87);
        map.put("Microsoft", 232);
        map.put("Oracle", 76);
        System.out.println(map);

        HashMap<String, Integer> stocks = new LinkedHashMap<>();
        stocks.put("Apple", 123);
        stocks.put("BMW", 54);
        stocks.put("Google", 87);
        stocks.put("Microsoft", 232);
        stocks.put("Oracle", 76);
        System.out.println(stocks);

        HashMap<String, Integer> stocks1 = new LinkedHashMap<>(16, 0.75f, true);
        stocks1.put("Apple", 123);
        stocks1.put("BMW", 54);
        stocks1.put("Google", 87);
        stocks1.put("Microsoft", 232);
        stocks1.put("Oracle", 76);
        System.out.println(stocks1);
        stocks1.get("Google");
        stocks1.get("BMW");
        System.out.println(stocks1);

    }
}
