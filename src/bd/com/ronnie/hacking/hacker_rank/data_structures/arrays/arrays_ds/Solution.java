package bd.com.ronnie.hacking.hackerrank.data_structures.arrays.arrays_ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.stream(arr)
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(item -> System.out.print(item + " "));

        scanner.close();
    }

}

// https://www.hackerrank.com/challenges/arrays-ds/problem