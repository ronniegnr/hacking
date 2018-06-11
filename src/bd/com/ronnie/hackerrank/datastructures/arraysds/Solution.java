package bd.com.ronnie.hackerrank.datastructures.arraysds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - i - 1] + " ");
        }
    }

}

// https://www.hackerrank.com/challenges/arrays-ds/problem