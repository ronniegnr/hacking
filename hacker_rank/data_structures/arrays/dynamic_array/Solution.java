package bd.com.ronnie.hackerrank.datastructures.dynamicarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastAnswer = 0;
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }

        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int seq = (x ^ lastAnswer) % n;
            List<Integer> currentList = lists.get(seq);
            if (query == 1) {
                currentList.add(y);
            } else {
                lastAnswer = currentList.get(y % currentList.size());
                System.out.println(lastAnswer);
            }
        }

        scanner.close();
    }

}

// https://www.hackerrank.com/challenges/dynamic-array/problem
