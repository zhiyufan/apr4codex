package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        /** You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.
         * A uni-value grid is a grid where all the elements of it are equal.
         * Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.
         */
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max - min == 0) {
            return 0;
        }
        if (max - min < x) {
            return -1;
        }
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < target) {
                    result += (target - grid[i][j]) / x;
                }
            }
        }
        return result;
    }

    }