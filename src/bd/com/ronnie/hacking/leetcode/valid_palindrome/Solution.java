package bd.com.ronnie.hacking.leetcode.valid_palindrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        int length = s.length();

        StringBuilder sb = new StringBuilder();
        // cleanup the string
        for (int i = 0, j = 0; i < length; i++) {
            char c = s.charAt(i);
            if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                sb.append(c);
            } else if (c > 64 && c < 91) {
                sb.append((char) (c + 32));
            }
        }

        String st = sb.toString();
        int stLength = st.length();
        for (int i = 0, j = stLength - 1; i < stLength / 2; i++, j--) {
            if (st.charAt(i) != st.charAt(j)) {
                result = false;
                break;
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/valid-palindrome/