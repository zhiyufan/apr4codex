package com.codex;

import java.util.*;

public class Solution {
    // Given a grid consists of non-negative integers of size n * m. 
    // You can perform an operation to rotate a column, the value of the 
    // top cells in the column is added to the tail one by one.
    // The number of operations is given and you should find the value of the 
    // top left cell after a given number of operations.
    // n, m are positive integers
    // n <= 10^3 m <= 10^3
    // 1 <= x <= 10^9
    
    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {

                // The element should be multiplied by x up till its equal to x
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {

                // The element should be divided by x up till its equal to x
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