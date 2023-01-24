package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
        }
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] != x) {
                    return -1;
                }
            }
        }
        return count;
    }
}