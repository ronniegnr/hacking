package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.two_characters;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String input = scanner.next();
        System.out.println(theSolution(input));
    }

    static int theSolution(String input) {
        if (input.length() == 1) {
            return 0;
        }

        int maxLength = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                char firstChar = (char) ('a' + i);
                char secondChar = (char) ('a' + j);
                char lastChar = '\u0000';
                int curLength = 0;
                boolean isAltering = true;
                for (char c : input.toCharArray()) {
                    if (c == firstChar || c == secondChar) {
                        if (c == lastChar) {
                            isAltering = false;
                            break;
                        } else {
                            curLength++;
                            lastChar = c;
                        }
                    }
                }
                if(isAltering) {
                    maxLength = Math.max(maxLength, curLength);
                }
            }
        }
        return maxLength;
    }
}

// https://www.hackerrank.com/challenges/two-characters/problem
