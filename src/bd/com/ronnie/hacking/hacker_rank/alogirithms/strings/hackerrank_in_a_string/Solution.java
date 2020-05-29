package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.hackerrank_in_a_string;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String input = scanner.next();
            System.out.println(theSolution(input));
        }
    }

    static String theSolution(String input) {
        String testString = "hackerrank";
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == testString.charAt(j)) {
                j++;
                if (j == testString.length()) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem