package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid, int k) {
        

        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        Arrays.sort(second);
        int start = 0;
        int end = k - 1;
        int sum = 0; 
        int i = 0;
        while (start < k && end >= 0) {
            if (first[i] > second[k-i-1]) {
                sum += first[i];
                start++;
            }
            else {
                sum += second[k-i-1];
                end--;
            }
            
        }
        return sum;
    }

    
}