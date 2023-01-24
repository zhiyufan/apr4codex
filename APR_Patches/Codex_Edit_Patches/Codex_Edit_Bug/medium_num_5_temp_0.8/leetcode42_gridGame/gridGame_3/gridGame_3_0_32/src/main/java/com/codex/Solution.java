package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid, int[][] min, int[][] max) {
        

        if (grid.length == 0) {
            return 0;
        }
        boolean flag = false;
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i]>= 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return 0;
        }
        for (int i = 0; i < grid[0].length; i++) {
            if (i == 0) {
                min[0][i] = grid[0][i];
                max[0][i] = grid[1][i];
            } else {
                min[0][i] = grid[0][i] + Math.min(min[0][i - 1], max[0][i - 1]);
                max[0][i] = grid[1][i] + Math.max(min[0][i - 1], max[0][i - 1]);
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (j == 0) {
                    min[i][j] = grid[i][j] + Math.min(min[i - 1][j], max[i - 1][j]);
                    max[i][j] = grid[i][j] + Math.max(min[i - 1][j], max[i - 1][j]);
                } else {
                    min[i][j] = grid[i][j] + Math.min(min[i - 1][j], max[i - 1][j]) + Math.min(min[i][j - 1], max[i][j - 1]);
                    max[i][j] = grid[i][j] + Math.max(min[i - 1][j], max[i - 1][j]) + Math.max(min[i][j - 1], max[i][j - 1]);
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(min[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(max[i][j] + " ");
            }
            System.out.println();
        }
        return Math.max(min[grid.length - 1][grid[0].length - 1], max[grid.length - 1][grid[0].length - 1]);
    }
}