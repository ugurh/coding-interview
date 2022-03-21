package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SlicingOperations {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Turkey");
        countries.add("India");
        countries.add("UK");
        countries.add("Turkey");

        countries.stream()
                .distinct()
                .forEach(System.out::println);

        countries.stream()
                .distinct()
                .skip(2)
                .limit(1)
                .forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int totalSum = list.stream()
                .reduce(5, (partialSum, num) -> partialSum + num);

        System.out.println("Total Sum is " + totalSum);

        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Max value is " + max.get());

        Optional<Integer> min = list.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Min value is " + min.get());
    }
}
