package data_structures;

/**
 * Challenge 8: Right Rotate the Array by One Index
 * Given an array, can you rotate its elements once from right to left?
 * Implement your solution in Java and see if your code runs successfully!
 * Sample Input #
 * arr = {1, 2, 3, 4, 5}
 * Sample Output #
 * arr = {5, 1, 2, 3, 4}
 * Time Complexity
 *   - O(n)
 */
public class CheckRotateArray {

    public static void rotateArray(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr);
        System.out.println(arr);
    }

}
