package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {       
        
        int[] line1 = new int[grid[0].length];
        int[] line2 = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            line1[i] = grid[0][i];
            line2[i] = grid[1][i];
        }
        Arrays.sort(line1);
        Arrays.sort(line2);

        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += line2[grid[0].length - i - 1];
                swap = false;
            } else {
                sum += line1[grid[0].length - i - 1];
                swap = true;
            }
        }
        return sum;
    }

    
}