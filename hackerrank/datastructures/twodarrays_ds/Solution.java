package bd.com.ronnie.hackerrank.datastructures.twodarrays_ds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int hourGlassSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                      arr[i+1][j+1] +
                          arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                hourGlassSum = Integer.max(hourGlassSum, sum);
            }
        }

        System.out.println(hourGlassSum);
    }

}

// https://www.hackerrank.com/challenges/2d-array/problem
