package com.codex;

import java.util.*;

public class Solution {
    public static void Test() {
        // TestCase 1
        int[][] testCase1 = {{5, 1, 7}, {1, 1, 9}, {2, 2, 8}};
        int[][] testCase1Output = diagonalDifference(testCase1);
        int testCase1Expected = 15;
        if (testCase1Expected == testCase1Output) {
            System.out.println("Passed TestCase 1");
        } else {
            System.out.println("Failed TestCase 1");
        }

        // TestCase 2
        int[][] testCase2 = {{20, 3}, {5, 19}};
        int[][] testCase2Output = diagonalDifference(testCase2);
        int testCase2Expected = 19;
        if (testCase2Expected == testCase2Output) {
            System.out.println("Passed TestCase 2");
        } else {
            System.out.println("Failed TestCase 2");
        }
    }

    private static int[][] diagonalDifference(int[][] arr) {
        int primaryDiagnol = 0;
        int secondaryDiagnol = 0;
        int matrixSize = arr.length;

        for (int i = 0; i < matrixSize; i++) {
            primaryDiagnol += arr[i][i];
            secondaryDiagnol += arr[i][matrixSize - i - 1];
        }
        return Math.abs(primaryDiagnol - secondaryDiagnol);
    }
}
}