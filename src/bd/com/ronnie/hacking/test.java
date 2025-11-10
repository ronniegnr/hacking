package bd.com.ronnie.hacking;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] hash = new int[26];
        for (char c : "asdf".toCharArray()) {
            hash[c - 'a']++;
        }
        String key = new String(Arrays.toString(hash));

        System.out.println(key);;
    }
 }
