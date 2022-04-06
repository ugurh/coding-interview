package algorithms.brute_force;

/**
 * Time Complexity: O(n)
 * - since we’re checking each element exactly once in the worst case.
 */
public class BruteForce {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 3, 5, 7, 9, 1, 8};
        int min = minimumIndex(nums);
        int max = maximumIndex(nums);
        int toFind = findIndex(nums, 3);

        System.out.println("The MIN number " + nums[min] + " is found at index " + min);
        System.out.println("The MAX number " + nums[max] + " is found at index " + max);
        System.out.println("The number " + nums[toFind] + " is found at index " + toFind);
    }

    private static int maximumIndex(int[] nums) {

        if (nums == null || nums.length == 0) return -1;

        if (nums.length == 1) return 0;

        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    private static int minimumIndex(int[] nums) {

        if (nums == null || nums.length == 0) return -1;

        if (nums.length == 1) return 0;

        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findIndex(int[] array, int toFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}
