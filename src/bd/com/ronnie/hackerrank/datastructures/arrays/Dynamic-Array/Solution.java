package com.ronniegnr.arrays.dynamicarray;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static int lastAns = 0;
    private static List<List<Integer>> seqList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[][] input = new int[Q][3];
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        seqList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            seqList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < Q; i++) {
            if(input[i][0] == 1) {
                QueryOne(input[i][1], input[i][2], N);
            } else {
                QueryTwo(input[i][1], input[i][2], N);
            }
        }

    }

    private static void QueryOne(int x, int y, int N) {
        seqList.get((x^lastAns) % N).add(y);
    }

    public static void QueryTwo(int x, int y, int N) {
        List<Integer> seq = seqList.get((x^lastAns) % N);
        lastAns = seq.get(y%seq.size());
        System.out.println(lastAns + " ");
    }
}
