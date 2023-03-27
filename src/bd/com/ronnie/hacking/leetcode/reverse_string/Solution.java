package bd.com.ronnie.hacking.leetcode.reverse_string;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        reverseString(s.toCharArray());
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        char c;
        for (int i = 0; i < s.length / 2; i++) {
            c = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = c;
        }
    }
}

// https://leetcode.com/problems/reverse-string/
