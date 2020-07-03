package bd.com.ronnie.hacking.hacker_rank.java.strings.java_substring;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = start; i < end; i++) {
            System.out.print(S.charAt(i));
        }
    }
}
