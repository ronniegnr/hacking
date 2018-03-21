package bd.com.ronnie.hackerrank.datastructures.arrays.twodarrays;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int hourglassSum[] = new int[16];
        int k = 0;
        int highestSum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                hourglassSum[k] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                highestSum = Integer.max(highestSum, hourglassSum[k++]);
            }
        }

        System.out.println(highestSum);
    }

}
