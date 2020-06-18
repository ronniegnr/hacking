package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.kangaroo;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, v1, x2, v2;
        x1 = scanner.nextInt();
        v1 = scanner.nextInt();
        x2 = scanner.nextInt();
        v2 = scanner.nextInt();

        System.out.println(theSolution(x1, v1, x2, v2));
    }

    static String theSolution(int x1, int v1, int x2, int v2) {
        String result = "NO";
        long prevDff = Math.abs(Math.subtractExact(x1, x2));
        long curDff = prevDff;

        int t = 1;
        while (curDff <= prevDff) {
            long nx1 = x1 + t * v1;
            long nx2 = x2 + t * v2;
            if (nx1 == nx2) {
                result = "YES";
                break;
            }
            prevDff = curDff;
            curDff = Math.abs(Math.subtractExact(nx1, nx2));
            t++;
        }

        return result;
    }

}

// https://www.hackerrank.com/challenges/kangaroo/problem
