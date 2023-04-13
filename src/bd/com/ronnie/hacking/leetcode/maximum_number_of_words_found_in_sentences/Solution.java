package bd.com.ronnie.hacking.leetcode.maximum_number_of_words_found_in_sentences;

public class Solution {
    public static void main(String[] args) {
        String[] sentences = new String[]{
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };
        int result = mostWordsFound(sentences);
        System.out.println(result);
    }

    public static int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String sentence : sentences) {
            int subResult = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 32) {
                    subResult++;
                }
            }
            subResult++;
            if (subResult > result) {
                result = subResult;
            }
        }
        return result;
    }
}
