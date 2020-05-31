package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.mars_exploration;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(theSolution(input));
    }

    static int theSolution(String input) {
        int result = 0;
        for (int i = 0; i < input.length();) {
            if (input.charAt(i++) != 'S') {
                result++;
            }
            if (input.charAt(i++) != 'O') {
                result++;
            }
            if(input.charAt(i++) != 'S') {
                result++;
            }
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/mars-exploration/problem
