package bd.com.ronnie.hacking.leetcode.first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = firstUniqChar(s);
        System.out.println(result);
    }

    public static int firstUniqChar(String s) {
        int result = -1;

        Map<Character, Integer> ciMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (ciMap.containsKey(c)) {
                ciMap.put(c, -1);
            } else {
                ciMap.put(c, i);
            }
        }

        for (Character key : ciMap.keySet()) {
            if (ciMap.get(key) != -1) {
                result = ciMap.get(key);
                break;
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/first-unique-character-in-a-string