package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = grid[0];
        int[] second = grid[1];
        Arrays.sort(first);       
        Arrays.sort(second);       
        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += second[grid[0].length - i - 1];
                swap = false;
            } else {
                sum += first[grid[0].length - i - 1];
                swap = true;
            }
        }
        return sum;
    }

    
}