package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.funny_string;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testRun = scanner.nextInt();
        for (int i = 0; i < testRun; i++) {
            String input = scanner.next();
            System.out.println(theSolution(input));
        }
    }

    static String theSolution(String input) {
        String result = "Funny";
        for (int i = 0, j = input.length() - 1; i < input.length() - 1; i++, j--) {
            if (Math.abs(input.charAt(i) - input.charAt(i + 1)) != Math.abs(input.charAt(j) - input.charAt(j - 1))) {
                return "Not Funny";
            }
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/funny-string/problem