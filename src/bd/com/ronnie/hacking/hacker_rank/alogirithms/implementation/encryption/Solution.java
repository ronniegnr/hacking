package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.encryption;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(encryption(input));
    }

    static String encryption(String s) {
        String result = "";
        s = s.replaceAll("\\s+", "");
        int length = s.length();
        double root = Math.sqrt(length);

        int row = (int) Math.floor(root);
        int column = (int) Math.ceil(root);

        while (row * column < length) {
            if (row < column) {
                row++;
            } else {
                column++;
            }
        }

        for (int i = 0; i < column; i++) {
            String str = "";
            for (int j = 0; j < row; j++) {
                try {
                    str += s.charAt(i + j * column);
                } catch (Exception e) {}
            }
            result += str + " ";
        }
        return result;
    }
}

// https://www.hackerrank.com/challenges/encryption/problem
