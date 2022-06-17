package java_8.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        //Adding items
        items.add(new Item("Apples", 200));
        items.add(new Item("Banana", 150));
        items.add(new Item("Mango", 300));

        items.stream()
                .filter(p -> p.price > 180) // filtering price
                .map(pm -> pm.price) // fetching price
                .forEach(System.out::println); // iterating price
    }
}

class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
