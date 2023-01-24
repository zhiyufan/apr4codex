package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] result = construct2DArray(testArray, 3, 4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
    }

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

    
}