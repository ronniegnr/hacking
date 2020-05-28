package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.super_reduced_string;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
//        System.out.println(superReducedString(input));
        System.out.println(solution(input));
    }

    // submitted solution
    static String superReducedString(String s) {
        String result = s, input;
        do {
            input = result;
            result = reduceString(input);
        } while (input.length() != result.length());
        return result.length() > 0 ? result : "Empty String";
    }

    static String reduceString(String input) {
        String result = "";
        int i = 0, j = 1;
        for (; i < input.length(); i++, j++) {
            if (i >= input.length() - 1) {
                break;
            }

            if (input.charAt(i) != input.charAt(j)) {
                result += input.charAt(i);
            } else {
                i++;
                j++;
            }
        }

        if (i == input.length() - 1) {
            result += input.charAt(j - 1);
        }
        return result;
    }

    // alternative solution
    static String solution(String input) {
        String result = input;
        while (true) {
            boolean rotate = false;
            for (char c = 'a'; c < 'z'; c++) {
                String check = "" + c + c;
                int index = result.indexOf(check);
                if (index >= 0) {
                    result = result.substring(0, index) + result.substring(index + 2);
                    rotate = true;
                }
            }
            if (!rotate) {
                break;
            }
        }
        return result.length() > 0 ? result : "Empty String";
    }

}

//  https://www.hackerrank.com/challenges/reduced-string/problem