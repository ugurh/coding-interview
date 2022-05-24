package leetcode;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};

        System.out.println(solveUsingMap(nums));

        System.out.println(solveUsingXor(nums));

        System.out.println(solveBinarySearch(nums));
    }


    static int solveUsingMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) == 1)
                return k;
        }

        return -1;
    }

    static int solveUsingXor(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    static int solveBinarySearch(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int len = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 0)
                mid++;
            if (mid + 1 < len && mid >= 0) {
                if (arr[mid] == arr[mid + 1])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return arr[left];
    }
}
