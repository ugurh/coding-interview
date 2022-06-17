package java_8.filter;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(-5, 5, -6, 6, 1);
        // Finding sum of all elements
        int sum = array.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);
    }
}
