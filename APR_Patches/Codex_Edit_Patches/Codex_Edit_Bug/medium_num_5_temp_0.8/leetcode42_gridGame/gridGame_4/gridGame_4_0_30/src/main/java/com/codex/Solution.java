package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length]; // declare two arrays to store the first and second row of the grid
        int[] second = new int[grid[0].length]; // first is the second row and second is the second row
        for (int i = 0; i < grid[0].length; i++) // intialize the first array with the first row of the grid
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++) // intialize the second array with the second row of the grid
            second[i] = grid[1][i];
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