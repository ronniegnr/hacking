package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.alternating_characters;

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

    static int theSolution(String input) {
        int result = 0;
        if (input.length() == 1) {
            return 0;
        }
        for (int i = 1, j = 0; i < input.length(); i++, j++) {
            if (input.charAt(i) == input.charAt(j)) {
                result++;
            }
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/alternating-characters/problem