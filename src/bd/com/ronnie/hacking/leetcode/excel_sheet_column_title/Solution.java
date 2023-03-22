package bd.com.ronnie.hacking.leetcode.excel_sheet_column_title;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columnNumber = scanner.nextInt();
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            int rem = (columnNumber - 1) % 26;
            result.append((char) ('A' + rem));
            columnNumber = (columnNumber-1) / 26;
        }

        return result.reverse().toString();
    }
}

// https://leetcode.com/problems/excel-sheet-column-title/