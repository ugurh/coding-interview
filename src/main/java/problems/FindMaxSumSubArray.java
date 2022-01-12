package problems;

/**
 * Find the Sum of Maximum Sum Subarray
 * This review discusses the solution of the Find Maximum Subarray Sum Challenge in detail.
 * The basic idea of Kadane’s algorithm is to scan the entire array and at each position
 * find the maximum sum of the subarray ending there.
 * This is achieved by keeping a currMax for the current array index and a globalMax.
 * The algorithm is as follows:
 *
 * currMax = A[0]
 * globalMax = A[0]
 * for i = 1 -> size of A
 *     if currMax is less than 0
 *         then currMax = A[i]
 *     otherwise
 *         currMax = currMax + A[i]
 *     if globalMax is less than currMax
 *         then globalMax = currMax
 *
 * The solution above only finds the maximum contiguous sum in the array; however,
 * it can easily be modified to track the starting and ending indexes of this subarray.
 *
 * Runtime complexity#
 * The runtime complexity of this solution is linear, O(n).
 *
 * Space complexity#
 * The space complexity of this solution is constant, O(1).
 *
 * Let’s run through an example to understand how it works.
 * Initially, the currMax and globalMax are both set to the value at A[0], that is, -4:
 */
public class FindMaxSumSubArray {

    public static int findMaxSumSubArray(int[] arr) {
        int currMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currMax < 0) {
                currMax = arr[i];
            } else {
                currMax += arr[i];
            }
            if (globalMax < currMax) {
                globalMax = currMax;
            }
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -13, -2, -4};
        int result = findMaxSumSubArray(arr);
    }
}
