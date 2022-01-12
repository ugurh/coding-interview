package problems;

/**
 * Challenge 9: Re-arrange Positive & Negative Values
 * Given an array, can you re-arrange its elements in such a way that
 * the negative elements appear at one side
 * and positive elements appear at the other?
 * Solve this problem in Java and see if your code runs correctly!
 * Sample Input #
 * arr = {10, -1, 20, 4, 5, -9, -6}
 * Sample Output #
 * arr = {-1, -9, -6, 10, 20, 4, 5}
 * Time Complexity#
 * The time complexity of this algorithm is O(n),
 * with no extra space used as the entire array is iterated over once.
 */
public class CheckReArrange {

    public static void reArrange(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) { // O(n)
            if (arr[i] < 0 && i != idx) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
            idx++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        reArrange(arr);
    }

}
