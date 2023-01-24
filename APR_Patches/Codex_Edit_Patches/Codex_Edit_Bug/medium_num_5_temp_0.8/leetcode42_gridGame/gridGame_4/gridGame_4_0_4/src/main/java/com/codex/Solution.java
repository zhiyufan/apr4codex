package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        int mx = grid[0].length;
        boolean swap = true;
        for (int i = 0; i < mx; i++) {
            if (swap) {
                sum += second[mx - i - 1];
                swap = false;
            } else {
                sum += first[mx - i - 1];
                swap = true;
            }
        }
        return sum;
    }

    
}