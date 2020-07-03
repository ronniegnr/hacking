package bd.com.ronnie.hacking.hacker_rank.alogirithms.sorting.big_sorting;

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
    }

    static String[] bigSorting(String[] unsorted) {
        String[] sorted = new String[unsorted.length];

        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length; j++) {
                if (unsorted[i].length() > unsorted[j].length()) {

                } else if (unsorted[i].length() == unsorted[j].length()) {
                    
                }
            }
        }

        return sorted;
    }
}
