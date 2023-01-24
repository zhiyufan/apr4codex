package com.codex;

import java.util.*;

public class Solution {
public class FindLargestRectangle {
    public static int findLargest(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int cur = findLargestUtil(matrix, i, j);
                if (max < cur) {
                    max = cur;
                }
            }
        }
        return max;
    }
    
    private static int findLargestUtil(int[][] matrix, int i, int j) {
        int cur = 0;
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = 0;
                cur = 1 + findLargestUtil(matrix, i + 1, j)
                        + findLargestUtil(matrix, i, j + 1)
                        + findLargestUtil(matrix, i - 1, j)
                        + findLargestUtil(matrix, i, j - 1);
            }
        }
        return cur;
    }


    public static void main(String[] args) {
        int[][] matrix = { 
                { 0, 1, 0, 1, 1 },
                { 0, 0, 1, 1, 1 },
                { 0, 1, 1, 0, 1 }, };
        System.out.println(findLargest(matrix));
    }
}
}