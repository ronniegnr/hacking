package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.migratory_birds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        /*for (int i = 0; i < inputCount; i++) {
            arr.add(scanner.nextInt());
        }*/

        arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
//        arr = Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 4);
        System.out.println(migratoryBirds(arr));
    }

    private static Integer migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);

        int highestCount = 1;
        int intHighestCount = 1;
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int currentNumber = arr.get(i);
            if (arr.get(i - 1).equals(arr.get(i))) {
                intHighestCount++;
                if (intHighestCount > highestCount) {
                    highestCount = intHighestCount;
                    result = arr.get(i);
                }
            } else {
                intHighestCount = 1;
            }
        }

        return result;
    }
}

// https://www.hackerrank.com/challenges/migratory-birds/problem