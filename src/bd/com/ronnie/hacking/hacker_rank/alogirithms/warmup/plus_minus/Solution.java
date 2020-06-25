package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.plus_minus;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] arr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            arr[i] = scanner.nextInt();
        }
        theSolution(arr);
    }

    static void theSolution(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }
        zeroCount = arr.length - (positiveCount + negativeCount);

        System.out.println(positiveCount / arr.length);
        System.out.println(negativeCount / arr.length);
        System.out.println(zeroCount / arr.length);
    }
}

// https://www.hackerrank.com/challenges/plus-minus/problem
