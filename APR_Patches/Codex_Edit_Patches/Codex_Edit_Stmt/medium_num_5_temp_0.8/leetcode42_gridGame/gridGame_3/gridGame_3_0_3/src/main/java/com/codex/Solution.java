package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        // 这个算法不太好理解，其实是从上往下，分别计算了两个方向的最小值和最大值
        // 利用了动态规划，状态转移方程是 min[i] = grid[0][i] + Math.min(min[i - 1], max[i - 1]);
        // max[i] = grid[1][i] + Math.max(min[i - 1], max[i - 1]);

        // 初始化第一个位置的值
        int[] min = new int[grid[0].length];
        int[] max = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            if (i == 0) {
                min[i] = grid[0][i];
                // 状态转移方程，计算下一个位置的最大值和最小值
                max[i] = grid[1][i];
            } else {
                min[i] = grid[0][i] + Math.min(min[i - 1], max[i - 1]);
                max[i] = grid[1][i] + Math.max(min[i - 1], max[i - 1]);
            }
        }
        // 要求的是最后一个位置的最大值，所以返回的是最后一个位置的最大值的最大值
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]); 
    }

    
}