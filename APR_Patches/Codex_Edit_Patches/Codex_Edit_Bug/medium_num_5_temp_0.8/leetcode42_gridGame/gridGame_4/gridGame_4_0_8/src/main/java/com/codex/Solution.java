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
        boolean swap = true;
        int last = grid[0].length - 1;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += second[last - i];
                swap = false;
            } else {
                sum += first[last - i];
                swap = true;
            }
        }
        return sum;
    }

    
}