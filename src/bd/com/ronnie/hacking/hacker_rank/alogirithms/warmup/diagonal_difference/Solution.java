package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.diagonal_difference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<List<Integer>> theLst = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> lst = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                lst.add(scanner.nextInt());
            }
            theLst.add(lst);
        }
        System.out.println(theSolution(theLst));
    }

    static int theSolution(List<List<Integer>> theLst) {
        int result = 0;
        int size = theLst.size();
        for (int i = 0; i < size; i++) {
            List<Integer> lst = theLst.get(i);
            result += (lst.get(i) - lst.get(size - 1 - i));
        }
        return Math.abs(result);
    }
}

// https://www.hackerrank.com/challenges/diagonal-difference/problem
