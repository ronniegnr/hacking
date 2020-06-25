package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.staircase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        theSolution(n);
    }

    static void theSolution(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}

// https://www.hackerrank.com/challenges/staircase/problem
