package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.divisible_sum_pairs;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        System.out.println(divisibleSumPairs(n, k, ar));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }

}


// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem