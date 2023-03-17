package bd.com.ronnie.hacking.leetcode.longest_common_prefix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[] strs = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            strs[i] = scanner.nextLine();
        }

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {

        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/longest-common-prefix/