package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        if (grid[0][0] == x) {
            return 0;
        }
        int count = 0;
        count += grid[0][0] - x;
        grid[0][0] = x;
        int temp = 0;
        while (temp < grid.length) {
            temp++;
            count++;
        }
        temp = 0;
        while (temp < grid[0].length) {
            temp++;
            count++;
        }
        grid[grid.length - 1][grid[0].length - 1] = x;
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