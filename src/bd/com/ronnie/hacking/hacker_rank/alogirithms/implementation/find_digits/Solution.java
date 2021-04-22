package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.find_digits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(findDigits(n));;
        }

    }

    static int findDigits(int n) {
        String s = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            try {
                result += (n % Character.getNumericValue(s.charAt(i))) == 0 ? 1 : 0;
            } catch (ArithmeticException arithmeticException) {
                continue;
            }
        }
        return result;
    }
}
