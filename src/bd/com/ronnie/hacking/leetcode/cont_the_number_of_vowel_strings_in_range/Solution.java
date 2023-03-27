package bd.com.ronnie.hacking.leetcode.cont_the_number_of_vowel_strings_in_range;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int result = vowelStrings(new String[]{"hey","aeo","mu","ooo","artro"}, 1, 4);
        System.out.println(result);
    }

    public static int vowelStrings(String[] words, int left, int right) {
        List<Character> chars = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if(chars.contains(word.charAt(0))
            && chars.contains(word.charAt(word.length()-1))) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range
