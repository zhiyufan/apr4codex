package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i * result[0].length + j >= original.length) {
                    return new int[0][0];
                } else {
                    result[i][j] = original[i * result[0].length + j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
         System.out.println(Arrays.deepToString(construct2DArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, 2, 6)));
    }
}