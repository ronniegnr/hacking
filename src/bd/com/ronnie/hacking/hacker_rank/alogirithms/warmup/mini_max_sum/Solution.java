package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.mini_max_sum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        theSolution(arr);
    }

    static void theSolution(int[] arr) {
        int max = 0, min = Integer.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }

        System.out.print((sum - max) + " " + (sum - min));
    }
}

// https://www.hackerrank.com/challenges/mini-max-sum/problem
