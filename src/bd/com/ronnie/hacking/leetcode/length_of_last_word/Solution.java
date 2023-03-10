package bd.com.ronnie.hacking.leetcode.length_of_last_word;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        // clean the trailing spaces, if any
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }

        // counting the last word length
        int j = i;
        for (; j >= 0; j--) {
            if (s.charAt(j) == ' ') {
                break;
            }
        }

        return i - j;
    }
}
