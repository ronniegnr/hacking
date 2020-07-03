package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.gemstones;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        String[] arr = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            arr[i] = scanner.next();
        }
        System.out.println(gemstones(arr));
    }

    static int gemstones(String[] arr) {
        int result = 0;
        boolean[][] data = new boolean[26][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                data[arr[i].charAt(j) - 97][i] = true;
            }
        }


        for (int i = 0; i < 26; i++) {
            int j = 0;
            for (; j < arr.length; j++) {
                if (!data[i][j]) {
                    break;
                }
            }
            if (j == arr.length) {
                result++;
            }
        }

        return result;
    }
}


// https://www.hackerrank.com/challenges/gem-stones/problem