package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
        Complexity Analysis

        Time complexity : O(n^2).
        For each element, we try to find its complement by looping
        through the rest of array which takes O(n) time.
        Therefore, the time complexity is O(n^2)
        Space complexity : O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*
        Complexity Analysis:

        Time complexity : O(n).
        We traverse the list containing nn elements exactly twice.
        Since the hash table reduces the look up time to O(1),
        the time complexity is O(n).

        Space complexity : O(n).
        The extra space required depends on the number of items stored in the hash table,
        which stores exactly nn elements.
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*
        Complexity Analysis:

        Time complexity : O(n).
        We traverse the list containing nn elements only once.
        Each look up in the table costs only O(1) time.

        Space complexity : O(n).
        The extra space required depends on the number of items stored in the hash table,
        which stores at most nn elements.
     */
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
