package bd.com.ronnie.hacking.leetcode.group_anagams;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] strs = {"eat", "tea"};
//        String[] strs = {"tan", "ate", "nat"};

        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("A")) {
                continue;
            }
            int[] countA = new int[26];
            for (char c : strs[i].toCharArray()) {
                countA[c - 'a']++;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[j].equals("A")) {
                    continue;
                }
                int[] countB = new int[26];
                for (char c : strs[j].toCharArray()) {
                    countB[c - 'a']++;
                }
                boolean toAdd = true;
                for (int k = 0; k < 26; k++) {
                    if (countA[k] != countB[k]) {
                        toAdd = false;
                        break;
                    }
                }
                if (toAdd) {
                    list.add(strs[j]);
                    strs[j] = "A";
                }
            }
            result.add(list);
        }

        return result;
    }

}
