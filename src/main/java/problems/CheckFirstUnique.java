package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Challenge 6: First Non-Repeating Integer in an Array
 * Given an array, find the first integer, which is unique in the array.
 * Unique means the number does not repeat and appears only once in the whole array.
 * Implement your solution in Java and see if it runs correctly!
 * Sample Input #
 * arr = {9, 2, 3, 2, 6, 6}
 * Sample Output #
 * 9
 * Time Complexity #
 *  - solution1 is O(n^2)
 *  - solution2 is O(n)
 *
 */
public class CheckFirstUnique {

    public static int solution1(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n)
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) { // O(n)
                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return arr[i];
            }
        }
        return -1;
    }

    // O(n)
    public static int solution2(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>(); // O(1)
        for (int i = 0; i < arr.length; i++) {  // O(n)
            if(map.containsKey(arr[i])){
                map.put(arr[i],  map.get(arr[i]) + 1);
            }else
                map.put(arr[i], 1);
        }

        for (int i = 0; i < arr.length; i++) {  // O(n)
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,3};
        System.out.println(solution2(arr));
    }
}
