package com.codex;

import java.util.*;

public class Solution {
     public static long gridGame(int[][] grid) {
        

        
        long[] min = new long[grid[0].length];
        long[] max = new long[grid[0].length];
        long result = 0;
        long[] sum = new long[grid[0].length];
        long maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            
                sum[i] = grid[0][i] + grid[1][i];
                maxSum = Math.max(maxSum, sum[i]);
            
            System.out.println(maxSum);
        }



        return maxSum;
    }

    
}