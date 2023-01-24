package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        int moves = 0;
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }
 public int getMaximumGold(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, dfs(grid, i, j, m, n, 0));
                }
            }
        }
        return max;
    }
    
    private int dfs(int[][] grid, int x, int y, int m, int n, int sum) {
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return sum;
        }
        int temp = grid[x][y];
        grid[x][y] = 0;
        int max = sum + temp;
        max = Math.max(max, dfs(grid, x - 1, y, m, n, sum + temp));
        max = Math.max(max, dfs(grid, x + 1, y, m, n, sum + temp));
        max = Math.max(max, dfs(grid, x, y - 1, m, n, sum + temp));
        max = Math.max(max, dfs(grid, x, y + 1, m, n, sum + temp));
        grid[x][y] = temp;
        return max;
    }




        return moves;
    }

    
}