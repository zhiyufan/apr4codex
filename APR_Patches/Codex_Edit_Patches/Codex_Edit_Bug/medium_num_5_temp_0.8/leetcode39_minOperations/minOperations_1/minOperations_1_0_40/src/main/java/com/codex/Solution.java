package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max - min == 0) {
            return 0;
        }
        if (max - min < x) {
            return -1;
        }
        if (min <= x - max) {
            return -1;
        }
        int target = 0;
        if ((max - min) % x == 0) {
            target = max - (max - min) / x * x;
        } else {
            target = max - (max - min) / x * x - x;
        }
        int ans = 0;
        int[] count = new int[x + 1];
        for (int i = 0; i < x + 1; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                count[grid[i][j]]++;
            }
        }
        for (int i = 0; i < target; i++) {
            ans += count[i];
        }
        for (int i = target + x; i < count.length; i++) {
            ans += count[i];
        }
        ans += (target + x - max) / x * (grid.length * grid[0].length);
        for (int i = target + x; i > max; i -= x) {
            if (count[i] != 0) {
                ans += count[i];
            }
        }
        return ans;
    }

    
}