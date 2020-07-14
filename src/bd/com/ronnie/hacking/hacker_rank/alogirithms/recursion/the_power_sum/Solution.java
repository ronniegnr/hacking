package bd.com.ronnie.hacking.hacker_rank.alogirithms.recursion.the_power_sum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(powerSum(X, N));
    }

    static int powerSum(int X, int N) {
        return calc(X, N, 1);
    }

    static int calc(int X, int N, int m) {
        int res = (int) Math.pow(m, N);
        if (res == X) {
            return 1;
        } else if (res > X) {
            return 0;
        } else {
            return calc(X, N, m + 1) + calc(X - res, N, m + 1);
        }
    }
}


// https://www.hackerrank.com/challenges/the-power-sum/problem