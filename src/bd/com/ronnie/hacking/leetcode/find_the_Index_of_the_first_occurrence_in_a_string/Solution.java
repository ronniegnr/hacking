package bd.com.ronnie.hacking.leetcode.find_the_Index_of_the_first_occurrence_in_a_string;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();

        int result = findNeedle(haystack, needle);
        System.out.println(result);
    }

    static int findNeedle(String haystack, String needle) {
        int result = -1;

        int loopLength = haystack.length() - needle.length();

        if (loopLength < 0) {
            return result;
        }


        for (int i = 0; i <= loopLength + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length()) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
