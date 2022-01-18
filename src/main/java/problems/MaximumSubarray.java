package problems;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubarray {

    /*
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public static int maxSubArray(int[] nums) {
        int max_min = Integer.MIN_VALUE, max_max = 0;

        for (int i = 0; i < nums.length; i++) {
            max_max = max_max + nums[i];
            if (max_min < max_max)
                max_min = max_max;
            if (max_max < 0)
                max_max = 0;
        }
        return max_min;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
