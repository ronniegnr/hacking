package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.between_two_sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }

        System.out.println(getTotalX(a, b));

        scanner.close();
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        Collections.sort(a);
        Collections.sort(b);

        for (int i = a.get(0); i <= b.get(b.size() - 1); i++) {
            boolean isOK = true;
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) != 0) {
                    isOK = false;
                    break;
                }
            }
            if(!isOK) {
                continue;
            }
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) % i != 0) {
                    isOK = false;
                    break;
                }
            }
            if (isOK) {
                result++;
            }
        }

        return result;
    }
}

// https://www.hackerrank.com/challenges/between-two-sets/problem