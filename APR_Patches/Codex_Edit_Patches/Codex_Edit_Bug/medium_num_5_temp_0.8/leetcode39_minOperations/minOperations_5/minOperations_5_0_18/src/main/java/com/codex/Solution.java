package com.codex;

import java.util.*;

public class Solution {
    public static boolean check1(int[][] grid, int x) {
        int i = 0;
        while (i < grid.length && grid[i][0] == x) {
            int j = 0;
            while (j < grid[i].length && grid[i][j] == x) {
                j++;
            }
            if (j < grid[i].length) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean check2(int[][] grid, int x) {
        int i = 0;
        while (i < grid[0].length && grid[0][i] == x) {
            int j = 0;
            while (j < grid.length && grid[j][i] == x) {
                j++;
            }
            if (j < grid.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean checkValid(int[][] grid, int x) {
        if (check1(grid, x)) {
            return true;
        }
        if (check2(grid, x)) {
            return true;
        }
        return false;
    }

    public static int minOperations1(int[][] grid, int x) {
        if (!checkValid(grid, x)) {
            return -1;
        }
        int r = 0;
        int c = 0;
        int[][] arr = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] != grid[r][c]) {
                    return -1;
                }
            }
        }
        if (grid[r][c] == x) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}