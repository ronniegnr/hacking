package bd.com.ronnie.hacking.leetcode.word_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        boolean result = true;
        String[] strs = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (strs.length != pattern.length()) {
            result = false;
            return result;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strs[i];
            if (map.containsValue(str)) {
                if (!str.equals(map.get(c))) {
                    result = false;
                    break;
                }
            } else {
                if (map.containsKey(c)) {
                    result = false;
                    break;
                } else {
                    map.put(c, str);
                }
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/word-pattern/