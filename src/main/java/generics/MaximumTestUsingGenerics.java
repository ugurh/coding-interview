package generics;

public class MaximumTestUsingGenerics {

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, MaximumTest.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, MaximumTest.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange", MaximumTest.maximum("pear", "apple", "orange"));
    }

    public static <T extends Comparable> T maximum(T t1, T t2, T t3) {

        T max = t1;

        if (t2.compareTo(max) > 0)
            max = t2;

        if (t3.compareTo(max) > 0)
            max = t3;

        return max;
    }
}
