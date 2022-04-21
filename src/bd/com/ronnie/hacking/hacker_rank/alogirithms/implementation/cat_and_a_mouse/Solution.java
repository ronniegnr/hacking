package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.cat_and_a_mouse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            int z = Integer.parseInt(inputs[2]);

            System.out.println(catAndMouse(x, y, z));
        }
    }

    static String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(x - z);
        int catBDistance = Math.abs(y - z);

        if (catADistance < catBDistance) {
            return "Cat A";
        } else if (catBDistance < catADistance) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
