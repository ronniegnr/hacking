package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.caesar_cipher;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String input = scanner.next();
        int rotation = scanner.nextInt();
        System.out.println(caesarCipher(input, rotation));
    }

    static String caesarCipher(String input, int rotation) {
        String result = "";
        char newChar;

        for (char c : input.toCharArray()) {
            newChar = c;
            if (c >= 65 && c <= 90) {
                newChar = (char) (c + rotation);
                while (newChar > 90) {
                    newChar -= 26;
                }
            } else if (c >= 97 && c <= 122) {
                newChar = (char) (c + rotation);
                while (newChar > 122) {
                    newChar -= 26;
                }
            }
            result += newChar;
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/caesar-cipher-1/problem
