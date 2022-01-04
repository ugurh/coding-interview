package data_structures;

/**
 * Challenge 7: Find Second Maximum Value in an Array
 * Given an array of size n, can you find the second maximum element in the array
 * Implement your solution in Java and see if your output matches the correct output!
 * Sample Input #
 * arr = {9,2,3,6}
 * Sample Output #
 * 6
 * Time Complexity #
 * - solution1 is  O(n + n) => O(n)
 * - solution2 is O(n)
 */
public class CheckSecondMax {

    public static int solution1(int[] arr) {

        int maxFirst = 0;
        int maxSecond = 0;
        for (int i = 0; i < arr.length; i++) { // O(n)
            if (arr[i] > maxFirst) {
                maxFirst = arr[i];
            }
            if (arr[i] > maxSecond && arr[i] < maxFirst) {
                maxSecond = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) { // O(n)
            if (arr[i] > maxSecond && arr[i] < maxFirst) {
                maxSecond = arr[i];
            }
        }
        return maxSecond;
    }

    public static int solution2(int[] arr) {
        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // O(n)
            if (arr[i] > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = arr[i];

            } else if (arr[i] > maxSecond && arr[i] != maxFirst) {
                maxSecond = arr[i];
            }
        }
        return maxSecond;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 0};
        System.out.println(solution2(arr));
    }
}
