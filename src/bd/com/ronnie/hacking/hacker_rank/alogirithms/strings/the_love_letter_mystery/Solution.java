package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.the_love_letter_mystery;

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
        int halfLength = input.length() / 2;
        for (int i = 0; i < halfLength; i++) {
            char a = input.charAt(i);
            char b = input.charAt(input.length() - 1 - i);
            if (a != b) {
                result += Math.abs(Math.subtractExact(a, b));
            }
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem