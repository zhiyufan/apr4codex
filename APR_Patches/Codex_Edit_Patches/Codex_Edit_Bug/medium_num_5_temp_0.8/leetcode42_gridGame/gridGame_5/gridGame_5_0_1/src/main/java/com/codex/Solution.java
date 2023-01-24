package com.codex;

import java.util.*;

public class Solution {
    // Complete the gridGame function below.
    public static long gridGame(int[][] grid) {
        int n = grid.length;
        int[][] table = new int[n][n];
        int[][] moves = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        for(int i = 0; i < n; i++) {
            for (int j=0;j < n; j++) {
                table[i][j] = 1;
            }
        }
        for(int i = 0; i < n; i++) {
            for (int j=0;j < n; j++) {
                if (grid[i][j] == 1) {
                    for(int[] move : moves) {
                        int nextRow = i + move[0];
                        int nextCol = j + move[1];
                        if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n) {
                            table[nextRow][nextCol] = 1;
                        }
                    }
                }
            }
        }
        
        return calcMaxSumofRow(table);
    }
    private static int calcMaxSumofRow(int[][] table) {
        int maxSum = 0;
        for(int i = 0; i < table.length; i++) {
            int tSum = 0;
            for (int j=0;j < table.length; j++) {
                tSum += table[i][j];
            }
            if (tSum > maxSum) {
                maxSum = tSum;
            }
        }
        return maxSum;
     }

    
}