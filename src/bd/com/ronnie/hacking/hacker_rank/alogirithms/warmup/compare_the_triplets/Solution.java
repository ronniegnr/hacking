package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.compare_the_triplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }
        List<Integer> result = compareTriplets(a, b);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer alicePoint = 0;
        Integer bobPoint = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alicePoint++;
            } else if (b.get(i) > a.get(i)) {
                bobPoint++;
            }
        }
        return Arrays.asList(alicePoint, bobPoint);
    }

}

// https://www.hackerrank.com/challenges/compare-the-triplets/problem
