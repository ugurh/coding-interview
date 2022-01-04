package data_structures;

/**
 * Challenge 5: Find Minimum Value in Array
 * Given an array of size "n", can you find the minimum value in the array
 * Sample Input #
 * arr = {9, 2, 3, 6}
 * Sample Output #
 * 2
 * Time Complexity #
 * Since the entire list is iterated over once, this algorithm is in linear time, O(n).
 */
public class FindMinimumValue {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6, -1};
        System.out.println(findMinimum(arr));
    }


    public static int findMinimum(int[] arr) {

        if (arr == null || arr.length == 0)
            return 0;

        if (arr.length == 1)
            return arr[0];

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { //O(n)
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

}
