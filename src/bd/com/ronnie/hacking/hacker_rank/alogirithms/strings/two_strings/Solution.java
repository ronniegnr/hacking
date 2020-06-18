package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.two_strings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String input1 = scanner.next();
            String input2 = scanner.next();
            System.out.println(theSolution(input1, input2));
        }
    }

    private static String theSolution(String input1, String input2) {
        String result = "NO";

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char i = 97; i < 123; i++) {
            if (input1.indexOf(i) != -1) {
                arr1[i - 97] = 1;
            }
            if (input2.indexOf(i) != -1) {
                arr2[i - 97] = 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] == 1 && arr2[i] == 1) {
                return "YES";
            }
        }

        return result;
    }

}

// https://www.hackerrank.com/challenges/two-strings/problem
