package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        for (int i = 0; i < m; i++)
            rowSum[i] = 0;
        for (int j = 0; j < n; j++)
            colSum[j] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int temp = 0;
                for (int k = 0; k < m; k++)
                    temp += rowSum[k];
                temp -= rowSum[i];
                for (int k = 0; k < n; k++)
                    temp += colSum[k];
                temp -= colSum[j];
                temp -= grid[i][j];
                
                if (temp > max)
                    max = temp;
        }

        return max;
    }


}