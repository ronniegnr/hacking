package bd.com.ronnie.hacking.leetcode.plus_one;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int[] results = new int[digits.length];
        int carry = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = 0;
            if (i == digits.length - 1) {
                sum = digits[i] + +1;
            } else {
                sum = digits[i] + carry;
            }
            if (sum == 10) {
                results[i] = 0;
                carry = 1;
            } else {
                results[i] = sum;
                carry = 0;
            }
        }

        if (carry == 1) {
            int[] results2 = new int[digits.length + 1];
            results2[0] = 1;
            for (int i = 1; i < results2.length; i++) {
                results2[i] = results[i - 1];
            }
            results = results2;
        }

        return results;
    }
}

// https://leetcode.com/problems/plus-one/solutions/
