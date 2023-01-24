package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int sum = 0;
        Arrays.sort(grid[0]);
        Arrays.sort(grid[1]);
        for(int i=0; i<grid[0].length; i++)
        {
            if(grid[0][i] < grid[1][i]) {
                sum += grid[0][i];
            }
            else {
                sum += grid[1][i];
            }
        }
        return sum;
    }
}