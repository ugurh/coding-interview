package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
        int[] cc = nums;
        System.out.println(cc);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[count++] = nums[i];
        }

        return count;
    }
}
