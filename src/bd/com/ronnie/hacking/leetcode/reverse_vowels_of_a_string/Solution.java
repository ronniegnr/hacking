package bd.com.ronnie.hacking.leetcode.reverse_vowels_of_a_string;

import java.util.Arrays;
import java.util.List;

// not yet solved

public class Solution {
    public static void main(String[] args) {
        String s = "Marge, let's \\\"went.\\\" I await news telegram.";
        String result = reverseVowels(s);
        System.out.println(result);
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        StringBuilder sb = new StringBuilder(s);
        boolean foundFromFirst = false, foundFromLast = false;
        for (int i = 0, j = s.length() - 1; i < s.length(); ) {
            if (i == s.length() - 1 || j == 0) {
                break;
            }

            if (vowels.contains(s.charAt(i))) {
                foundFromFirst = true;
            } else {
                i++;
            }
            if (vowels.contains(s.charAt(j))) {
                foundFromLast = true;
            } else {
                j--;
            }
            if (foundFromFirst && foundFromLast) {
                char c = s.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, c);
                foundFromFirst = false;
                foundFromLast = false;
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/