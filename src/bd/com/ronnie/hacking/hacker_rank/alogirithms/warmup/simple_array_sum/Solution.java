package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.simple_array_sum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(theSolution(arr));
    }

    static int theSolution(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

}

// https://www.hackerrank.com/challenges/simple-array-sum/problem
