package data_structures;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String args[]) {

        // Creating a TreeMap which will store all the elements in reverse order.
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put("Oracle", 43);
        reverseMap.put("Microsoft", 56);
        reverseMap.put("Apple", 43);
        reverseMap.put("Novartis", 87);
        System.out.println("Elements are stored in reverse order: " + reverseMap);

        // Creating a HashMap which will store all the elements in random order.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);
        System.out.println("Elements are stored in random order: " + hashMap);

        // Creating a TreeMap using existing HashMap. This will store the elements in ascending order.
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
        System.out.println("Elements are stored in ascending order: " + treeMap1);

        // Creating a TreeMap using existing TreeMap. This will store the elements in the same order as it was in the passed Map.
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(reverseMap);
        System.out.println("Elements are stored in descending order: " + treeMap2);

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 43);
        map.put("Novartis", 87);
        System.out.println(map);

        TreeMap<String, Integer> finalMap = new TreeMap<>();
        map.put("Google", 65);
        map.put("Audi", 32);
        map.put("BMW", 32);
        finalMap.putAll(map);
        System.out.println(finalMap);

        //Fetching the first entry in the Map.
        Map.Entry<String, Integer> firstEntry = map.firstEntry();
        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());
        //Fetching the last entry in the Map.
        Map.Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        System.out.println("Removing Oracle from Map. This will return the value corresponding to Oracle: " +
                map.remove("Oracle"));
        System.out.println("Removing Googlex from Map. This will return null as Googlex is not present in the Map: " +
                map.remove("Googlex"));

        System.out.println(map);

        System.out.println("Replacing the value of Oracle : " + map.replace("Oracle", 67));
        System.out.println("Latest value of Oracle : " + map.get("Oracle"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + map.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " + map.replace("Apple", 76, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("------------------------");
        System.out.println(map);
        System.out.println(sortByValues(map));

    }


    public static TreeMap<String, Integer> sortByValues(TreeMap<String, Integer> map) {
        // return comparison results of values of two keys
        Comparator<String> valueComparator = (k1, k2) -> {
            int comp = map.get(k1).compareTo(map.get(k2));
            /**
             * we are returning 1 if both the values are the same.
             * The reason for doing this is that if two values are the same,
             * then the TreeMap will consider it as duplicate,
             * and it will not insert the keys in the Map.
             */
            if (comp == 0)
                return 1;
            else
                return comp;
        };

        TreeMap<String, Integer> mapSortedByValues = new TreeMap<>(valueComparator);

        mapSortedByValues.putAll(map);
        return mapSortedByValues;
    }

    public static TreeMap<String, Integer> sortByValuesWithLambdaExp(TreeMap<String, Integer> map) {
        Comparator<String> valueComparator = (k1, k2) -> {
            int comp = map.get(k1).compareTo(map.get(k2));
            if (comp == 0)
                return 1;
            else
                return comp;
        };
        TreeMap<String, Integer> mapSortedByValues = new TreeMap<>(valueComparator);
        mapSortedByValues.putAll(map);
        return mapSortedByValues;
    }
}