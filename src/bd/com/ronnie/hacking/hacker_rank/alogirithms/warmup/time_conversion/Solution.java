package bd.com.ronnie.hacking.hacker_rank.alogirithms.warmup.time_conversion;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPM = input.charAt(8) == 'P';
        int hour = Integer.parseInt(input.substring(0, 2));

        if (isPM &&hour < 12) {
            hour += 12;
        } else if (!isPM && hour > 11) {
            hour -= 12;
        }

        String hourString = hour < 10 ? "0" + hour : hour + "";
        System.out.println(hourString + input.substring(2, 8));

        scanner.close();
    }

}

// https://www.hackerrank.com/challenges/time-conversion/problem