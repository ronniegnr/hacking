package bd.com.ronnie.hacking.leetcode.jewels_and_stones;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jewels = scanner.nextLine();
        String stones = scanner.nextLine();
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (c == stones.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}
