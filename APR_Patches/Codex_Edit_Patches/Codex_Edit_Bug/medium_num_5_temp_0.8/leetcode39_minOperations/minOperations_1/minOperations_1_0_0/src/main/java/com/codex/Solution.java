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
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < target) {
                    result += (target - grid[i][j]) / x;
                }
            }
        }
        return result;
    }

//     public static int minOperations(int grid[][], int x) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int maxx = grid[0][0], minn = grid[0][0];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 maxx = Math.max(maxx, grid[i][j]);
//                 minn = Math.min(minn, grid[i][j]);
//             }
//         }
//         if (maxx - minn == 0) return 0;
//         if (x < maxx - minn) return -1;
//         int res = 0, cnt = 0, temp = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (grid[i][j] == maxx) cnt++;
//                 else temp += (maxx - grid[i][j]) / x;
//             }
//         }
//         if (cnt == 0) return -1;
//         else {
//             if (temp % cnt == 0) res += temp / cnt;
//             else res += temp / cnt + 1;
//         }
//         return res;
//     }
}