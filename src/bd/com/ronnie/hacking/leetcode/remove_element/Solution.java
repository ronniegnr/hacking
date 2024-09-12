package bd.com.ronnie.hacking.leetcode.remove_element;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }

        System.out.println(nums);

        return result;
    }

}

// https://leetcode.com/problems/remove-element/description/
