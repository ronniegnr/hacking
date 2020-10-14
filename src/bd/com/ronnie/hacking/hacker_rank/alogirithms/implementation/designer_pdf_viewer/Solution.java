package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.designer_pdf_viewer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] h = new int[200];
        for (int i = 0; i < 26; i++) {
            h[i] = scanner.nextInt();
        }

        String word = scanner.next();

        /*h = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";*/

        System.out.println(designerPdfViewer(h, word));
    }

    static int designerPdfViewer(int[] h, String word) {
        List<Integer> heights = new ArrayList<>();
        char[] word_chars = word.toCharArray();
        for (char word_char : word_chars) {
            heights.add(h[word_char - 97]);
        }
        return Collections.max(heights) * word_chars.length;
    }

}

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem