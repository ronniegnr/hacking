package bd.com.ronnie.projecteuler.e1_MultipleOf3And5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        long sum;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            n = n - 1; 

            long start = System.nanoTime();

            sum = partialSum(3, n / 3) + partialSum(5, n / 5) - partialSum(15, n / 15);
            long end = System.nanoTime();
            long executionTime = end - start;
            System.out.println("Execution time: " + executionTime + "ns");

            System.out.println(sum);;
        }

    }

    static long partialSum(int factor, long numberCount) {
        return (factor * numberCount * (numberCount + 1)) / 2;
    }
}
