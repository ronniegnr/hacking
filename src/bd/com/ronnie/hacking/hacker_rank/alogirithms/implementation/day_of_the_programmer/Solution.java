package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.day_of_the_programmer;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.println(dayOfProgrammer(y));
    }

    static String dayOfProgrammer(int year) {
        String result = "";

        if (year < 1918) {
            if (year % 4 == 0) {
                result =  "12.09." + year;
            } else {
                result = "13.09." + year;
            }
        } else if (year > 1918) {
            if ((year % 400 == 0)
                    | (year % 4 == 0 && year % 100 != 0)) {
                result = "12.09." + year;
            } else {
                result =  "13.09." + year;
            }

        } else if (year == 1918) {
            result = "26.09.1918";
        }

        return result;
    }

}

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
