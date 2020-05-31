package bd.com.ronnie.hacking.hacker_rank.alogirithms.strings.weighted_uniform_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int testCount = scanner.nextInt();
        int[] queries = new int[testCount];
        for (int i = 0; i < testCount; i++) {
            queries[i] = scanner.nextInt();
        }

        System.out.println(weightedUniformStrings(input, queries));
    }

    static String[] weightedUniformStrings(String s, int[] queries) {
        List<Integer> queriesL = new ArrayList<>();
        List<String> results = new ArrayList<>();
        for (int query : queries) {
            queriesL.add(query);
            results.add("No");
        }

        for (int i = 0, j = 0; i < s.length(); ) {
            if (s.charAt(i) == s.charAt(j)) {
                int weight = (s.charAt(i) - 96) * (i - j + 1);
                if (queriesL.contains(weight)) {
                    results.set(queriesL.indexOf(weight), "Yes");
                }
                i++;
            } else {
                j++;
            }
        }

        String[] resultsS = new String[queries.length];
        for (int i = 0; i < results.size(); i++) {
            resultsS[i] = results.get(i);
        }

        return resultsS;
    }
}

// https://www.hackerrank.com/challenges/weighted-uniform-string/problem
