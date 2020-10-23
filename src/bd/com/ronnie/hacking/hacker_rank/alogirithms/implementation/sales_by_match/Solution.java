package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.sales_by_match;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        /*int n = 4;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};*/
        System.out.println(sockMerchant(n, ar));
    }

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i : ar) {
            int value = numberMap.get(i) == null ? 0 : numberMap.get(i);
            if (value + 1 == 2) {
                result++;
                numberMap.put(i, 0);
            } else {
                numberMap.put(i, 1);
            }
        }
        return result;
    }

}

// https://www.hackerrank.com/challenges/sock-merchant/problem
