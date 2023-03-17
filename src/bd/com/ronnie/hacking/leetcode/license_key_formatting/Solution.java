package bd.com.ronnie.hacking.leetcode.license_key_formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String result = licenseKeyFormatting(s, k);
        System.out.println(result);
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();

        int plength = 0;
        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                sb.append(Character.toUpperCase(c));
                plength++;
            }
            if (plength == k) {
                sb.append('-');
                plength = 0;
            }
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb = new StringBuilder(sb.subSequence(0, sb.length() - 1));
        }

        return sb.reverse().toString();
    }
}

// https://leetcode.com/problems/license-key-formatting/
