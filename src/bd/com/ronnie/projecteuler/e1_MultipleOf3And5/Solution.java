package bd.com.ronnie.projecteuler.e1_MultipleOf3And5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long sum = partialSum(3, n)
                    + partialSum(5, n)
                    - partialSum(15, n);
            System.out.println(sum);
        }
    }

    private static long partialSum(int factor, int n) {
        int numberCount = (n - 1) / factor;
        return (factor * numberCount * (numberCount + 1)) / 2;
    }
}
// test comment

