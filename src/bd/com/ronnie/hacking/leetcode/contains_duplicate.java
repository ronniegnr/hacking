package bd.com.ronnie.hacking.leetcode;

import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsHashSet = new HashSet<>();
        for (int num : nums) {
            if (!numsHashSet.add(num)) {
                return true;
            }
        }

        return false;
    }
}

// https://leetcode.com/problems/contains-duplicate/