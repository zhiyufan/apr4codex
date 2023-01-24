package com.codex;

import java.util.*;

public class Solution {

    // https://leetcode.com/problems/minimum-operations-to-make-r-x-c-equal-to-a-given-target/
    public int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] > x) {
                    numberOfOperations += (x - grid[i][j]);
                } else {
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x;
                }
            }
        }
        return numberOfOperations;
    }

    
}