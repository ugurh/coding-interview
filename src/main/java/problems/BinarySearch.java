package problems;

/**
 * Implement Binary Search on a Sorted Array
 * Given a sorted array of integers, return the index of the given key. Return -1 if the key is not found.
 * -------------------------------------------------------------------------------------------------------
 * Solution 2: recursive #
 * Runtime complexity #
 * The runtime complexity of this solution is logarithmic, O(logn)
 * <p>
 * Memory complexity#
 * The memory complexity of this solution is constant O(1).
 * -------------------------------------------------------------------------------------------------------
 * Solution 2: iterative#
 * Runtime complexity#
 * The runtime complexity of this solution is logarithmic, O(logn)
 * <p>
 * The iterative solution has the same O(log n) runtime complexity as the recursive solution
 * but has a better memory complexity
 * Memory complexity #
 * The memory complexity of this solution is logarithmic,O(log n).
 */
public class BinarySearch {

    static int solution1(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    int binSearch2(int A[], int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (A[mid] == key) {
            return mid;
        }

        if (key < A[mid]) {
            return binSearch2(A, key, low, mid - 1);
        }

        return binSearch2(A, key, mid + 1, high);
    }

    int solution2(int A[], int key, int len) {
        return binSearch2(A, key, 0, len - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100};
        int result = solution1(arr, 12);
        System.out.println(result);
    }
}
