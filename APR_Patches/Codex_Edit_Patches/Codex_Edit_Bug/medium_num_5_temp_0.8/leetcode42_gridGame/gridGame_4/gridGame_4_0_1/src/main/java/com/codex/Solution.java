package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = grid[0];
        int[] second = grid[1];
        boolean swapped = true;
        for (int i = 0; i < second.length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        for (int i = 0; i < second.length; i++)
            if (second[i] > first[0]) {
                swapped = false;
                break;
            }
        if (swapped)
            for (int i = 0; i < second.length; i++)
                second[i] = grid[1][i];
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