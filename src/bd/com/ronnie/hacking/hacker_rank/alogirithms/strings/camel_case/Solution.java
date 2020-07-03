package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.camel_case;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(camelcase(input));
    }

    static int camelcase(String s) {
        int result = 1;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                result++;
            }
        }
        return result;
    }



}

//  https://www.hackerrank.com/challenges/camelcase/problem