package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.pangrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(theSolution(input));
    }

    static String theSolution(String input) {
        Map<Character, Boolean> charMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (c >= 97 && c <= 122) {
                c -= 32;
            }
            if (c >= 65 && c <= 90) {
                charMap.put(c, true);
            }
        }

        return charMap.size() == 26 ? "pangram" : "not pangram";
    }
}

// https://www.hackerrank.com/challenges/pangrams/problem
