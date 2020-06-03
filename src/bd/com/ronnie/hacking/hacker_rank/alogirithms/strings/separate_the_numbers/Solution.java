package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.separate_the_numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        for (int i = 0; i < testCount; i++) {
            String input = scanner.next();
            System.out.println(theSolution(input));
        }
    }

    static String theSolution(String input) {
        String result = "NO";

        int i = 1;
        while (i < input.length() - 1) {
            String firstString = input.substring(0, i);

            BigInteger firstNumber = new BigInteger(firstString);
            BigInteger nextNumber = firstNumber;
            int j = i;
            while (j < input.length()) {
                nextNumber = nextNumber.add(BigInteger.valueOf(1L));
                int end = j + nextNumber.toString().length();
                if (end > input.length()) {
                    break;
                }
                String nextString = input.substring(j, end);
                if (!nextNumber.equals(new BigInteger(nextString))) {
                    break;
                } else {
                    j = j + nextString.length();
                }
            }
            if (j >= input.length()) {
                return "YES " + firstNumber;
            }
            i++;
        }

        return result;
    }
}

// https://www.hackerrank.com/challenges/separate-the-numbers/problem

