package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minOperations(int[][] grid, int x) {
        int rows = grid.length;
        int cols = grid[0].length;
        int end = rows * cols - x + 1;
        int operations = 0;
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int cell = i * cols + j;
                if (grid[i][j] < x) {
                    operations += (x - grid[i][j]) / x;
                } else if (grid[i][j] > x) {
                    if ((grid[i][j] - x) % x != 0) return -1;
                    operations += (grid[i][j] - x) / x;
                } else {
                    operations += find(visited, end, cell, 0);
                }
            }
        }
        return numberOfOperations;
    }

    
}