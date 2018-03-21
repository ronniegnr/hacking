package bd.com.ronnie.projecteuler.e2_EvenFibonacciNumbers;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long sum = sumOfEvenFibonacci(n);
            System.out.println(sum);
        }
    }

    private static long sumOfEvenFibonacci(long n) {
        if (n < 2) {
            return 0;
        }
        long f6 = 0, f3 = 2, sum = 2;
        while (true) {
            long f9 = (4 * f3) + f6;
            if (f9 > n) {
                break;
            }
            f6 = f3;
            f3 = f9;
            sum += f3;
        }
        return sum;
    }
}
