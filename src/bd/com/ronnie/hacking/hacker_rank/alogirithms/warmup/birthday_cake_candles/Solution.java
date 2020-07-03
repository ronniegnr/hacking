package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.birthday_cake_candles;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candleCount = scanner.nextInt();
        int[] ar = new int[candleCount];
        for (int i = 0; i < candleCount; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.println(theSolution(ar));
    }

    static int theSolution(int[] ar) {
        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                maxCount = 1;
            } else if (ar[i] == max) {
                maxCount++;
            }
        }

        return maxCount;
    }
}

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem