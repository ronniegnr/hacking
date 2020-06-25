package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.a_very_big_sum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();
        long[] numberArray = new long[numberCount];
        for (int i = 0; i < numberCount; i++) {
            numberArray[i] = scanner.nextLong();
        }
        System.out.println(theSolution(numberArray));
    }

    static long theSolution(long[] numberArray) {
        long result = 0;
        for (int i = 0; i < numberArray.length; i++) {
            result += numberArray[i];
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/a-very-big-sum/problem
