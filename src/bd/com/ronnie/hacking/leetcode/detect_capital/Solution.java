package bd.com.ronnie.hacking.leetcode.detect_capital;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean result = detectCapitalUse(word);
        System.out.println(result);
    }

    public static boolean detectCapitalUse(String word) {
        int length = word.length();
        boolean result = true;


        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            if (length > 1) {
                char c = word.charAt(1);
                if (c >= 65 && c <= 90) { // all capital case
                    for (int i = 2; i < length; i++) {
                        char d = word.charAt(i);
                        if (!(d >= 65 && d <= 90)) {
                            result = false;
                            break;
                        }
                    }
                } else { // first letter capital, rest lower case
                    for (int i = 2; i < length; i++) {
                        char d = word.charAt(i);
                        if (!(d >= 97 && d <= 122)) {
                            result = false;
                            break;
                        }
                    }
                }
            }
        } else { // all lower case
            for (int i = 1; i < length; i++) {
                char c = word.charAt(i);
                if (!(c >= 97 && c <= 122)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/detect-capital/