package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            int val = grid[i][j];
            if (val < x) {
                count += (x - val) / x + ((x - val) % x == 0 ? 0 : 1);
                grid[i][j] = x;
            } else if (val > x) {
                count += (val - x);
                grid[i][j] = x;
            }
        }
    }
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] != x) {
                return -1;
            }
        }
        return count;
    }

    
}