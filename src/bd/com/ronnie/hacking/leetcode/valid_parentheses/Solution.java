package bd.com.ronnie.hacking.leetcode.valid_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.empty() && (c - 1 == stack.peek() || c - 2 == stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }

}

// https://leetcode.com/problems/valid-parentheses/
