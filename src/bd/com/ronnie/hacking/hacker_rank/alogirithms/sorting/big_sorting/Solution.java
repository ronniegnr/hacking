package bd.com.ronnie.hacking.hacker_rank.alogirithms.sorting.big_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] unsorted = new String[length];
        for (int i = 0; i < length; i++) {
            unsorted[i] = scanner.next();
        }

        String[] sorted = bigSorting(unsorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (str1, str2) -> {
            if (str1.length() != str2.length()) {
                return str1.length() - str2.length();
            } else {
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) != str2.charAt(j)) {
                        return str1.charAt(j) - str2.charAt(j);
                    }
                }
            }
            return 0;
        });
        return unsorted;
    }


    // this got TLE for 2 test cases
    static String[] bigSorting0(String[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[i].length() > unsorted[j].length()) {
                    String temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                } else if (unsorted[i].length() == unsorted[j].length()) {
                    for (int k = 0; k < unsorted[i].length(); k++) {
                        int a = unsorted[i].charAt(k);
                        int b = unsorted[j].charAt(k);
                        if (a == b) {
                            continue;
                        } else if (a > b) {
                            String temp = unsorted[i];
                            unsorted[i] = unsorted[j];
                            unsorted[j] = temp;
                        }
                        break;
                    }
                }
            }
        }
        return unsorted;
    }

}

// https://www.hackerrank.com/challenges/big-sorting/problem
