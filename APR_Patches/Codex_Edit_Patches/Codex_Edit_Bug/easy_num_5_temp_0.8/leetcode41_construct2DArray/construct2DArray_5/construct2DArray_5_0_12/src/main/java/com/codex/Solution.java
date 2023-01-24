package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        

        int[][] result = new int[m][n];
        //Write your solutions here
        if(m * n > original.length) {
            return new int[0][0];
        }

        int row = 0;
        int col = 0;
        for(int i = 0; i < original.length; i++) {
            if(row < m) {
                if(col < n) {
                    result[row][col] = original[i];
                    col++;
                } else {
                    row++;
                    col = 0;
                    result[row][col] = original[i];
                    col++;
                }

            }
        }
        return result;
    }

    
}