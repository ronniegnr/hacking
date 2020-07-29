package bd.com.ronnie.hacking.hacker_rank.alogirithms.implementation.grading_students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < inputCount; i++) {
            grades.add(scanner.nextInt());
        }

        List<Integer> results = gradingStudents(grades);
        results.forEach(System.out::println);
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade < 38) {
                results.add(grade);
            } else {
                int fraction = grade % 5;
                if (fraction > 2) {
                    results.add(grade + (5 - grade % 5));
                } else {
                    results.add(grade);
                }
            }
        }
        return results;
    }
}

// https://www.hackerrank.com/challenges/grading/problem
