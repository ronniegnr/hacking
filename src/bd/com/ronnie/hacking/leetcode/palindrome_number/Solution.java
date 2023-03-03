package bd.com.ronnie.hacking.leetcode.palindrome_number;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean result = isPalindrome(x);

        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

//https://leetcode.com/problems/palindrome-number/
