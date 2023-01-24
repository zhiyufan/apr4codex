package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {


        int[] min = new int[grid[0].length];
        int[] max = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            max[i + 1] = Math.max(grid[0][i] + max[i], grid[1][i] + min[i]);
            min[i + 1] = Math.min(grid[0][i] + min[i], grid[1][i] + max[i]);
        }
        return Math.max(min[grid[0].length], max[grid[0].length]);
    }
}