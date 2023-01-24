package com.codex;

import java.util.*;

public class Solution {
    /// <summary>
    /// Takes a grid made up of x and y coordinates and a number x and returns the number
    /// of operations needed to convert all elements of the grid to x.
    /// </summary>
    /// <param name="grid"></param>
    /// <param name="x"></param>
    /// <returns></returns>
    public static int minOperations(int[][] grid, int x) {
        if (x == 0) return -1;

        int numberOfOperations = 0;
                if (grid[i][j] < 0 || grid[i][j] < x) return -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {
                    if ((x - grid[i][j]) % x != 0) return -1;
                    numberOfOperations += (x - grid[i][j]) / x;
                } else {
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x;
                }
            }
        }
        return numberOfOperations;
    }
}