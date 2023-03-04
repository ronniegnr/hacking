package bd.com.ronnie.hacking.leetcode.valid_parentheses.Solution;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    a++;
                    break;
                case ')':
                    a--;
                    break;
                case '{':
                    b++;
                    break;
                case '}':
                    b--;
                    break;
                case '[':
                    c++;
                    break;
                case ']':
                    c--;
                    break;
            }
        }

        if (a == 0 && b == 0 && c == 0) {
            return true;
        } else {
            return false;
        }
    }

}

// https://leetcode.com/problems/valid-parentheses/
