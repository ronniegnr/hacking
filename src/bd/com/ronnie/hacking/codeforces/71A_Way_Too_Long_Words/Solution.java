
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> strs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = in.next();
            strs.add(input);
        }

        for (String s : strs) {
            if (s.length() > 10) {
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }

    }
}
