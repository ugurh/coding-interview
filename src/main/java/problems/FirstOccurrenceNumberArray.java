package problems;

public class FirstOccurrenceNumberArray {

    private static int firstOccurrence(int[] array, int num, int i) {
        if (array.length == i)
            return -1;
        else if (array[i] == num)
            return i;
        else
            return firstOccurrence(array, num, i + 1);
    }

    public static void main(String[] args) {
        System.out.print("{");

        int[] array = {2, 3, 4, 1, 7, 8, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");

        int num = 4;

        int result = firstOccurrence(array, num, 0);
        System.out.println("The first occurrence of the number " + num + " is at index: " + result);
    }

}
