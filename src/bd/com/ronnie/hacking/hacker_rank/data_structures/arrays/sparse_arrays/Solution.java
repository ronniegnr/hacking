package bd.com.ronnie.hacking.hackerrank.data_structures.arrays.sparse_arrays;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        int q = scanner.nextInt();
        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
            queries[i] = scanner.next();
        }

        int[] results = new int[q];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                if (queries[i].equals(strings[j])){
                    results[i]++;
                }
            }
        }

        for (int result : results) {
            System.out.println(result);
        }

    }

}

// https://www.hackerrank.com/challenges/sparse-arrays/problem
