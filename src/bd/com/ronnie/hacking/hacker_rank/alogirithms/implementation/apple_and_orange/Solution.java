package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.apple_and_orange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s, t;
        s = scanner.nextInt();
        t = scanner.nextInt();

        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();

        List<Integer> apples = new ArrayList<>();
        int resultApples = 0;
        for (int i = 0; i < m; i++) {
            apples.add(scanner.nextInt());
        }

        List<Integer> oranges = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            oranges.add(scanner.nextInt());
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int resultApples = 0;
        for (Integer apple : apples) {
            if(a + apple >= s && a + apple <= t) {
                resultApples++;
            }
        }

        int resultOranges = 0;
        for (Integer orange : oranges) {
            if (b + orange <= t && b + orange >= s) {
                resultOranges++;
            }
        }

        System.out.println(resultApples);
        System.out.println(resultOranges);
    }

}


//https://www.hackerrank.com/challenges/apple-and-orange/problem