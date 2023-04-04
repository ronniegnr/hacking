package bd.com.ronnie.hacking.leetcode.two_sum;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
