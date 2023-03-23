package bd.com.ronnie.hacking.leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> values = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < length - 1) {
                char nextc = s.charAt(i + 1);
                if (c == 'I' && nextc == 'V') {
                    result += 4;
                } else if (c == 'I' && nextc == 'X') {
                    result += 9;
                } else if (c == 'X' && nextc == 'L') {
                    result += 40;
                } else if (c == 'X' && nextc == 'C') {
                    result += 90;
                } else if (c == 'C' && nextc == 'D') {
                    result += 400;
                } else if (c == 'C' && nextc == 'M') {
                    result += 900;
                } else {
                    result += values.get(c);
                    i--;
                }
                i++;
            } else {
                result += values.get(c);
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/roman-to-integer/
