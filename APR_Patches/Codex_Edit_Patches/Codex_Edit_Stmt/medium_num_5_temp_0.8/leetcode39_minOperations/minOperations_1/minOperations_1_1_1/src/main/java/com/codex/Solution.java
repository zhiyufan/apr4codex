package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            min = Math.min(min, grid[i][j]);
            max = Math.max(max, grid[i][j]);
        }
        return result;
    }

    
}