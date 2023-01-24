package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
            grid[0][0] = x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                
                if (grid[i][j] > x) {
                    count += grid[i][j] - x;
                    grid[i][j] = x;
                } else if (grid[i][j] < x) {
                    count += (x - grid[i][j]) / x + ((x - grid[i][j]) % x == 0 ? 0 : 1);
                    grid[i][j] = x;
                } else {
                    grid[i][j] = x;
                }   
            }
        }
        return count;
    }



    public static int minOperations(int[][] grid, int x) {
            int count = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] > x) {
                    count += grid[i][j] - x;
                    grid[i][j] = x;
                    } else if(grid[i][j] < x) {
                        count += (x - grid[i][j]) / x + ((x - grid[i][j]) % x == 0 ? 0: 1);
                        grid[i][j] = x;
                    }
                }
            }
            return count;
        }
    
}