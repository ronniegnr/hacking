package bd.com.ronnie.hacking.leetcode.longest_common_prefix;

public class Solution {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[] strs = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            strs[i] = scanner.nextLine();
        }*/

        String[] strs = new String[] {
            "flower", "fow", "flo"
        } ;


        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char c;
        boolean isAdd;

        for (int i = 0; ; i++) {
            try {
                c = strs[0].charAt(i);
                isAdd = true;
                for (int j = 1; j < strs.length; j++) {
                    if (c != strs[j].charAt(i)) {
                        isAdd = false;
                        break;
                    }
                }
                if (isAdd) {
                    sb.append(c);
                } else {
                    break;
                }
            } catch (Exception exception) {
                break;
            }
        }

        return sb.toString();


    }
}

// https://leetcode.com/problems/longest-common-prefix/