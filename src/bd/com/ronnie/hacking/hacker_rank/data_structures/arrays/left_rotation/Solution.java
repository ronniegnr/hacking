package bd.com.ronnie.hacking.hacker_rank.data_structures.arrays.left_rotation;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = d, j = 0; j < n; i++, j++) {
            if (i == n) {
                i = 0;
            }
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

}
