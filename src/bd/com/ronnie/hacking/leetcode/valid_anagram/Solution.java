package bd.com.ronnie.hacking.leetcode.valid_anagram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        boolean result = true;

        int[] frequency = new int[26];
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/valid-anagram/
