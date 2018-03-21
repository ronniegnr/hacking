package bd.com.ronnie.hackerrank.datastructures.arrays.sparsearrays;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arrString = new String[n];
        for(int i=0; i<n; i++) {
            arrString[i] = scanner.next();
        }
    
        int q = scanner.nextInt();
        String strQuery;
        int[] result = new int[q];
        int count=0;
        for(int i=0; i<q; i++) {
            strQuery = scanner.next();
            for(int j=0; j<n; j++) {
                if(strQuery.equals(arrString[j])) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }

        for(int i=0; i<q; i++) {
            System.out.println(result[i]);
        }

    }
}
