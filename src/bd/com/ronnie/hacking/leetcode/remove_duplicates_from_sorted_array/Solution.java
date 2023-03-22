package bd.com.ronnie.hacking.leetcode.remove_duplicates_from_sorted_array;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
        //int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
