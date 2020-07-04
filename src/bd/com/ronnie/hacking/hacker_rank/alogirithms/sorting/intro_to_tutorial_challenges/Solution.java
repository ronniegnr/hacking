package bd.com.ronnie.hacking.hacker_rank.alogirithms.sorting.intro_to_tutorial_challenges;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int V = scanner.nextInt();
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(theSolution(V, arr));
    }

    static int theSolution(int V, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (V == arr[i]) {
                return i;
            }
        }
        return 0;
    }

}

// https://www.hackerrank.com/challenges/tutorial-intro/problem
