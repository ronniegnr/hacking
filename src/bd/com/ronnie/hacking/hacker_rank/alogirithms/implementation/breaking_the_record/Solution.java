package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.breaking_the_record;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scoreCount = scanner.nextInt();
        int[] scores = new int[scoreCount];
        for (int i = 0; i < scoreCount; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] result = theSolution(scores);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] theSolution(int[] scores) {
        int min = scores[0], max = scores[0];
        int minCount = 0, maxCount = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score < min) {
                min = score;
                minCount++;
            } else if (score > max) {
                max = score;
                maxCount++;
            }
        }
        return new int[]{maxCount, minCount};
    }
}

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

