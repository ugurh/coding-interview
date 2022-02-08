package problems;

public class FindingMaxInArray {

    public static void main(String[] args) {
        Integer arr1[] = {2, 8, 20, 3, 4};
        Double arr2[] = {2.7, 3.8, 5.5, 6.7, 9.7};
        Person arr3[] = {
                new Person("Harun"),
                new Person("Veli"),
                new Person(null),
                null
        };

        System.out.println(findMaximum(arr1));
        System.out.println(findMaximum(arr2));
        System.out.println(findMaximum(arr3).getName());

    }

    public static <T extends Comparable> T findMaximum(T[] arr) {
        if (arr == null)
            return null;

        if (arr.length == 1)
            return arr[0];

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
